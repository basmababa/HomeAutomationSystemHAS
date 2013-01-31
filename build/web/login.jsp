<%@page import="utilities.ClsCookieUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%

            Connection conn = null;
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "ha";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "amruta";

            try {

                String strUserName = "";
                String strPassword = "";

                if (request.getParameter("txtUserName") != null) {
                    strUserName = request.getParameter("txtUserName");
                }
                if (request.getParameter("txtPassword") != null) {
                    strPassword = request.getParameter("txtPassword");
                }


                Class.forName(driver).newInstance();
                conn = DriverManager.getConnection(url + dbName, userName, password);


                Statement stmt = conn.createStatement();
                String sql = "select * from user";
                ResultSet rs = stmt.executeQuery(sql);

                boolean isLogin = false;

                while (rs.next()) {
                    if (strUserName.equals(rs.getString("username")) && strPassword.equals(rs.getString("password"))) {
                        isLogin = true;
                        break;
                    }
                }

                ClsCookieUtil objCookie = new ClsCookieUtil();
                String cookieName = "ckusr";
                objCookie.deletCookie(cookieName, request);


                if (isLogin == true) {
                    objCookie.createCookie("ckusr", strUserName, response);
                    response.sendRedirect("welcome.jsp");
                }
            } catch (Exception e) {
                throw e;


            } finally {
                conn.close();

            }
%>