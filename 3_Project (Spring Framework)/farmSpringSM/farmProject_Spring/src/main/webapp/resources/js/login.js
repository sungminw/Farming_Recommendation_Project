if(message != null){
	swal({
	    title: "WYC",
	    text: message,
	    icon: "info" //"info,success,warning,error" 중 택1
	}).then(() => {
        if (sessionId != null) {
            window.location.href = "index.do";
        }
    });
}