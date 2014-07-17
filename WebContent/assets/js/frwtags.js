$(function() {

	$(".content-sys").on("click", ".window", validateWindow);
	$(".footer-sys").on("click", ".window", validateWindow);
	
	$( ".close-button" ).click(function( event ) {
		 $(this).getParent().getParent().remove();
	});
	
});

var MESSAGE_STR = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
var MESSAGE_INFO    = "MessageInfo";
var MESSAGE_WARNING = "MessageWarning";
var MESSAGE_ERROR   = "MessageError";

var MAXIMIZED = "maximized";
var MINIMIZED = "minimized";
var NORMAL = "normal";

function validateWindow() {

	var window = $(this);	
	
	if (window.attr("state") == NORMAL) {
		var group = $.makeArray($(".content .window")).sort(function(a,b) {
			return (parseInt($(a).css("zIndex"),10) || 0) - (parseInt($(b).css("zIndex"),10) || 0);
		});
		if (!group.length) { return; }
		
		var min = parseInt(group[0].style.zIndex) || 0;
		$(group).each(function(i) {
			this.style.zIndex = min + i;
		});
	
		window.css("z-index", min + group.length);
	} else if ($(this).attr("state") == MINIMIZED) {
		
		window.removeClass("window-minimized");
		window.attr("state", NORMAL);
		window.appendTo(".content-sys");
		
	}
}

function showWindow(path) {
	$.ajax({
		url: path,
		success: function (data) {
			var window = $(data);			
			$(".content-sys").append(window);
			windowEvents(window);
		}
	});	
}

function windowEvents( window ) {
	window.attr("state", NORMAL);
	
	window.keyup(function(e){
		if (e.keyCode == 27) {
			$(this).remove();
		}
	});
	
	window.draggable({ handle: ".header", stack: ".window",
			start: function(event) {
		    	if ($(this).attr("state") != NORMAL) {
		    		event.preventDefault();
		    	}
	        }, 
		    drag: function(event) {
		    	if ($(this).attr("state") != NORMAL) {
		    		event.preventDefault();
		    	}
		    },
            containment: '.content-sys'
	});
	
	window.resizable({ grid: 10 });
	
	window.find(".header, .ui-resizable-handle").mouseup(function( event ) {
		window.focus();
	});
	
	window.find(".header").dblclick(function( event ) {
		$(this).find(".maximize-button").click();
   	});
	
	window.find(".close-button").click(function( event ) {
		$(this).parent().parent().remove();
   	});
	
	window.find(".maximize-button").click(function( event ) {
		var window = $(this).parent().parent();
		
		if (window.attr("state") == NORMAL) {
			window.addClass("window-maximized");
			window.attr("state", MAXIMIZED);
		} else {
			window.removeClass("window-maximized");
			window.attr("state", NORMAL);
		}
   	});
	
	window.find(".minimize-button").click(function( event ) {
		var window = $(this).parent().parent();
		window.removeClass("window-maximized");
		window.addClass("window-minimized");
		window.attr("state", MINIMIZED);
		
		window.detach().appendTo(".footer-sys");
   	});
	
	window.find(".help-button").click(function( event ) {
		alert("help");
   	});
	
	window.focus();
}

function setModal(showModal) {
	if (showModal) {
		$("#modal").css("display","block");
	} else {
		$("#modal").css("display","none");		
	}
}

