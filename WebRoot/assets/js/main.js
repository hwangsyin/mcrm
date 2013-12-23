function init() {
	$(".mi-c").each(function (index) {
		this.onclick = onClickMenuItem;
	});
}

$(init);

function onClickMenuItem(event) {
	var url = $(event.target).attr("href");
	var method = "get";
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			$("#res").html(xhr.responseText);
		}
	}
	xhr.open(method, url);
	xhr.send();
	
	return false;
}
