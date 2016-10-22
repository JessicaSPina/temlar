/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Imovel;
import br.com.temlar.modell.Pessoa;
import br.com.temlar.modell.Quarto;
import br.com.temlar.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ana Paula
 */
public class ImovelDAOImpl{
    private Connection conn;

    public ImovelDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }
    
    public Integer cadastrar(Imovel imovel){//métodos iguais mais os objetos são diferentes
    
        PreparedStatement stmt = null;
        ResultSet rs=null;
        Integer idImovel=null;
        String sql = "Insert into imovel (bairro_imovel, num_imovel, uf_imovel, end_imovel, cep_imovel, metragem_imovel, "
                + "valor_imovel, area_imovel, tipo_anuncio, descricao_imovel, id_pessoa, cidade_imovel) values (?,?,?,?,?,?,?,?,?,?,?,?) returning id_imovel;";
        
        //returning insere a tabela e já retorna o que vc quer
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, imovel.getBairroImovel());
            stmt.setInt(2, imovel.getNumImovel());
            stmt.setString(3, imovel.getUfImovel());
            stmt.setString(4, imovel.getEndImovel());
            stmt.setString(5, imovel.getCepImovel());
            stmt.setString(6, imovel.getMetragemImovel());
            stmt.setDouble(7, imovel.getValorImovel());
            stmt.setDouble(8, imovel.getAreaImovel());
            stmt.setString(9, imovel.getTipoAnuncio());
            stmt.setString(10, imovel.getDescricaoImovel());
            stmt.setString(12, imovel.getCidadeImovel());
            stmt.setInt(11, imovel.getPessoa().getIdPessoa());
            rs=stmt.executeQuery();
            if(rs.next()){
                idImovel=rs.getInt("id_imovel");
                
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Imovel! Erro:" + ex.getMessage());
            ex.printStackTrace();
            return null;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();

            }
        }
        return idImovel;
    }
    
    public Boolean alterar (Imovel imovel){
        PreparedStatement stmt = null;
        String sql="update imovel set bairro_imovel=?, num_imovel=?, uf_imovel=?, end_imovel=?, cep_imovel=?, metragem_imovel=?, valor_imovel=?, area_imovel=?, tipo_anuncio=?, descricao_imovel=?, id_pessoa=?, cidade_imovel=?  where id_imovel=?;";
        try{
            stmt=conn.prepareStatement(sql);
            stmt.setString(1, imovel.getBairroImovel());
            stmt.setInt(2, imovel.getNumImovel());
            stmt.setString(3, imovel.getUfImovel());
            stmt.setString(4, imovel.getEndImovel());
            stmt.setString(5, imovel.getCepImovel());
            stmt.setString(6, imovel.getMetragemImovel());
            stmt.setDouble(7, imovel.getValorImovel());
            stmt.setDouble(8, imovel.getAreaImovel());
            stmt.setString(9, imovel.getTipoAnuncio());
            stmt.setString(10, imovel.getDescricaoImovel());
            stmt.setString(11, imovel.getCepImovel());
            stmt.setInt(12, imovel.getPessoa().getIdPessoa());
            stmt.executeUpdate();
            return true;
        }catch (SQLException ex){
            System.out.println("Problemas ao alterar Imovel! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }finally{
            try{
                ConnectionFactory.closeConnection(conn,stmt);
                
            }catch (Exception ex){
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro" +ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    
    
        
}