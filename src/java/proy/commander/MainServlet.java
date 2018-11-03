/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.commander;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proy.abstractfactory.factory.ConsorcioFactory;
import proy.abstractfactory.factory.IndependienteFactory;
import proy.entidad.Consorcio;
import proy.entidad.Empresa;
import proy.entidad.Independiente;
import proy.entidad.Paradero;

/**
 *
 * @author Jonathan
 */
@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {

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
            String paradero = request.getParameter("paradero");
            System.out.println(paradero);
            
            IBuscarEmpresa buscarempresa = new BuscarEmpresa();
            List<Empresa> listE = buscarempresa.buscar(paradero);
            
            IBuscarRuta buscarruta = new BuscarRuta();
            List<Paradero> listP = buscarruta.buscar(paradero);
            
            List<Consorcio> listC = new ArrayList<Consorcio>();
            List<Independiente> listI = new ArrayList<Independiente>();
            for(Empresa e:listE){
                switch(e.getTipo()){
                    case "consorcio":       listC.add(consorcio_(e));
                                            break;
                    case "independiente":   listI.add(independiente_(e,listP.size()));
                                            break;
                }
                System.out.println(e.getNombre());
            }
             
            request.setAttribute("listaC", listC);
            request.setAttribute("listaI", listI);
            request.setAttribute("listaP", listP);
            getServletConfig().getServletContext().getRequestDispatcher("/index_.jsp").forward(request,response);
            
    
    
    }
    
    public Consorcio consorcio_(Empresa e){
        ConsorcioFactory consorciofactory = new ConsorcioFactory();
        Consorcio c = consorciofactory.getConsorcio(e.getTipo());
        c.setId_empresa(e.getId_empresa());
        c.setNombre(e.getNombre());
        c.setImagen(e.getImagen());
        c.setId_ruta(e.getId_ruta());
        c.setCodigo_ruta(e.getCodigo_ruta());
        c.setTipo(e.getTipo());
        c.calcularTarifa(0);
        
        return c;
    }
    
    public Independiente independiente_(Empresa e,int size){
        IndependienteFactory indefactory = new IndependienteFactory();
        Independiente i = indefactory.getIndependiente(e.getTipo());
        i.setId_empresa(e.getId_empresa());
        i.setNombre(e.getNombre());
        i.setImagen(e.getImagen());
        i.setId_ruta(e.getId_ruta());
        i.setCodigo_ruta(e.getCodigo_ruta());
        i.setTipo(e.getTipo());
        i.calcularTarifa(size);
        
        return i; 
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
