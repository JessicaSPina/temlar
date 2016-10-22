/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;


import br.com.temlar.modell.Plano;
import br.com.temlar.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC 05
 */
public class PlanoDAOImpl implements GenericDAO {

    private Connection conn;

    public PlanoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Plano plano = (Plano) object;
        PreparedStatement stmt = null;
        String sql = "Insert into plano (nome_plano, periodo, valor, regras_plano, quant_fotos, quant_imoveis) values (?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, plano.getNomePlano());
            stmt.setString(2, plano.getPeriodoPlano());
             stmt.setDouble(3, plano.getValorPlano());
            stmt.setString(4, plano.getRegrasPlano());
            stmt.setInt(5, plano.getQuantidadeFotosPlano());
            stmt.setInt(6, plano.getQuantidadeImoveisPlano());
            stmt.execute();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Administrador! Erro:" + ex.getMessage());
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
 
    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<Object>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select p.* from plano p;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Plano plano= new Plano();
                plano.setIdPlano(rs.getInt("id_plano"));
                plano.setNomePlano(rs.getString("nome_plano"));
                plano.setPeriodoPlano(rs.getString("periodo"));
                plano.setValorPlano(rs.getDouble("valor"));
                plano.setRegrasPlano(rs.getString("regras_plano"));
                plano.setQuantidadeFotosPlano(rs.getInt("quant_fotos"));
                 plano.setQuantidadeImoveisPlano(rs.getInt("quant_imoveis"));
                resultado.add(plano);

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar plano! Erro: " + ex.getMessage());
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
        String sql = "Delete from plano where id_plano=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Plano! Erro: " + ex.getMessage());
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

        Plano plano = null;

      String sql = "select p.* from plano p where id_plano=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                plano = new Plano();
                plano.setIdPlano(rs.getInt("id_plano"));
                plano.setNomePlano(rs.getString("nome_plano"));
                plano.setPeriodoPlano(rs.getString("periodo"));
                plano.setValorPlano(rs.getDouble("valor"));
                plano.setRegrasPlano(rs.getString("regras_plano"));
                plano.setQuantidadeFotosPlano(rs.getInt("quant_fotos"));
                plano.setQuantidadeImoveisPlano(rs.getInt("quant_imoveis"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar plano! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return plano;

    }

    @Override
    public Boolean alterar(Object object) {
        Plano plano = (Plano) object;
        PreparedStatement stmt = null;
        String sql = "update plano set nome_plano=?, periodo=?, valor=?, regras_plano=?, quant_fotos=?, quant_imoveis=?  where id_plano=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, plano.getNomePlano());
            stmt.setString(2, plano.getPeriodoPlano());
            stmt.setDouble(3, plano.getValorPlano());
            stmt.setString(4, plano.getRegrasPlano());
            stmt.setInt(5, plano.getQuantidadeFotosPlano());
            stmt.setInt(6, plano.getQuantidadeImoveisPlano());
            stmt.setInt(7, plano.getIdPlano());
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