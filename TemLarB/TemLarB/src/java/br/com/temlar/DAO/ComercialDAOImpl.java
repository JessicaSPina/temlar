/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Comercial;

import br.com.temlar.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JéssicadosSantos
 */
public class ComercialDAOImpl implements GenericDAO {

    private Connection conn;

    public ComercialDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Comercial comercial = (Comercial) object;
        PreparedStatement stmt = null;
        String sql = "Insert into comercial (num_salas, mobilia, tipo_piso, tipo_telhado, situacao_pintura, num_banheiro, "
                + "qnt_vag_garagem, copa, id_imovel) "
                + "values (?,?,?,?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, comercial.getNumSalas());
            stmt.setString(2, comercial.getMobilia());
            stmt.setString(3, comercial.getTipoPiso());
            stmt.setString(4, comercial.getTipoTelhado());
            stmt.setString(5, comercial.getSituacaoPintura());
            stmt.setInt(6, comercial.getNumBanheiro());
            stmt.setInt(7, comercial.getQntVagGaragem());
            stmt.setString(8, comercial.getCopa());
            stmt.setInt(9, new ImovelDAOImpl().cadastrar(comercial));
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Imóvel Comercial! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Comercial! Erro: " + ex.getMessage());
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

        String sql = "select i.*, c.* from imovel i, comercial c where i.id_imovel = c.id_imovel;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Comercial comercial = new Comercial();
                comercial.setIdImovel(rs.getInt("id_imovel"));
                comercial.setNumSalas(rs.getInt("num_salas"));
                comercial.setMobilia(rs.getString("mobilia"));
                comercial.setTipoPiso(rs.getString("tipo_piso"));
                comercial.setTipoTelhado(rs.getString("tipo_telhado"));
                comercial.setSituacaoPintura(rs.getString("situacao_pintura"));
                comercial.setNumBanheiro(rs.getInt("num_banheiro"));
                comercial.setQntVagGaragem(rs.getInt("qnt_vag_garagem"));
                comercial.setCopa(rs.getString("copa"));
                comercial.setBairroImovel(rs.getString("bairro"));
                comercial.setNumImovel(rs.getInt("numimovel"));
                comercial.setUfImovel(rs.getString("ufimovel"));
                comercial.setEndImovel(rs.getString("endimovel"));
                comercial.setCepImovel(rs.getString("cepimovel"));
                comercial.setMetragemImovel(rs.getString("metragemimovel"));
                comercial.setValorImovel(rs.getDouble("valorimovel"));
                comercial.setAreaImovel(rs.getDouble("areaimovel"));

                comercial.setTipoAnuncio(rs.getString("tipoanuncio"));
                comercial.setDescricaoImovel(rs.getString("descricaoimovel"));

                resultado.add(comercial);

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar imóvel comercial! Erro: " + ex.getMessage());
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
        String sql = "Delete from comercial where id_imovel=?; commit; Delete from imovel where id_imovel=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir comercial! Erro: " + ex.getMessage());
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

        Comercial comercial = null;

        String sql = "select c.* , i.* "
                + "from imovel i, comercial c"
                + " where i.id_imovel=c.id_imovel and i.id_imovel=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                comercial = new Comercial();
                comercial.setIdImovel(rs.getInt("id_imovel"));
                comercial.setNumSalas(rs.getInt("num_salas"));
                comercial.setMobilia(rs.getString("mobilia"));
                comercial.setTipoPiso(rs.getString("tipo_piso"));
                comercial.setTipoTelhado(rs.getString("tipo_telhado"));
                comercial.setSituacaoPintura(rs.getString("situacao_pintura"));
                comercial.setNumBanheiro(rs.getInt("num_banheiro"));
                comercial.setQntVagGaragem(rs.getInt("qnt_vag_garagem"));
                comercial.setCopa(rs.getString("copa"));
                comercial.setBairroImovel(rs.getString("bairro"));
                comercial.setNumImovel(rs.getInt("numimovel"));
                comercial.setUfImovel(rs.getString("ufimovel"));
                comercial.setEndImovel(rs.getString("endimovel"));
                comercial.setCepImovel(rs.getString("cepimovel"));
                comercial.setMetragemImovel(rs.getString("metragemimovel"));
                comercial.setValorImovel(rs.getDouble("valorimovel"));
                comercial.setAreaImovel(rs.getDouble("areaimovel"));

                comercial.setTipoAnuncio(rs.getString("tipoanuncio"));
                comercial.setDescricaoImovel(rs.getString("descricaoimovel"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar imóvel Comercial! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return comercial;

    }

    @Override
    public Boolean alterar(Object object) {
        Comercial comercial = (Comercial) object;
        PreparedStatement stmt = null;
        String sql = "update comercial set num_salas?, mobilia?, tipo_piso?, tipo_telhado?, situacao_pintura?, num_banheiro?, qnt_vag_garagem?, copa? where id_imovel=?; ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, comercial.getNumSalas());
            stmt.setString(2, comercial.getMobilia());
            stmt.setString(3, comercial.getTipoPiso());
            stmt.setString(4, comercial.getTipoTelhado());
            stmt.setString(5, comercial.getSituacaoPintura());

            stmt.setInt(6, comercial.getNumBanheiro());
            stmt.setInt(7, comercial.getQntVagGaragem());
            stmt.setString(8, comercial.getCopa());
            stmt.setInt(9, comercial.getIdImovel());
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Plano! Erro:" + ex.getMessage());
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
