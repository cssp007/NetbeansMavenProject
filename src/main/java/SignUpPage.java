import java.io.IOException;
import java.io.PrintWriter;
//import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SignUpPage extends HttpServlet {
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignInPage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignInPage at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SignUp Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>SignUpPage at " + request.getContextPath() + "</h1>");
            out.println("<form action=GetSignUpData method=post>");
            out.println("Please fill up the details mentioned belowed. Marked with * is mandetory.<br>");
            out.println("First Name : <input type=text name=fname><br>");
            out.println("Last Name : <input type=text name=lname><br>");
            out.println("Username : <input type=text name=uname><br>");
            out.println("Password : <input type=password name=password><br>");
            out.println("Confirm Password : <input type=password name=cpassword><br>");
            out.println("Email ID : <input type=text name=email><br>");
            out.println("Mobile Number : <input type=text name=mobile><br>");
            out.println("<input type=submit name=submit value=Submit><br>");
            out.println("</body>");
            out.println("</html>");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
