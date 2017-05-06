/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacebookSource;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lizam
 */
public class MyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //You will need to get your own access token and copy and paste it below in order for this project to work correctly.
        String accessToken="EAACEdEose0cBACFCXnTTL7oLk5aI1zGAiN2nehRQPsmd0cXFuDAG1Al1t31mhGpNHqbYrmpvmAts2q8quX8NpnpfT5ZC9DZAoObWzCJpadK4QZCoOmtcetHdBsFncTPe0IHcEfvZCeuSE9A5eZAsb760fFyKUum4tleuNkLhry7HTNNZB2ZAkrsddUyQPSAAQsZD";
            
        //This creates a new object called "facebookClient" this object has actions attached to it that are defined in the imported restfb library.    
        FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
      
        //This gives us access to your specific facebook account
        User user = facebookClient.fetchObject("me", User.class);
        
        //This tells facebook we want to publish a message and attach a link to it.
        
        
       //This outputs a new html form to the page with our success message written on it.
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here.  */
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"newcss.css\"    type=\"text/css\">");
            out.println("<title>Status Update</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"pageContainer\">");
            out.println("<h1>Good Job, Almost ready for Facebook!</h1>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");   
        
            
        }  
        
    }   
    
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
