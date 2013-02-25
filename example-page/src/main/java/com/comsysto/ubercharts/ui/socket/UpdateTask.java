package com.comsysto.ubercharts.ui.socket;

import org.apache.wicket.Application;
import org.apache.wicket.protocol.ws.api.IWebSocketConnection;
import org.apache.wicket.protocol.ws.api.IWebSocketConnectionRegistry;
import org.apache.wicket.protocol.ws.api.SimpleWebSocketConnectionRegistry;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * User: alentolj
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
                // stop if the web socket connection is closed
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