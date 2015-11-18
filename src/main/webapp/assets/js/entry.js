$(document).ready(function() {
	tinymce
	.init({
		selector : '#content',
		content_css : "../../assets/css/content.css",
		theme : "modern",
		height : 350,
		plugins : [
				"advlist autolink link image lists charmap print preview hr anchor pagebreak spellchecker",
				"searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking",
				"save table contextmenu directionality emoticons template paste textcolor" ],
		toolbar : "insertfile undo redo | styleselect | bold italic | fontselect | fontsizeselect | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image | print preview media fullpage | forecolor backcolor emoticons",
		fontsize_formats : "8pt 10pt 12pt 14pt 18pt 24pt 36pt"
	});
});