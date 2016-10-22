/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;


import br.com.temlar.DAO.AdministradorDAOImpl;
import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.modell.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ana Paula
 */
@WebServlet(name = "SalvarAdministrador", urlPatterns = {"/SalvarAdministrador"})
public class SalvarAdministrador extends HttpServlet {

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
        String mensagem = null;
        String nomeAdministrador = request.getParameter("nomeadministrador");
        String cpfAdministrador = request.getParameter("cpfadministrador");
        String loginAdministrador = request.getParameter("loginadministrador");
        String senhaAdministrador = request.getParameter("senhaadministrador");
        String emailAdministrador = request.getParameter("emailadministrador");

        Administrador administrador = new Administrador();

        administrador.setNomeAdm(nomeAdministrador);
        administrador.setCpfAdm(cpfAdministrador);
        administrador.setLoginAdm(loginAdministrador);
        administrador.setSenhaAdm(senhaAdministrador);
        administrador.setEmailAdm(emailAdministrador);

        try {
            GenericDAO dao = new AdministradorDAOImpl();
            if (request.getParameter("idadministrador").equals("")) {
                if (dao.cadastrar(administrador)) {
                    mensagem = "Administrador cadastrado com sucesso!";

                } else {
                    mensagem = "Problemas ao cadastrar Administrador!";
                }
            } else {
                administrador.setIdAdm(Integer.parseInt(request.getParameter("idadministrador")));
                if (dao.alterar(administrador)) {
                    mensagem = "Administrador Alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar administrador";
                }
            }
            request.setAttribute("sucesso", mensagem);
            request.getRequestDispatcher("adm/salvaradministrador.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Administrador! Erro: " + ex.getMessage());
            ex.printStackTrace();
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

    private Administrador Administrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
