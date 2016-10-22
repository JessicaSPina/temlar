/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;

import br.com.temlar.DAO.FisicaDAOImpl;
import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.DAO.LoteDAOImpl;
import br.com.temlar.modell.Fisica;
import br.com.temlar.modell.Lote;
import br.com.temlar.modell.Pessoa;
import br.com.temlar.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
@WebServlet(name = "SalvarLote", urlPatterns = {"/SalvarLote"})
public class SalvarLote extends HttpServlet {

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
        
        String nomeImovel = request.getParameter("nomeimovel");
        String bairroImovel = request.getParameter("bairroimovel");
        Integer numImovel = Integer.parseInt(request.getParameter("numimovel"));
        String cidadeImovel = request.getParameter("cidadeimovel");
        String ufImovel = request.getParameter("ufimovel");
        String endImovel = request.getParameter("endimovel");
        String cepImovel = request.getParameter("cepimovel");
        String metragemImovel = request.getParameter("metragemimovel");
        Double valorImovel = Double.parseDouble(request.getParameter("valorimovel"));
        Double areaImovel = Double.parseDouble(request.getParameter("areaimovel"));
        String tipoAnuncio = request.getParameter("tipoanuncio");
        String descricaoImovel = request.getParameter("descricaoimovel");
        String tipoMuro = request.getParameter("tipomuro");
        String aterrado = request.getParameter("aterrado");
        
        HttpSession session = request.getSession(true);
        Integer idPessoa = (Integer) session.getAttribute("idpessoa");
        
        Lote lote = new Lote(); //sempre salva na classe filha 

        lote.setBairroImovel(bairroImovel);
        lote.setNumImovel(numImovel);
        lote.setCidadeImovel(cidadeImovel);
        lote.setUfImovel(ufImovel);
        lote.setEndImovel(endImovel);
        lote.setCepImovel(cepImovel);
        lote.setMetragemImovel(metragemImovel);
        lote.setValorImovel(valorImovel);
        lote.setAreaImovel(areaImovel);
        lote.setTipoAnuncio(tipoAnuncio);
        lote.setDescricaoImovel(descricaoImovel);
        lote.setTipoMuro(tipoMuro);
        lote.setAterrado(aterrado);
       
        
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(idPessoa);
        
        lote.setPessoa(pessoa);
     

        try {
            LoteDAOImpl dao = new LoteDAOImpl();
            if (request.getParameter("idimovel").equals("")) {
                lote.setIdImovel(dao.cadastrar(lote));
                if (lote.getIdImovel() != 0) {
                    mensagem = "Lote cadastrado com sucesso!";

                } else {
                    mensagem = "Problemas ao cadastrar Lote!";
                }
            } else {
                lote.setIdImovel(Integer.parseInt(request.getParameter("idimovel")));
                if (dao.alterar(lote)) {
                    mensagem = "Lote Alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Lote";
                }
            }
            request.setAttribute("sucesso", mensagem);
            request.setAttribute("lote", lote);
            request.getRequestDispatcher("cliente/inserirfotolote.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Lote! Erro: " + ex.getMessage());
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
