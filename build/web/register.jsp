<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link href="css/enhancedCodeForVariousTags.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body bgcolor="black">
        <form name="frmRegister" action="registerServlet" method="POST" >
            <table border="0">

                <tbody>
                    <tr>
                        <td><font color="yellow">Desired username : </font></td>
                        <td><input style="background-color: yellow" type="text" name="txtUserName" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td><font color="yellow">Desired Password :</font></td>
                        <td><input style="background-color: yellow" type="password" name="txtPassword" value="" size="20"/></td>
                    </tr>
                    <tr>
                        <td><font color="yellow"> Name: </font></td>
                        <td><input style="background-color: yellow" type="text" name="txtName" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td><font color="yellow"> Surname: </font></td>
                        <td><input style="background-color: yellow" type="text" name="txtSurname" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td><font color="yellow"> Address: </font></td>
                        <td><input style="background-color: yellow" type="text" name="txtAddress" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td><font color="yellow"> phone: </font></td>
                        <td><input style="background-color: yellow" type="text" name="txtPhone" value="" size="20" /></td>
                    </tr>



                    <tr>
                        <td><input type="submit" name="btnRegister" value="Register" class="decoratedButton"/></td>
                        <td><input type="reset" name="btnReset" value="reset" class="decoratedButton"/></td>
                    </tr>
                </tbody>
            </table>

              <a href="index.jsp">existing user?</a>
        </form>

    </body>
</html>



          