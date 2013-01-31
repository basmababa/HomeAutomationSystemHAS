/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.sql.PreparedStatement;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
public class registerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
/*
        PrintWriter out = response.getWriter();

        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/ha";
        String driver = "com.mysql.jdbc.Driver";
        String dbUserName = "root";
        String dbPassword = "amruta";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, dbUserName, dbPassword);

                  String strUserName = "";
                            String strPassword = "";
                            String strName = "";
                            String strAddress = "";
                            String strPhone = "";

                            if (request.getParameter("txtUserName") != null) {
                                strUserName = request.getParameter("txtUserName");
                            }

                            if (request.getParameter("txtPassword") != null) {
                                strPassword = request.getParameter("txtPassword");
                            }

                            if (request.getParameter("txtName") != null) {
                                strName = request.getParameter("txtName");
                            }

                            if (request.getParameter("txtAddress") != null) {
                                strAddress = request.getParameter("txtAddress");
                            }

                            if (request.getParameter("txtPhone") != null) {
                                strPhone = request.getParameter("txtPhone");
                            }


            String sql = "insert into user(username,password,name,address,phone) values ('" + strUserName + "','" + strPassword + "','"+ strName +"','"+strAddress+"','" + strPhone + "')";

            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            int returnVal = stmt.executeUpdate(sql);

            if (returnVal == 1) {
                response.sendRedirect("welcome.jsp");

                
            } else {
                response.sendRedirect("register.jsp");
            }
        } catch (Exception e) {
 throw e;
        
        
        }
        finally
        {
        conn.close();
        out.close();
        }
*/
    databaseEntry(request, response);}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
private void databaseEntry(HttpServletRequest request, HttpServletResponse response) throws Exception
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
                            String strPassword = "";
                            String strName = "";
                            String strAddress = "";
                            String strPhone = "";

                            if (request.getParameter("txtUserName") != null) {
                                strUserName = request.getParameter("txtUserName");
                            }

                            if (request.getParameter("txtPassword") != null) {
                                strPassword = request.getParameter("txtPassword");
                            }

                            if (request.getParameter("txtName") != null) {
                                strName = request.getParameter("txtName");
                            }

                            if (request.getParameter("txtAddress") != null) {
                                strAddress = request.getParameter("txtAddress");
                            }

                            if (request.getParameter("txtPhone") != null) {
                                strPhone = request.getParameter("txtPhone");
                            }


                            Class.forName(driver).newInstance();
                            conn = DriverManager.getConnection(url, userName, password);


                            String queryString = "INSERT INTO user(username,password,name,address,phone)values(?,?,?,?,?)";

                            pstatement= conn.prepareStatement(queryString);
                            pstatement.setString(1, strUserName);
                            pstatement.setString(2, strPassword);
                            pstatement.setString(3, strName);
                            pstatement.setString(4, strAddress);
                            pstatement.setString(5, strPhone);
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


