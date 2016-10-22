/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Casa;
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
public class CasaDAOImpl implements GenericDAO {
     private Connection conn;

    public CasaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) { //casting
        Casa casa = (Casa) object;
        PreparedStatement stmt = null;
        String sql = "Insert into casa(num_quarto, num_banheiro, possui_despejo, situacao_pintura, qnt_vag_garagem, "
                + "num_cozinhas, num_salas, tipo_piso, mobilia, id_imovel, num_suite, tipo_quintal, "
                + "area_lazer, andar, area_servico, tipo_casa, tipo_telhado) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, casa.getNumQuarto());
            stmt.setInt(2, casa.getNumBanheiro());
            stmt.setString(3, casa.getPossuiDespejo());
            stmt.setString(4, casa.getSituacaoPintura());
            stmt.setInt(5, casa.getQntVagGaragem());
            stmt.setInt(6, casa.getNumCozinhas());
            stmt.setInt(7, casa.getNumSalas());
            stmt.setString(8, casa.getTipoPiso());
            stmt.setString(9, casa.getMobilia());
             stmt.setInt(10, new ImovelDAOImpl().cadastrar(casa));
            stmt.setInt(11, casa.getNumSuite());
            stmt.setString(12, casa.getTipoQuintal());
            stmt.setString(13, casa.getAreaLazer());
            stmt.setInt(14, casa.getAndar());
            stmt.setString(15, casa.getAreaSevico());
            stmt.setString(16, casa.getTipoCasa());
            stmt.setString(17, casa.getTipoTelhado());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Casa! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Casa! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parâmetro de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }

        }

    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<Object>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select i.*, c.* from imovel i, casa c where i.id_imovel = c.id_imovel;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Casa casa = new Casa();

                casa.setIdImovel(rs.getInt("id_imovel"));
                casa.setBairroImovel(rs.getString("bairro_imovel"));
                casa.setNumImovel(rs.getInt("num_imovel"));
                casa.setUfImovel(rs.getString("uf_imovel"));
                casa.setCepImovel(rs.getString("cep_imovel"));
                casa.setMetragemImovel(rs.getString("metragem_imovel"));
                casa.setValorImovel(rs.getDouble("valor_imovel"));
                casa.setAreaImovel(rs.getDouble("area_imovel"));
                casa.setTipoAnuncio(rs.getString("tipo_anuncio"));
                casa.setDescricaoImovel(rs.getString("descricao_imovel"));
                
                
                  casa.setIdCasa(rs.getInt("id_casa"));
                  casa.setNumQuarto(rs.getInt("num_quarto"));
                  casa.setNumBanheiro(rs.getInt("num_banheiro"));
                  casa.setPossuiDespejo(rs.getString("possui_despejo"));
                  casa.setSituacaoPintura(rs.getString("situacao_pintura"));
                  casa.setQntVagGaragem(rs.getInt("qnt_vag_garagem"));
                  casa.setNumCozinhas(rs.getInt("num_cozinhas"));
                  casa.setNumSalas(rs.getInt("num_salas"));
                  casa.setTipoPiso(rs.getString("tipo_piso"));
                  casa.setMobilia(rs.getString("mobilia"));
                  casa.setNumSuite(rs.getInt("num_suite"));
                  casa.setTipoQuintal(rs.getString("tipo_quintal"));
                  casa.setAreaLazer(rs.getString("area_lazer"));
                  casa.setAndar(rs.getInt("andar"));
                  casa.setAreaSevico(rs.getString("area_servico"));
                  casa.setTipoCasa(rs.getString("tipo_casa"));
                  casa.setTipoTelhado(rs.getString("tipo_telhado"));
              
                resultado.add(casa);

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Casa! Erro: " + ex.getMessage());
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

    @Override
    public void excluir(int idObject) {

        PreparedStatement stmt = null;
        String sql = "Delete from casa where id_imovel=?; commit; Delete from imovel where id_imovel=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Casa! Erro: " + ex.getMessage());
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

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Casa casa = null;

        String sql = "select c.* , i.* "
                + "from imovel i, casa c"
                + " where i.id_imovel=c.id_imovel and i.id_imovel=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                casa = new Casa();
               casa.setIdImovel(rs.getInt("id_imovel"));
                casa.setBairroImovel(rs.getString("bairro_imovel"));
                casa.setNumImovel(rs.getInt("num_imovel"));
                casa.setUfImovel(rs.getString("uf_imovel"));
                casa.setCepImovel(rs.getString("cep_imovel"));
                casa.setMetragemImovel(rs.getString("metragem_imovel"));
                casa.setValorImovel(rs.getDouble("valor_imovel"));
                casa.setAreaImovel(rs.getDouble("area_imovel"));
                casa.setTipoAnuncio(rs.getString("tipo_anuncio"));
                casa.setDescricaoImovel(rs.getString("descricao_imovel"));
                
                
                  casa.setIdCasa(rs.getInt("id_casa"));
                  casa.setNumQuarto(rs.getInt("num_quarto"));
                  casa.setNumBanheiro(rs.getInt("num_banheiro"));
                  casa.setPossuiDespejo(rs.getString("possui_despejo"));
                  casa.setSituacaoPintura(rs.getString("situacao_pintura"));
                  casa.setQntVagGaragem(rs.getInt("qnt_vag_garagem"));
                  casa.setNumCozinhas(rs.getInt("num_cozinhas"));
                  casa.setNumSalas(rs.getInt("num_salas"));
                  casa.setTipoPiso(rs.getString("tipo_piso"));
                  casa.setMobilia(rs.getString("mobilia"));
                  casa.setNumSuite(rs.getInt("num_suite"));
                  casa.setTipoQuintal(rs.getString("tipo_quintal"));
                  casa.setAreaLazer(rs.getString("area_lazer"));
                  casa.setAndar(rs.getInt("andar"));
                  casa.setAreaSevico(rs.getString("area_servico"));
                  casa.setTipoCasa(rs.getString("tipo_casa"));
                  casa.setTipoTelhado(rs.getString("tipo_telhado"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Casa! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return casa;

    }

    @Override
    public Boolean alterar(Object object) {
        Casa casa = (Casa) object;
        PreparedStatement stmt = null;
        String sql = "update casa set num_quarto=?, num_banheiro=?, possui_despejo=?, situacao_pintura=?, qnt_vag_garagem=?, "
                + "num_cozinhas=?, num_salas=?, tipo_piso=?, mobilia=?, num_suite=?, tipo_quintal=?, "
                + "area_lazer=?, andar=?, area_servico=?, tipo_casa=?, tipo_telhado=? where id_imovel=?; ";
               
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, casa.getNumQuarto());
            stmt.setInt(2, casa.getNumBanheiro());
            stmt.setString(3, casa.getPossuiDespejo());
            stmt.setString(4, casa.getSituacaoPintura());
            stmt.setInt(5, casa.getQntVagGaragem());
            stmt.setInt(6, casa.getNumCozinhas());
            stmt.setInt(7, casa.getNumSalas());
            stmt.setString(8, casa.getTipoPiso());
            stmt.setString(9, casa.getMobilia());
            stmt.setInt(10, casa.getNumSuite());
            stmt.setString(11, casa.getTipoQuintal());
            stmt.setString(12, casa.getAreaLazer());
            stmt.setInt(13, casa.getAndar());
            stmt.setString(14, casa.getAreaSevico());
            stmt.setString(15, casa.getTipoCasa());
            stmt.setString(16, casa.getTipoTelhado());
            stmt.setInt(17, casa.getIdImovel());
            
            if(new ImovelDAOImpl().alterar(casa)){
                stmt.executeUpdate();
                return true;
            }else{
                return false;
            }
   

        } catch (Exception ex) {
            System.out.println("Problemas ao alterar Imovel Casa! Erro:" + ex.getMessage());
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