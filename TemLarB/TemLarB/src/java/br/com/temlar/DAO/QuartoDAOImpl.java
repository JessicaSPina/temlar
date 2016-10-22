/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Quarto;
import br.com.temlar.modell.Pessoa;
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
public class QuartoDAOImpl implements GenericDAO{
    private Connection conn;

    public QuartoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Quarto quarto = (Quarto) object;
        PreparedStatement stmt = null;
        String sql = "Insert into quarto (tipo_telhado_quarto, tipo_piso_quarto, situacao_pintura_quarto, bairro_quarto, end_quarto, num_quarto, mobilia_quarto, cidade_quarto, uf_quarto, valor_quarto, id_pessoa, cep_quarto) values (?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, quarto.getTipoTelhadoQuarto());
            stmt.setString(2, quarto.getTipoPisoQuarto());
            stmt.setString(3, quarto.getSituacaoPinturaQuarto());
            stmt.setString(4, quarto.getBairroQuarto());
            stmt.setString(5, quarto.getEndQuarto());
            stmt.setInt(6, quarto.getNumQuarto());
            stmt.setBoolean(7, quarto.getMobiliaQuarto());
            stmt.setString(8, quarto.getCidadeQuarto());
            stmt.setString(9, quarto.getUfQuarto());
            stmt.setDouble(10, quarto.getValorQuarto());
            stmt.setInt(11, quarto.getPessoa().getIdPessoa());
            stmt.setString(12, quarto.getCepQuarto());
           
            stmt.execute();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Quarto! Erro:" + ex.getMessage());
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

        String sql = "select q.*, p.nome_pessoa from quarto q, pessoa p where quarto.id_pessoa = p.id_pessoa;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Quarto quarto = new Quarto();
                quarto.setIdQuarto(rs.getInt("id_quarto"));
                quarto.setTipoTelhadoQuarto(rs.getString("tipo_telhado_quarto"));
                quarto.setTipoPisoQuarto(rs.getString("tipo_piso_quarto"));
                quarto.setSituacaoPinturaQuarto(rs.getString("situacao_pintura_quarto"));
                quarto.setBairroQuarto(rs.getString("bairro_quarto"));
                quarto.setEndQuarto(rs.getString("end_quarto"));
                quarto.setNumQuarto(rs.getInt("num_quarto"));
                quarto.setMobiliaQuarto(rs.getBoolean("mobilia_quarto"));
                quarto.setCidadeQuarto(rs.getString("cidade_quarto"));
                quarto.setUfQuarto(rs.getString("uf_quarto"));
                quarto.setValorQuarto(rs.getDouble("valor_quarto"));
                quarto.setCepQuarto(rs.getString("cep_quarto"));
                
                
                Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("id_pessoa"));
                pessoa.setNomePessoa(rs.getString("nome_pessoa"));
                quarto.setPessoa(pessoa);
                resultado.add(quarto);

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Quarto! Erro: " + ex.getMessage());
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
        String sql = "Delete from quarto where id_quarto=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Quarto! Erro: " + ex.getMessage());
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

        Quarto quarto = null;

        String sql = "select q.* , p.nome_pessoa "
                + "from quarto q, cidade c"
                + " where q.id_pessoa=p.id_pessoa and q.id_quarto=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                quarto = new Quarto();
                quarto.setIdQuarto(rs.getInt("id_quarto"));
                quarto.setTipoTelhadoQuarto(rs.getString("tipo_telhado_quarto"));
                quarto.setTipoPisoQuarto(rs.getString("tipo_piso_quarto"));
                quarto.setSituacaoPinturaQuarto(rs.getString("situacao_pintura_quarto"));
                quarto.setBairroQuarto(rs.getString("bairro_quarto"));
                quarto.setEndQuarto(rs.getString("end_quarto"));
                quarto.setNumQuarto(rs.getInt("num_quarto"));
                quarto.setMobiliaQuarto(rs.getBoolean("mobilia_quarto"));
                quarto.setCidadeQuarto(rs.getString("cidade_quarto"));
                quarto.setUfQuarto(rs.getString("uf_quarto"));
                quarto.setValorQuarto(rs.getDouble("uf_quarto"));
                quarto.setCepQuarto(rs.getString("cep_quarto"));
              
                Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("id_pessoa"));
                pessoa.setNomePessoa(rs.getString("nome_pessoa"));
                quarto.setPessoa(pessoa);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Quarto! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return quarto;

    }

    @Override
        public Boolean alterar(Object object) {
        Quarto quarto = (Quarto) object;
        PreparedStatement stmt = null;
        String sql = "update quarto set , tipo_telhado_quarto=?, tipo_piso_quarto=?, situacao_pintura_quarto=?, bairro_quarto=?, end_quarto=?, num_quarto=?, mobilia_quarto=?, cidade_quarto=?, uf_quarto=?, valor_quarto=?, id_pessoa=?, cep_quarto=? "
                + "where id_quarto=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, quarto.getTipoTelhadoQuarto());
            stmt.setString(2, quarto.getTipoPisoQuarto());
            stmt.setString(3, quarto.getSituacaoPinturaQuarto());
            stmt.setString(4, quarto.getBairroQuarto());
            stmt.setString(5, quarto.getEndQuarto());
            stmt.setInt(6, quarto.getNumQuarto());
            stmt.setBoolean(7, quarto.getMobiliaQuarto());
            stmt.setString(8, quarto.getCidadeQuarto());
            stmt.setString(9, quarto.getUfQuarto());
            stmt.setDouble(10, quarto.getValorQuarto());
            stmt.setInt(11, quarto.getPessoa().getIdPessoa());
            stmt.setString(12, quarto.getCepQuarto());
            stmt.setInt(13, quarto.getIdQuarto());
           
                
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Quarto! Erro:" + ex.getMessage());
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

    

