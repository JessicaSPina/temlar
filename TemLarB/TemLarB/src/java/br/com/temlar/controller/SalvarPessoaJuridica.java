 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;

import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.DAO.JuridicaDAOImpl;
import br.com.temlar.modell.Juridica;
import br.com.temlar.modell.Pessoa;
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
@WebServlet(name = "SalvarPessoaJuridica", urlPatterns = {"/SalvarPessoaJuridica"})
public class SalvarPessoaJuridica extends HttpServlet {

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
        
        String nomePessoa = request.getParameter("nomepessoa");
        String endPessoa = request.getParameter("endpessoa");
        String bairroPessoa = request.getParameter("bairropessoa");
        String cepPessoa = request.getParameter("ceppessoa");
        String telefonePessoa = request.getParameter("telefonepessoa");
        String emailPessoa = request.getParameter("emailpessoa");
        String loginPessoa = request.getParameter("loginpessoa");
        String senhaPessoa = request.getParameter("senhapessoa");
        String ufPessoa = request.getParameter("ufpessoa");
        String cidadePessoa = request.getParameter("cidadepessoa");
        Integer numPessoa = Integer.parseInt(request.getParameter("numpessoa"));
        String cnpjJuridica = request.getParameter("cnpj");
        String ieJuridica = request.getParameter("ie");
        String imJuridica = request.getParameter("im");
       
        Juridica juridica = new Juridica(); //sempre salva na classe filha 

        juridica.setNomePessoa(nomePessoa);
        juridica.setEndPessoa(endPessoa);
        juridica.setBairroPessoa(bairroPessoa);
        juridica.setCepPessoa(cepPessoa);
        juridica.setTelefonePessoa(telefonePessoa);
        juridica.setEmailPessoa(emailPessoa);
        juridica.setLoginPessoa(loginPessoa);
        juridica.setSenhaPessoa(senhaPessoa);
        juridica.setUfPessoa(ufPessoa);
        juridica.setCidadePessoa(cidadePessoa);
        juridica.setNumPessoa(numPessoa);
        juridica.setCnpjJuridica(cnpjJuridica);
        juridica.setIeJuridica(ieJuridica);
        juridica.setImJuridica(imJuridica);

        try {
            GenericDAO dao = new JuridicaDAOImpl();
            if (request.getParameter("idpessoa").equals("")) {
                if (dao.cadastrar(juridica)) {
                    mensagem = "Pessoa Jurídica cadastrada com sucesso!";

                } else {
                    mensagem = "Problemas ao cadastrar Pessoa Jurídica!";
                }
            } else {
                juridica.setIdPessoa(Integer.parseInt(request.getParameter("idpessoa")));
                if (dao.alterar(juridica)) {
                    mensagem = "Pessoa Jurídica Alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Pessoa Jurídica";
                }
            }
            request.setAttribute("sucesso", mensagem);
            request.getRequestDispatcher("salvarpessoajuridica.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Pessoa Jurídica! Erro: " + ex.getMessage());
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
