
function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else { 
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {
    alert("Latitude: " + position.coords.latitude + 
    	    "<br>Longitude: " + position.coords.longitude);
}

$(document).ready(function(){
	// variable buat button
	var $btnCalculate = $('#calculate');
	var $btnStart = $('#start');
	var $btnEnd = $('#end');
	var $btnCoordinate = $('#coordinate');
	
	
	// event saat button diclick
	var event = {
			calculate: function(){alert("calculate.");},
			start: function(){
				//remove start to id 1
				$("#100").remove();
				
				$("#1").replaceWith("<td id=\"1\" class=\"map-tile\" data-status=\"begin\"></td>");
			},
			end: function(){alert("end.");},
			searchCoordinate: function(){
				getLocation();
			}
	};
	
	var main = {
			init: function(){
				alert("This is called from init.");
				this.bind();
				
			},
			
			bind: function(){
				$btnCalculate.click(event.calculate);
				$btnStart.click(event.start);
				$btnEnd.click(event.end);
				$btnCoordinate.click(event.searchCoordinate);
			}
	};
	
	// method init, pertama dieksekusi
	main.init();
	
})