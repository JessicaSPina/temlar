/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;


import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.DAO.QuartoDAOImpl;
import br.com.temlar.modell.Pessoa;
import br.com.temlar.modell.Quarto;
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
@WebServlet(name = "SalvarQuarto", urlPatterns = {"/SalvarQuarto"})
public class SalvarQuarto extends HttpServlet {

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
        String tipoTelhadoQuarto = request.getParameter("tipotelhadoquarto");
        String tipoPisoQuarto = request.getParameter("tipopisoquarto");
        String situacaoPinturaQuarto = request.getParameter("situacaopinturaquarto");
        String bairroQuarto = request.getParameter("bairroquarto");
        String endQuarto = request.getParameter("endquarto");
        Integer numQuarto = Integer.parseInt(request.getParameter("numquarto"));
        Boolean mobiliaQuarto = Boolean.parseBoolean(request.getParameter("mobiliaquarto"));
        String cidadeQuarto = request.getParameter("cidadequarto");
        String ufQuarto = request.getParameter("ufquarto");
        Double valorQuarto = Double.parseDouble(request.getParameter("valorquarto"));
        String cepQuarto = request.getParameter("cepquarto");
        Integer idPessoa = Integer.parseInt(request.getParameter("idpessoa"));
       

        Quarto quarto = new Quarto();
        quarto.setTipoTelhadoQuarto(tipoTelhadoQuarto);
        quarto.setTipoPisoQuarto(tipoPisoQuarto);
        quarto.setSituacaoPinturaQuarto(situacaoPinturaQuarto);
        quarto.setBairroQuarto(bairroQuarto);
        quarto.setEndQuarto(endQuarto);
        quarto.setNumQuarto(numQuarto);
        quarto.setMobiliaQuarto(mobiliaQuarto);
        quarto.setCidadeQuarto(cidadeQuarto);
        quarto.setUfQuarto(ufQuarto);
        quarto.setValorQuarto(valorQuarto);
        quarto.setCepQuarto(cepQuarto);
         
        
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(idPessoa);
        
        quarto.setPessoa(pessoa);

        try {
            GenericDAO dao = new QuartoDAOImpl();
            if (request.getParameter("idquarto").equals("")) {
                if (dao.cadastrar(quarto)) {
                    mensagem = "Quarto cadastrado com sucesso!";

                } else {
                    mensagem = "Problemas ao cadastrar Quarto!";
                }
            } else {
                quarto.setIdQuarto(Integer.parseInt(request.getParameter("idquarto")));
                if (dao.alterar(quarto)) {
                    mensagem = "Quarto Alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Quarto";
                }
            }
            request.setAttribute("sucesso", mensagem);
            request.getRequestDispatcher("cliente/salvarquarto.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Quarto! Erro: " + ex.getMessage());
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

}
