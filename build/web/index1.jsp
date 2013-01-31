<%--
    Document   : index
    Created on : 24 Feb, 2012, 1:27:55 PM
    Author     : amu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <link href="css/enhancedCodeForVariousTags.css" type="text/css" rel="stylesheet"/>
    </head>

    <body bgcolor=black >
        <%
                    String errorCode = "0";

                    if (request.getParameter("error") != null) {
                        errorCode = request.getParameter("error");
                    }
                    if (errorCode.equals("1")) {
        %>
        <div style="background-color: darksalmon">Login Failed.</div>
        <%              } else if (errorCode.equals("2")) {
        %>
        <div style="background-color: red;color: white">Please Login.</div>
        <%                }

        %>

        <form name="frmLogin" action="welcome.jsp" method="POST" >
            <table border="0" cellpadding="2" >
                <tbody>

                    <tr>
                        <td><font color="white">Username :</font></td>
                        <td><input style="background-color: white" type="text" name="txtUserName" value="" size="17" class="decoratedButton" /></td>
                    </tr>

                    <tr>
                        <td><font color="white">Password :</font></td>
                        <td><input style="background-color: white" type="password" name="txtPassword" value="" size="17" class="decoratedButton"/></td>
                    </tr>

                    <tr>
                        <td colspan="2">
                            &nbsp;
                        </td>
                    </tr>

                    <tr align="center">
                        <td colspan="2" class="spnButtons">
                            <span><input style="color: white" type="submit" name="btnLogin" value="Login" size="12" class="decoratedButton"/></span>
                            <span><input style="color: white"  type="reset" name="btnReset" value="Reset" size="12" class="decoratedButton" /></span>
                        </td>
                    </tr>

                </tbody>
            </table>

            <a href="register.jsp"><font color="yellow">New User?</font></a>
        </form>
    </body>
</html>
