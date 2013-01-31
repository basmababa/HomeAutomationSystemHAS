function showDeviceForm(device){
    try
    {
        //     var divLight=document.getElementById("divLight")
        //     var divTv=document.getElementById("divTv");
        //     var divCamera=document.getElementById("divCamera");
        //     var divCdPlayer=document.getElementById("divCdPlayer");
        //     var divDevices=document.getElementById("divDevices");

        //    divDevices.style.display="none";
        $("#divDevices").hide("slow");
        $(".divDeviceForms").hide("slow");
        switch (device) {

            case "light":
                $("#divLight").show("slow");
                //            divLight.style.display="";
                //            divTv.style.display="none";
                //            divCamera.style.display="none";
                //            divCdPlayer.style.display="none";
                break;

            case "tv":
                $("#divTv").show("slow");
                //            divLight.style.display="none";
                //            divTv.style.display="";
                //            divCamera.style.display="none";
                //            divCdPlayer.style.display="none";
                break;

            case "camera":
                $("#divCamera").show("slow");
                //            divLight.style.display="none";
                //            divTv.style.display="none";
                //            divCamera.style.display="";
                //            divCdPlayer.style.display="none";
                break;

            case "cdplayer":
                $("#divCdPlayer").show("slow");
                //            divLight.style.display="none";
                //            divTv.style.display="none";
                //            divCamera.style.display="none";
                //            divCdPlayer.style.display="";
                break;

            default:
                $("#divDevices").show("slow");
                //            divLight.style.display="none";
                //            divTv.style.display="none";
                //            divCamera.style.display="none";
                //            divCdPlayer.style.display="none";
                //            divDevices.style.display="";
                break;

        }
    }
    catch(e)
    {
        alert("Error in show devices.\nError : "+e);
    }
}



function showDeviceList()
{
    try {

        $("#divDevices").toggle("slow");

    } catch (e) {
        alert(e);
    }



}

function setTVOnOff()
{
    
    try {
        var tvOnOffStatus=$("#btnTvOnOff").val();
        var setStatus=0;

        setStatus= tvOnOffStatus=="ON"?1:0;


        $.ajax({
         type: "POST",
        url: "asyncDeviceOperations",
        data:"device=tv&act=onoff&onoffstatus="+setStatus,
        async:true,
           success: function(response){

               if(response==1)
                   $("#btnTvOnOff").val("OFF");
               else
                   $("#btnTvOnOff").val("ON");

            }
        });
    } catch (e) {
        alert("error in set tv on off.\nerror : "+e);

    }
    XMLHttpRequest();

}
