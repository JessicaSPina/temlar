/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;

import br.com.temlar.DAO.AdministradorDAOImpl;
import br.com.temlar.DAO.PessoaDAOImpl;
import br.com.temlar.modell.Administrador;
import br.com.temlar.modell.Pessoa;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ana Paula
 */
@WebServlet(name = "LogarPessoa", urlPatterns = {"/LogarPessoa"})
public class LogarPessoa extends HttpServlet {

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

        if (request.getParameter("acao").equals("logar")) {

            String mensagem = null;
            if (!request.getParameter("login").equals("") && !request.getParameter("senha").equals("")) {

                
                
                if (request.getParameter("actor").equals("simple")) {

                    Pessoa pessoa = null;
                    try {
                        PessoaDAOImpl daoPessoa = new PessoaDAOImpl();
                        pessoa = daoPessoa.logarPessoa(request.getParameter("login"), request.getParameter("senha"));
                        if (pessoa != null) {
                            HttpSession session = request.getSession(true);
                            session.setAttribute("idpessoa", pessoa.getIdPessoa());
                            session.setAttribute("nomepessoa", pessoa.getNomePessoa());
                            mensagem = "Seja bem - vindo(a)" + pessoa.getNomePessoa() + "!";
                            session.setAttribute("mensagem", mensagem);

                            request.getRequestDispatcher("cliente/index.jsp").forward(request, response);
                        } else {
                            mensagem = "Usuário ou senha inválidos!";
                            request.setAttribute("erro", mensagem);
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        }

                    } catch (Exception ex) {
                        System.out.println("Problemas ao logar Pessoa! Erro: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                } else if (request.getParameter("actor").equals("admin")) {

                    
                    Administrador  administrador = null;
                    try {
                        AdministradorDAOImpl daoAdm = new AdministradorDAOImpl();
                        administrador = daoAdm.logarAdm(request.getParameter("login"), request.getParameter("senha"));
                        if (administrador != null) {
                            HttpSession session = request.getSession(true);
                            session.setAttribute("idAdministrador", administrador.getIdAdm());
                            session.setAttribute("nomeAdministrador", administrador.getNomeAdm());
                            mensagem = "Seja bem - vindo(a)" + administrador.getNomeAdm()+ "!";
                            session.setAttribute("mensagem", mensagem);

                            request.getRequestDispatcher("adm/index.jsp").forward(request, response);
                        } else {
                            mensagem = "Usuário ou senha inválidos!";
                            request.setAttribute("erro", mensagem);
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        }

                    } catch (Exception ex) {
                        System.out.println("Problemas ao logar Administrador! Erro: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                    
                }
            } else {
                mensagem = "Usuário e senha são obrigatórios!";
                request.setAttribute("erro", mensagem);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else if (request.getParameter("acao").equals("logout")) {
            HttpSession session = request.getSession(true);
            session.invalidate();
            response.sendRedirect("login.jsp");
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
