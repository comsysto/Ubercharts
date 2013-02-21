package com.comsysto.ubercharts.ui.socket;

/**
 * Created with IntelliJ IDEA.
 * User: alentolj
 * Date: 20.02.13
 * Time: 17:56
 * To change this template use File | Settings | File Templates.
 */

import org.apache.wicket.Application;
import org.apache.wicket.protocol.ws.api.IWebSocketConnection;
import org.apache.wicket.protocol.ws.api.IWebSocketConnectionRegistry;
import org.apache.wicket.protocol.ws.api.SimpleWebSocketConnectionRegistry;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * A task that sends data to the client by pushing it to the web socket connection
 */
public abstract class UpdateTask implements Runnable {
    /**
     * The following fields are needed to be able to lookup the IWebSocketConnection from
     * SimpleWebSocketConnectionRegistry
     */
    private final String applicationName;
    private final String sessionId;

    private final int pageId;

    protected UpdateTask(Application application, String sessionId, int pageId) {
        this.applicationName = application.getName();
        this.sessionId = sessionId;
        this.pageId = pageId;
    }

    @Override
    public void run() {
        IWebSocketConnectionRegistry webSocketConnectionRegistry = new SimpleWebSocketConnectionRegistry();

        while (true) {
            Application application = Application.get(applicationName);
            IWebSocketConnection connection = webSocketConnectionRegistry.getConnection(application, sessionId, pageId);
            if (connection == null || !connection.isOpen()) {
                // stp if the web socket connection is closed
                return;
            }

            try {
                updateFunction(connection);

                // sleep for a while to simulate work
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception x) {
                x.printStackTrace();
                return;
            }
        }
    }

    protected abstract void updateFunction(IWebSocketConnection connection) throws IOException;
}