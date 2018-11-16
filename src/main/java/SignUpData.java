/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spandey
 */
public class SignUpData extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String firstname=request.getParameter("fname");
       String lastname=request.getParameter("lname");
       String username=request.getParameter("username");
       String password=request.getParameter("pass");
       String email=request.getParameter("mail");
               
        PrintWriter out=response.getWriter();
        
        out.println("You have seccessfully Signup. "
                + "Your Username is "+username+" and Password is "+password+" . ");
           }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
