/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;

import br.com.temlar.DAO.FisicaDAOImpl;
import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.modell.Fisica;
import br.com.temlar.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ana Paula
 */
@WebServlet(name = "SalvarPessoaFisica", urlPatterns = {"/SalvarPessoaFisica"})
public class SalvarPessoaFisica extends HttpServlet {

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
            throws ServletException, IOException, Exception {
         
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
        String rgFisica = request.getParameter("rg");
        String cpfFisica = request.getParameter("cpf");
        String estadoCivilFisica = request.getParameter("estadocivil");
        String sexoFisica = request.getParameter("sexo");
        Integer numPessoa = Integer.parseInt(request.getParameter("numpessoa"));
        Date dataNascimento = Conversoes.converterData(request.getParameter("datanascimento").replace("-", "/"));

        Fisica fisica = new Fisica(); //sempre salva na classe filha 

        fisica.setNomePessoa(nomePessoa);
        fisica.setEndPessoa(endPessoa);
        fisica.setBairroPessoa(bairroPessoa);
        fisica.setCepPessoa(cepPessoa);
        fisica.setTelefonePessoa(telefonePessoa);
        fisica.setEmailPessoa(emailPessoa);
        fisica.setLoginPessoa(loginPessoa);
        fisica.setSenhaPessoa(senhaPessoa);
        fisica.setUfPessoa(ufPessoa);
        fisica.setCidadePessoa(cidadePessoa);
        fisica.setNumPessoa(numPessoa);
        fisica.setRgFisica(rgFisica);
        fisica.setCpfFisica(cpfFisica);
        fisica.setDataNascimentoFisica(dataNascimento);
        fisica.setEstadoCivilFisica(estadoCivilFisica);
        fisica.setSexoFisica(sexoFisica);
       
     

        try {
            GenericDAO dao = new FisicaDAOImpl();
            if (request.getParameter("idpessoa").equals("")) {
                if (dao.cadastrar(fisica)) {
                    mensagem = "Pessoa Física cadastrada com sucesso!";

                } else {
                    mensagem = "Problemas ao cadastrar Pessoa Física!";
                }
            } else {
                fisica.setIdPessoa(Integer.parseInt(request.getParameter("idpessoa")));
                if (dao.alterar(fisica)) {
                    mensagem = "Pessoa Física Alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Pessoa Física";
                }
            }
            request.setAttribute("sucesso", mensagem);
            request.getRequestDispatcher("salvarpessoafisica.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(SalvarAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(SalvarAdministrador.class.getName()).log(Level.SEVERE, null, ex);
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
