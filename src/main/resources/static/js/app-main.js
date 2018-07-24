$("#usertype").change(function(){
	if($(this).val()==0) {//admin
		$("#jobResponsibilityDesc, #adminAccessCode").closest(".form-group").show();
		$("#dateOfBirth").closest(".form-group").hide();
	} else {//normal
		$("#jobResponsibilityDesc, #adminAccessCode").closest(".form-group").hide();
		$("#dateOfBirth").closest(".form-group").show();
	}
});

$("#add-User-form").ready(function(){
	$("#jobResponsibilityDesc, #adminAccessCode").closest(".form-group").show();
	$("#dateOfBirth").closest(".form-group").hide();
});