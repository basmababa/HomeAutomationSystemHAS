package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amu
 */
public class nameRetrieval extends HttpServlet {

private void retrieveName(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
PrintWriter out=response.getWriter();

try{
                        Connection conn = null;
                            PreparedStatement pstatement = null;
                            String url = "jdbc:mysql://localhost:3306/ha";
                        String driver = "com.mysql.jdbc.Driver";
                        String password = "amruta";
                        String userName = "root";
                        try {
                            String strUserName = "";
     

                            Class.forName(driver).newInstance();
                            conn = DriverManager.getConnection(url, userName, password);


                            String queryString = "select username from user";

                            pstatement= conn.prepareStatement(queryString);


                            
                            int updateQuery = pstatement.executeUpdate();


                            if (updateQuery != 0) {

            out.print("You are now a memeber of our house !!!");
                                            } else {

            out.print("Sorry...please try again");
                                }
                        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
                            pstatement.close();
                            conn.close();
                        }

        }catch(Exception e){
throw e;
        }
finally{
   out.close();
}}


}


