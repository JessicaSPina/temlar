/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;

import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.DAO.ComercialDAOImpl;
import br.com.temlar.modell.Comercial;
import br.com.temlar.modell.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JéssicadosSantos
 */
@WebServlet(name = "SalvarComercial", urlPatterns = {"/SalvarComercial"})
public class SalvarComercial extends HttpServlet {

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

        Integer numSalas = Integer.parseInt(request.getParameter("numsalas"));
        String mobilia = request.getParameter("mobilia");
        String tipoPiso = request.getParameter("tipopiso");
        String tipoTelhado = request.getParameter("tipotelhado");
        String situacaoPintura = request.getParameter("situacaopintura");
        Integer numBanheiro = Integer.parseInt(request.getParameter("numbanheiro"));
        Integer qntVagGaragem = Integer.parseInt(request.getParameter("qntvaggaragem"));
        String copa = request.getParameter("copa");

        HttpSession session = request.getSession(true);
        Integer idPessoa = (Integer) session.getAttribute("idpessoa");

        Comercial comercial = new Comercial();

        comercial.setBairroImovel(bairroImovel);
        comercial.setCidadeImovel(cidadeImovel);
        comercial.setEndImovel(endImovel);
        comercial.setNumImovel(numImovel);
        comercial.setUfImovel(ufImovel);
        comercial.setCepImovel(cepImovel);
        comercial.setMetragemImovel(metragemImovel);
        comercial.setValorImovel(valorImovel);
        comercial.setAreaImovel(areaImovel);
        comercial.setTipoAnuncio(tipoAnuncio);
        comercial.setDescricaoImovel(descricaoImovel);
        
        comercial.setNumSalas(numSalas);
        comercial.setMobilia(mobilia);
        comercial.setTipoPiso(tipoPiso);
        comercial.setTipoTelhado(tipoTelhado);
        comercial.setSituacaoPintura(situacaoPintura);
        comercial.setNumBanheiro(numBanheiro);
        comercial.setQntVagGaragem(qntVagGaragem);
        comercial.setCopa(copa);
        
          Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(idPessoa);
        
        comercial.setPessoa(pessoa);

        try {
            GenericDAO dao = new ComercialDAOImpl();
            if (request.getParameter("idimovel").equals("")) {
                if (dao.cadastrar(comercial)) {
                    mensagem = "Imóvel Comercial cadastrado com sucesso!";

                } else {
                    mensagem = "Problemas ao cadastrar Imóvel Comercial!";
                }
            } else {
                comercial.setIdImovel(Integer.parseInt(request.getParameter("idimovel")));
                if (dao.alterar(comercial)) {
                    mensagem = "Imóvel Comercial Alterado com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Imóvel Comercial";
                }
            }
            request.setAttribute("sucesso", mensagem);
            request.getRequestDispatcher("cliente/salvarcomercial.jsp").forward(request, response);
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
