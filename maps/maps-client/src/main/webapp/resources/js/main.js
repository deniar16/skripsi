
function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else {
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {
    document.getElementById('longitude').value = position.coords.longitude;
    document.getElementById('latitude').value = position.coords.latitude;

}

$(document).ready(function () {
    // variable buat button
    var $btnCalculate = $('#calculate');
    var $btnStart = $('#start');
    var $btnEnd = $('#end');
    var $btnCoordinate = $('#coordinate');


    // event saat button diclick
    var event = {
        calculate: function () {
            alert("calculate.");
        },
        start: function () {
            //remove start to id 1
            $("#100").remove();

            $("#1").replaceWith("<td id=\"1\" class=\"map-tile\" data-status=\"begin\"></td>");
        },
        end: function () {
            alert("end.");
        },
        searchCoordinate: function () {
            //getLocation();
            if (navigator.geolocation) { //check geolocation available 
                //try to get user current location using getCurrentPosition() method
                console.log("Browser support geolocation!");

                navigator.geolocation.getCurrentPosition(function (position) {
                    console.log("ini udah masuk!");

                    console.log(position.coords.latitude);
                    console.log(position.coords.longitude);
                    var $url = "http://localhost:8080/maps-server/rest/get_current_location";
                    var mapLocation = {
                        latitude: position.coords.latitude,
                        longitude: position.coords.longitude
                    };
                    $.ajax({
                        type: "POST",
                        contentType : 'application/json; charset=utf-8',
                        dataType: "json",
                        url: $url,
                        data: JSON.stringify(mapLocation),
                        success: function (data) {
                            alert(data);
                        }

                    });
                });
            } else {
                console.log("Browser doesn't support geolocation!");
            }

        }
    };

    var main = {
        init: function () {
            alert("This is called from init.");
            this.bind();

        },
        bind: function () {
            $btnCalculate.click(event.calculate);
            $btnStart.click(event.start);
            $btnEnd.click(event.end);
            $btnCoordinate.click(event.searchCoordinate);
        }
    };

    // method init, pertama dieksekusi
    main.init();

})