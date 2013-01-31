<%--
    Document   : welcome
    Created on : 24 Feb, 2012, 3:24:21 PM
    Author     : amu
--%>

<%@page import="java.awt.Frame"%>
<%@page import="utilities.ClsCookieUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">-->
<!DOCTYPE HTML>


<%
            ClsCookieUtil objCookie = new ClsCookieUtil();
            String cookieName = "ckusr";
            String myCookie = objCookie.getCookieValue(cookieName, request);
            if (myCookie == null) {

                response.sendRedirect("index.jsp?error=2");

            }

%>

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <script  src="js/jquery.min.js" type="text/javascript" language="javascript"></script>
        <script  src="js/deviceOperations.js" type="text/javascript" language="javascript"></script>
        <link href="css/deviceUserInterface.css" type="text/css" rel="stylesheet"/>
        <link href="css/enhancedCodeForVariousTags.css" type="text/css" rel="stylesheet">
    </head>
    <body bgcolor="black">

        <table class="tblTop">

            <tr>
                <td class="wordFont">
                    <span>Welcome</span>
                    <span>|</span>
                    <span class="wordSize"><%=myCookie%></span>
                </td>
                <td align="right">
                    <input type="button" onclick="showDeviceForm('Home')" value="HOME" class="divRightText"/>
                    <a href="index.jsp" ><font color="white">logout</font></a>
                </td>
            </tr>


        </table>

        <input style="color: white" type="button" value="SHOW DEVICES" onclick="showDeviceList()" class="decoratedButton"/>


        <div id="divDevices" style="display: none">
            <ul>
                <li><a href="javascript:void(0)" onclick="javascript:showDeviceForm('tv')" style="color: white"><font color="orange">TV</font></a></li>
                <li><a href="javascript:void(0)" onclick="javascript:showDeviceForm('camera')" style="color: white"><font color="orange">CAMERA</font></a></li>
                <li><a href="javascript:void(0)" onclick="javascript:showDeviceForm('cdplayer')" style="color: white"><font color="orange">CD PLAYER</font></a></li>
            </ul>
        </div>

        <div id="divTv" class="divDeviceForms" style="display: none"> TV<br/>
            <input type="button" value="ON" name="btnTvOnOff" id="btnTvOnOff" onclick="javascript: setTVOnOff()">
        </div>

        <br/>

        <div   id="divCamera" class="divDeviceForms" style="display: none"> CAMERA <br/>
            <input type="button" onclick="window.location.href='camera?act=on'" value="ON" name="btnCameraOn" id="btnCameraOn">
            <input type="button" onclick="window.location.href='camera?act=off'" value="OFF" name="btnLightOff" id="btnCameraOff">
            <input type="button" onclick="window.location.href='capture.jsp'" value="CAPTURE" name="btnLightoNOff" id="btnCameraOnOff">
        </div>

        <br/>

        <div   id="divCdPlayer" class="divDeviceForms" style="display: none"> CDPlayer <br/>
            <input type="button" onclick="window.location.href='tv?act=on'" value="ON" name="btnCdPlayerOn" id="btnCdPlayerOn">
            <input type="button" onclick="window.location.href='tv?act=off'" value="OFF" name="btnCdPlayerOff" id="btnCdPlayerOff">
        </div>

        <br/>

    </body>
</html>
