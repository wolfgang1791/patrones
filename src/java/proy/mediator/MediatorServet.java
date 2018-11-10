/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.mediator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proy.commander.Receptor;

/**
 *
 * @author Jonathan
 */
@WebServlet(name = "MediatorServet", urlPatterns = {"/MediatorServet"})
public class MediatorServet extends HttpServlet {

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
             
             Receptor r = Receptor.getInstance();
             List<Usuario> list_u = r.obtener_user();
             UsuarioMediator um = new UsuarioMediator();
             for(Usuario u : list_u){
                 um.registra(u);
                 System.out.println(u.getName());
             }
             String name = request.getParameter("user");
             String pass = request.getParameter("pass");
             
             Usuario ingresa = new Usuario(um);
             ingresa.setName(name);
             ingresa.setPass(pass);
             //um.registra(ingresa);
    
             for(Usuario u : list_u){
                 if(ingresa.envia(u.getName(), pass)){System.out.println(ingresa.envia(u.getName(), pass));
                      getServletConfig().getServletContext().getRequestDispatcher("/IteratorServelt").forward(request,response);
                      return;
                 }
                 else{
                     getServletConfig().getServletContext().getRequestDispatcher("/reg/log_admin.jsp").forward(request,response);
                     return;
                 }
             }
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
