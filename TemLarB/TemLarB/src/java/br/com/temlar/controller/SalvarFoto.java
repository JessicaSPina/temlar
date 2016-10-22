/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.controller;

import br.com.temlar.DAO.FotoDAOImpl;
import br.com.temlar.DAO.GenericDAO;
import br.com.temlar.modell.Foto;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Ana Paula
 */
@WebServlet(name = "SalvarFoto", urlPatterns = {"/SalvarFoto"})
public class SalvarFoto extends HttpServlet {

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
            throws ServletException, IOException, FileUploadException, Exception {

       String caminho = null;
       Integer idImovel = null;
       Integer idQuarto = null;
        String mensagem = null;

        Foto foto = new Foto();

        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart) {
            // Create a new file upload handler
            DiskFileItemFactory factory = new DiskFileItemFactory();

            ServletFileUpload upload = new ServletFileUpload(factory);

            // Set upload parameters
            upload.setSizeMax(50 * 1024 * 1024); //50Mb

            List items = upload.parseRequest(request);

            Iterator it = items.iterator();
            while (it.hasNext()) {
                FileItem fileItem = (FileItem) it.next();
                if (!fileItem.isFormField()) {

                    try {
                        fileItem.write(new File("C:\\Users\\Ana Paula\\Dropbox\\TemLarB\\TemLarB\\TemLarB\\TemLarB\\web\\cliente\\foto\\"
                                + new File(fileItem.getName()).getName()));
                    } catch (Exception ex) {
                        System.out.println("Problemas ao executar upload! Erro:" + ex.getMessage());
                        ex.printStackTrace();
                    }

                    caminho = "foto/" + fileItem.getName();
                } else {
                    String dados = fileItem.getFieldName();
                    if (dados.equals("descricao")) {
                        foto.setDescricao(fileItem.getString());
                    }   else if (dados.equals("idimovel")){
                           idImovel = Integer.parseInt(fileItem.getString());
                    } else if (dados.equals("idquarto")) {
                            idQuarto = Integer.parseInt(fileItem.getString());
                    } else if (dados.equals("idfoto")) {
                        if (!fileItem.getString().equals("")) {
                            foto.setIdFoto(Integer.parseInt(fileItem.getString()));
                        }

                }
            }
        }

        foto.setCaminho(caminho);
       
            try {

                GenericDAO dao = new FotoDAOImpl();
                if (foto.getIdFoto()==null) {
                    if (dao.cadastrar(foto)) {
                        mensagem = "Foto cadastrada com sucesso!";

                    } else {
                        mensagem = "Problemas ao cadastrar Foto!";
                    }
                } else {
                    foto.setIdFoto(Integer.parseInt(request.getParameter("idfoto")));
                    if (dao.alterar(foto)) {
                        mensagem = "Foto Alterada com sucesso!";
                    } else {
                        mensagem = "Problemas ao alterar Foto";
                    }
                }
                request.setAttribute("sucesso", mensagem);
                request.getRequestDispatcher("cliente/salvarfoto.jsp").forward(request, response);
            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastrar Foto! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }

        }
     }

 // <editor-fold defaultstate="collapsed" desc="Métodos HttpServlet. Clique no sinal de + à esquerda para editar o código.">
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
        } catch (FileUploadException ex) {
            System.out.println("Problemas no do doGet! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(SalvarFoto.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (FileUploadException ex) {
            System.out.println("Problemas no do doPost! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(SalvarFoto.class.getName()).log(Level.SEVERE, null, ex);
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