/**
 * this is the Common file for template
 */

$(function(){
		$(".sidebar-link").click(function(){ 
			
			$(".iframe-container iframe").attr("src", $(this).attr("goto") );
		});



});
