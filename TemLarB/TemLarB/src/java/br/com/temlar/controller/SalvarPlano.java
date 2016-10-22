/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;

import br.com.temlar.DAO.PlanoDAOImpl;
import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.modell.Plano;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JéssicadosSantos
 */
@WebServlet(name = "SalvarPlano", urlPatterns = {"/SalvarPlano"})
public class SalvarPlano extends HttpServlet {

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
        String nomePlano = request.getParameter("nomeplano");
        String periodoPlano = request.getParameter("periodoplano");
        Double valorPlano = Double.parseDouble(request.getParameter("valorplano"));
        String regrasPlano = request.getParameter("regrasplano");
        Integer quantidadeFotosPlano= Integer.parseInt(request.getParameter("quantidadefotosplano"));
        Integer quantidadeImoveisPlano = Integer.parseInt(request.getParameter("quantidadeimoveisplano"));

        

        Plano plano = new Plano();

        plano.setNomePlano(nomePlano);
        plano.setPeriodoPlano(periodoPlano);
        plano.setValorPlano(valorPlano);
        plano.setRegrasPlano(regrasPlano);
        plano.setQuantidadeFotosPlano(quantidadeFotosPlano);
        plano.setQuantidadeImoveisPlano(quantidadeImoveisPlano);

        try {
            GenericDAO dao = new PlanoDAOImpl();
            if (request.getParameter("idplano").equals("")) {
                if (dao.cadastrar(plano)) {
                    mensagem = "Plano cadastrado com sucesso!";

                } else {
                    mensagem = "Problemas ao cadastrar Plano!";
                }
            } else {
                plano.setIdPlano(Integer.parseInt(request.getParameter("idplano")));
                if (dao.alterar(plano)) {
                    mensagem = "Plano Alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Plano";
                }
            }
            request.setAttribute("sucesso", mensagem);
            request.getRequestDispatcher("adm/salvarplano.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Plano! Erro: " + ex.getMessage());
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
//private Plano Plano() {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }



}
