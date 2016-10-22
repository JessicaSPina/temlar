/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Fisica;
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
public class FisicaDAOImpl implements GenericDAO {
     private Connection conn;

    public FisicaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) { //casting
        Fisica fisica = (Fisica) object;
        PreparedStatement stmt = null;
        String sql = "Insert into fisica(rg, cpf, data_nasc, estado_civil, sexo, id_pessoa) values (?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, fisica.getRgFisica());
            stmt.setString(2, fisica.getCpfFisica());
            stmt.setDate(3, new java.sql.Date(fisica.getDataNascimentoFisica().getTime()));
            stmt.setString(4, fisica.getEstadoCivilFisica());
            stmt.setString(5, fisica.getSexoFisica());
            stmt.setInt(6, new PessoaDAOImpl().cadastrar(fisica));
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Pessoa Física! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Pessoa Física! Erro: " + ex.getMessage());
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

        String sql = "select p.*, f.* from pessoa p, fisica f where p.id_pessoa = f.id_pessoa;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fisica fisica = new Fisica();

                fisica.setIdPessoa(rs.getInt("id_pessoa"));
                fisica.setNomePessoa(rs.getString("nome_pessoa"));
                fisica.setEndPessoa(rs.getString("end_pessoa"));
                fisica.setBairroPessoa(rs.getString("bairro_pessoa"));
                fisica.setCepPessoa(rs.getString("cep_pessoa"));
                fisica.setTelefonePessoa(rs.getString("telefone_pessoa"));
                fisica.setEmailPessoa(rs.getString("email_pessoa"));
                fisica.setLoginPessoa(rs.getString("login_pessoa"));
                fisica.setSenhaPessoa(rs.getString("senha_pessoa"));
                fisica.setUfPessoa(rs.getString("uf_pessoa"));
                fisica.setCidadePessoa(rs.getString("cidade_pessoa"));
                fisica.setCreciPessoa(rs.getString("creci_pessoa"));
                fisica.setNumPessoa(rs.getInt("num_pessoa"));
                fisica.setIdFisica(rs.getInt("id_fisica"));
                fisica.setRgFisica(rs.getString("rg"));
                fisica.setCpfFisica(rs.getString("cpf"));
                fisica.setDataNascimentoFisica(rs.getDate("data_nasc"));
                fisica.setEstadoCivilFisica(rs.getString("estado_civil"));
                fisica.setSexoFisica(rs.getString("sexo"));

                resultado.add(fisica);

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Pessoa Física! Erro: " + ex.getMessage());
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
        String sql = "Delete from fisica where id_pessoa=?; commit; Delete from pessoa where id_pessoa=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Pessoa Física! Erro: " + ex.getMessage());
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

        Fisica fisica = null;

        String sql = "select f.* , p.* "
                + "from pessoa p, fisica f"
                + " where p.id_pessoa=f.id_pessoa and p.id_pessoa=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                fisica = new Fisica();
                fisica.setIdPessoa(rs.getInt("id_pessoa"));
                fisica.setNomePessoa(rs.getString("nome_pessoa"));
                fisica.setEndPessoa(rs.getString("end_pessoa"));
                fisica.setBairroPessoa(rs.getString("bairro_pessoa"));
                fisica.setCepPessoa(rs.getString("cep_pessoa"));
                fisica.setTelefonePessoa(rs.getString("telefone_pessoa"));
                fisica.setEmailPessoa(rs.getString("email_pessoa"));
                fisica.setLoginPessoa(rs.getString("login_pessoa"));
                fisica.setSenhaPessoa(rs.getString("senha_pessoa"));
                fisica.setUfPessoa(rs.getString("uf_pessoa"));
                fisica.setCidadePessoa(rs.getString("cidade_pessoa"));
                fisica.setCreciPessoa(rs.getString("creci_pessoa"));
                fisica.setNumPessoa(rs.getInt("num_pessoa"));
                fisica.setIdFisica(rs.getInt("id_fisica"));
                fisica.setRgFisica(rs.getString("rg"));
                fisica.setCpfFisica(rs.getString("cpf"));
                fisica.setDataNascimentoFisica(rs.getDate("data_nasc"));
                fisica.setEstadoCivilFisica(rs.getString("estado_civil"));
                fisica.setSexoFisica(rs.getString("sexo"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Pessoa Física! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return fisica;

    }

    @Override
    public Boolean alterar(Object object) {
        Fisica fisica = (Fisica) object;
        PreparedStatement stmt = null;
        String sql = "update fisica set rg=?, cpf=?, data_nasc=?, estado_civil=?, sexo=? where id_pessoa=?; ";
               
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, fisica.getRgFisica());
            stmt.setString(2, fisica.getCpfFisica());
            stmt.setDate(3, new java.sql.Date(fisica.getDataNascimentoFisica().getTime()));
            stmt.setString(4, fisica.getEstadoCivilFisica());
            stmt.setString(5, fisica.getSexoFisica());
            stmt.setInt(6, fisica.getIdPessoa());
            
            if(new PessoaDAOImpl().alterar(fisica)){
                stmt.executeUpdate();
                return true;
            }else{
                return false;
            }
   

        } catch (Exception ex) {
            System.out.println("Problemas ao alterar Pessoa Física! Erro:" + ex.getMessage());
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
