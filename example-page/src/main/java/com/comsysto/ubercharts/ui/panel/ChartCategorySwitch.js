function productSwitchUpdate (event) {

    var selected = this.index;
    var allSeries = this.chart.series;

    $.each(allSeries, function(index, series) {
        if(selected == index ){
            series.show() ;
            var message='{"type":"'+'${messageType}'+'","dataName":"'+series.name+'"}'
            Wicket.WebSocket.send(message);
        }else{
               series.hide();
             }
         });
    return false;
    }

