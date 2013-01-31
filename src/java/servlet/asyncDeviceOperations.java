/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import deviceOperations.ClsDeviceOperations;
import java.io.IOException;
import java.io.PrintWriter;
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
public class asyncDeviceOperations extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String strOutput = "0";
            String device = "";


            if (request.getParameter("device") != null) {
                String action = "";
                device = request.getParameter("device");

                if (request.getParameter("act") != null) {
                    action = request.getParameter("act");
                }
                ClsDeviceOperations objDeviceOperations = new ClsDeviceOperations();


                if (device.equals("tv"))
                {
                    if (action.equals("onoff")) {
                        int onOffStatus = 0;
                        try {
                            onOffStatus = Integer.parseInt(request.getParameter("onoffstatus"));

                        } catch (NumberFormatException e) {
                            onOffStatus = 0;
                        }
strOutput=""+objDeviceOperations.setTvOnOff(onOffStatus);

                    }
                }
            }
    out.print(strOutput);
        }
        catch(Exception e){
        throw  e;

    }finally{
    out.close();
    }
    }

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
            Logger.getLogger(asyncDeviceOperations.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(asyncDeviceOperations.class.getName()).log(Level.SEVERE, null, ex);
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
}
