/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validate()
{
    var username=$("#username").val();
    var password=$("#password").val();
    var status=true;
    if(username=="")
    {
        
        $("#username").after("<span id='error1'>Username Reqd!</span>")
        $("#error1").css("color","red");
        status= false;
    }
    if(password=="")
    {
        
        $("#password").after("<span id='error2'>Password Reqd!</span>")
        $("#error2").css("color","red");
        status= false;
    }
    $("#error1").fadeOut(4000);
    $("#error2").fadeOut(4000);
    return status;
}

