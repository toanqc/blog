<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script>
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
</script>

<div class="entry-container">
	<div class="title">Create new entry</div>
	<div>
		<table>
			<tr>
				<td width="50px"><label>Title *</label></td>
				<td><input type="text" id="title"></td>
			</tr>
			<tr>
				<td colspan="2"><textarea id="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" class="center">
					<button class="button">Post</button>
					<button class="button">Cancel</button>
				</td>
			</tr>
		</table>
	</div>
</div>