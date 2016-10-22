/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Lote;
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
public class LoteDAOImpl {
     private Connection conn;

    public LoteDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }

 
    public int cadastrar(Object object) throws Exception { //casting
        Lote lote = (Lote) object;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "Insert into lote(tipo_muro, aterrado, id_imovel) values (?,?,?) returning id_imovel;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, lote.getTipoMuro());
            stmt.setString(2, lote.getAterrado());
            stmt.setInt(3, new ImovelDAOImpl().cadastrar(lote));
            rs = stmt.executeQuery();
            rs.next();
            
            return rs.getInt("id_imovel");
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Lote! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return 0;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parâmetro de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }

        }

    }


    public List<Object> listar() {
        List<Object> resultado = new ArrayList<Object>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select p.*, l.* from pessoa p, lote j where p.id_pessoa = l.id_pessoa;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Lote lote = new Lote();

                lote.setIdImovel(rs.getInt("id_imovel"));
                lote.setBairroImovel(rs.getString("bairro_imovel"));
                lote.setNumImovel(rs.getInt("num_imovel"));
                lote.setUfImovel(rs.getString("uf_imovel"));
                lote.setCepImovel(rs.getString("cep_imovel"));
                lote.setMetragemImovel(rs.getString("metragem_imovel"));
                lote.setValorImovel(rs.getDouble("valor_imovel"));
                lote.setAreaImovel(rs.getDouble("area_imovel"));
                lote.setTipoAnuncio(rs.getString("tipo_anuncio"));
                lote.setDescricaoImovel(rs.getString("descricao_imovel"));
               
                lote.setIdLote(rs.getInt("id_lote"));
                lote.setTipoMuro(rs.getString("tipo_muro"));
                lote.setAterrado(rs.getString("aterrado"));
                

                resultado.add(lote);

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Lote! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return resultado;

    }

    public void excluir(int idObject) {

        PreparedStatement stmt = null;
        String sql = "Delete from lote where id_imovel=?; commit; Delete from imovel where id_imovel=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Lote! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }

        }
    }

    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Lote lote = null;

        String sql = "select l.* , i.* "
                + "from imovel i, lote l"
                + " where i.id_imovel=l.id_imovel and i.id_imovel=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                lote = new Lote();
                lote.setIdImovel(rs.getInt("id_imovel"));
                lote.setBairroImovel(rs.getString("bairro_imovel"));
                lote.setNumImovel(rs.getInt("num_imovel"));
                lote.setUfImovel(rs.getString("uf_imovel"));
                lote.setCepImovel(rs.getString("cep_imovel"));
                lote.setMetragemImovel(rs.getString("metragem_imovel"));
                lote.setValorImovel(rs.getDouble("valor_imovel"));
                lote.setAreaImovel(rs.getDouble("area_imovel"));
                lote.setTipoAnuncio(rs.getString("tipo_anuncio"));
                lote.setDescricaoImovel(rs.getString("descricao_imovel"));
                
                lote.setIdLote(rs.getInt("id_lote"));
                lote.setTipoMuro(rs.getString("tipo_muro"));
                lote.setAterrado(rs.getString("aterrado"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Lote! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return lote;

    }

    public Boolean alterar(Object object) {
        Lote lote = (Lote) object;
        PreparedStatement stmt = null;
        String sql = "update lote set tipo_muro=?, aterrado=? where id_imovel=?; ";
               
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, lote.getTipoMuro());
            stmt.setString(2, lote.getAterrado());
            stmt.setInt(3, lote.getIdImovel());
            
            if(new ImovelDAOImpl().alterar(lote)){
                stmt.executeUpdate();
                return true;
            }else{
                return false;
            }
            
          
   

        } catch (Exception ex) {
            System.out.println("Problemas ao alterar Imovel! Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();

            }
        }
    }
    
    
    
      
      
}