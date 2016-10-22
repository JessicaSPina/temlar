/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;

import br.com.temlar.DAO.CasaDAOImpl;
import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.DAO.LoteDAOImpl;
import br.com.temlar.modell.Casa;
import br.com.temlar.modell.Lote;
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
 * @author Ana Paula
 */
@WebServlet(name = "SalvarCasa", urlPatterns = {"/SalvarCasa"})
public class SalvarCasa extends HttpServlet {

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
        
       Integer numQuarto = Integer.parseInt(request.getParameter("numquarto"));
       Integer numBanheiro = Integer.parseInt(request.getParameter("numbanheiro"));
        String possuiDespejo = request.getParameter("possuidespejo");
        String situacaoPintura = request.getParameter("situacaopintura");
        Integer qntVagGaragem = Integer.parseInt(request.getParameter("qntvaggaragem"));
        Integer numCozinhas = Integer.parseInt(request.getParameter("numcozinhas"));
        Integer numSalas = Integer.parseInt(request.getParameter("numsalas"));
        String tipoPiso = request.getParameter("tipopiso");
        String mobilia = request.getParameter("mobilia");
        Integer numSuite = Integer.parseInt(request.getParameter("numsuite"));
        String tipoQuintal = request.getParameter("tipoquintal");
        String areaLazer = request.getParameter("arealazer");
        Integer andar = Integer.parseInt(request.getParameter("andar"));
        String areaServico = request.getParameter("areaservico");
        String tipoCasa = request.getParameter("tipocasa");
        String tipoTelhado = request.getParameter("tipotelhado");
        
        
        HttpSession session = request.getSession(true);
        Integer idPessoa = (Integer) session.getAttribute("idpessoa");
        
        Casa casa = new Casa(); //sempre salva na classe filha 

   
        
                casa.setBairroImovel(bairroImovel);
                casa.setCidadeImovel(cidadeImovel);
                casa.setEndImovel(endImovel);
                casa.setNumImovel(numImovel);
                casa.setUfImovel(ufImovel);
                casa.setCepImovel(cepImovel);
                casa.setMetragemImovel(metragemImovel);
                casa.setValorImovel(valorImovel);
                casa.setAreaImovel(areaImovel);
                casa.setTipoAnuncio(tipoAnuncio);
                casa.setDescricaoImovel(descricaoImovel);
                
                
          
                  casa.setNumQuarto(numQuarto);
                  casa.setNumBanheiro(numBanheiro);
                  casa.setPossuiDespejo(possuiDespejo);
                  casa.setSituacaoPintura(situacaoPintura);
                  casa.setQntVagGaragem(qntVagGaragem);
                  casa.setNumCozinhas(numCozinhas);
                  casa.setNumSalas(numSalas);
                  casa.setTipoPiso(tipoPiso);
                  casa.setMobilia(mobilia);
                  casa.setNumSuite(numSuite);
                  casa.setTipoQuintal(tipoQuintal);
                  casa.setAreaLazer(areaLazer);
                  casa.setAndar(andar);
                  casa.setAreaSevico(areaServico);
                  casa.setTipoCasa(tipoCasa);
                  casa.setTipoTelhado(tipoTelhado);
        
        
       
        
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(idPessoa);
        
        casa.setPessoa(pessoa);
     

        try {
            GenericDAO dao = new CasaDAOImpl();
            if (request.getParameter("idimovel").equals("")) {
                if (dao.cadastrar(casa)) {
                    mensagem = "Casa cadastrado com sucesso!";

                } else {
                    mensagem = "Problemas ao cadastrar Casa!";
                }
            } else {
                casa.setIdImovel(Integer.parseInt(request.getParameter("idimovel")));
                if (dao.alterar(casa)) {
                    mensagem = "Casa Alterada com sucesso!";
                } else {
                    mensagem = "Problemas ao alterar Casa";
                }
            }
            request.setAttribute("sucesso", mensagem);
            request.getRequestDispatcher("cliente/salvarcasa.jsp").forward(request, response);
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
