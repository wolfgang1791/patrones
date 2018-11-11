/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.proxy;

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proy.entidad.Empresa_;

/**
 *
 * @author Jonathan
 */
@WebServlet(name = "ProxyServlet", urlPatterns = {"/ProxyServlet"})
public class ProxyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static Random r_ = new Random();
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
             
             ConnectionManager.conectarse();
             
             String nombre = request.getParameter("nom");
             String ruta = request.getParameter("ruta");
             String img = request.getParameter("img");
             String tipo = request.getParameter("tipo");
    
             Empresa_ e = new Empresa_();
             e.setId(r_.nextInt(100)+9);
             e.setNombre(nombre);
             e.setImagen(img);
             e.setTipo(tipo.trim());
             e.setRuta(Integer.parseInt(ruta.trim()));
             
             GuardarDatos gdatos = new GuardarDatos();
             gdatos.save(e);
             
             getServletConfig().getServletContext().getRequestDispatcher("/IteratorServelt").forward(request,response);
    
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
