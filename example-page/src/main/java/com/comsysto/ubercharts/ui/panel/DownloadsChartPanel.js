function columnChartUpdateFunction () {
    var series = this.series;
    var xAxis=this.xAxis[0]

    function columnChartUpdate(seriesData,dataname){
        for(i=0;i<series.length;i++){
            if(series[i].name.toUpperCase()==dataname){
                series[i].setData(seriesData,true)
            }
        }

    }

    function columnChartCategoriesUpdate(categoriesData,dataname){
        if(xAxis.options.categories != categoriesData){
            xAxis.setCategories(categoriesData,true);
        }
    }

    Wicket.Event.subscribe("/websocket/open", function(jqEvent) {
        // show the initial state of the chart
    });

    Wicket.Event.subscribe("/websocket/message", function(jqEvent, message) {
        // new record is pushed by the server
        var record = jQuery.parseJSON(message);
        if (record) {
            if(record.type == '${messageType}'){
                columnChartUpdate(record.data, record.dataName);
            }
            if(record.type == '${messageSeriesType}'){
                columnChartCategoriesUpdate(record.data, record.dataName);
            }
        }

    });
}