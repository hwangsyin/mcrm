$(init);

function init() {
	$("#menuItemAddCustomer")[0].onclick = onClickMenuItemAddCustomer;
}

function onClickMenuItemAddCustomer(event) {
	var containerId = "res";
	var url = $(event.target).attr("href");
	$("#container").attr("src", url);
	//getData(url, containerId, afterLoadAddCustomerUI);

	return false;
}

function afterLoadAddCustomerUI() {
	$("#addCustomerButton")[0].onclick = onClickAddCustomerButton;
}

function getData(url, containerId, callback) {
	var xhr = new XMLHttpRequest();
	var jqContainer = $("#" + containerId);
	
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			jqContainer.html(xhr.responseText);
			if (callback) {
				callback();
			}
		}
	}
	
	xhr.open("get", url);
	xhr.send();
}

function onClickAddCustomerButton(event) {
	var form = document.forms["customer"];
	
	var data;
	data = "title=";
	data += form["title"].value;
	data += "&phone=";
	data += form["phone"].value;
	data += "&name=";
	data += form["name"].value;
	data += "&gender=";
	data += form["gender"].value;
	data += "&age=";
	data += form["age"].value;
	data += "&email=";
	data += form["email"].value;
	data += "&address=";
	data += form["address"].value;
	data += "&type=";
	data += form["type"].value;
	data += "&position=";
	data += form["position"].value;
	data += "&startTime=";
	data += form["startTime"].value;
	
	alert(data);
	
}