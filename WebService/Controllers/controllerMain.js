//==CONTROLLER======
//--uSER---
//--lOGIN---
$(document).on("click") , "#btnLogin",function()
{
	var result = isValidFormLogin();//use client - model
	
	if(result=="true"){
		$("#formLogin").submit();
	}
	else{
		$("#divStsMsgLogin").html(result);
	}
}

//==CLIENT - MODEL===
//USER==

function isValidFormLogin(){
	if($.trim($("txtUsername").val())=="")
		{
		return "Enter Username";
		}
	if($.trim($("#txtPassword").val())=="")
		{
		return "Enter Password";
		}
	return "true";
}

//--items---
//---save/update

$(document).on("click","#btnSave",function()
		{
			var result = isValidFormItem();
			if(result=="true")
				{
				$("#formItems").submit();
				}
			else
				{
				$("#divStsMsgItem").html(result);
				}
		});

//--edit---
$(document).on("click","#btnEdit",function()
		{
		$("#hidmode").val("update");
		$("#hidID").val($(this).attr("param"));
		$("#tstItemName").val($(this).closest("tr").find('td:eq(1)').text());
		$("#tstItemDesc").val($(this).closest("tr").find('td:eq(2)').text());
		});

//---remove---

$(document).on("click","#btnRemove",function()
{
	$("#hidMode").val("remove");
	$("#hidId").val($(this).attr("param"));
	var res = confirm("are you sure");
	
	if(res==true)
{
		$("#formItems").submit();
		}	
	});
