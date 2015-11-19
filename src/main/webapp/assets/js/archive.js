$(document).ready(function() {

	getArchivesAjax = function(title) {
		$.ajax({
			url : '/blog/archives/search?title=' + title,
			type : 'GET',
			dataType : "json", // Accepts
			contentType : 'application/json', // Sends
			success : function(entries) {
				var htmlResult = "<ul>";

				$.each(entries, function(index, entry) {
					htmlResult += "<li>";
					htmlResult += entry.createdDate;
					htmlResult += " — ";
					htmlResult += "<a href='entries/" + entry.id + "'>";
					htmlResult += entry.title + "</a>";
					htmlResult += "</li>";
				});
				htmlResult += "</ul>";

				$('#archives').html(htmlResult);
			},
			error : function(exception) {
				console.log("Error when calling Restful");
			}
		});
	}

	getArchivesAjax("");
});
