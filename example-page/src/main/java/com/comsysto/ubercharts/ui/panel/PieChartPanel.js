function eventFunnelChartUpdateFunction () {
    var totalOrdersSeries = this.series;

    function eventFunnelChartChartUpdate(seriesData){
        totalOrdersSeries[0].setData(seriesData,true);
    }

    Wicket.Event.subscribe("/websocket/open", function(jqEvent) {
        // show the initial state of the chart
    });

    Wicket.Event.subscribe("/websocket/message", function(jqEvent, message){
        // new record is pushed by the server
        var record = jQuery.parseJSON(message);

        if(record.type == '${messageType}'){
            mixedSeriesData = [];
            for (var key in record.data) {
                var item = [];
                item.push(key,record.data[key]);
                mixedSeriesData.push(item);
            }
            eventFunnelChartChartUpdate(mixedSeriesData);
         }

    });
}