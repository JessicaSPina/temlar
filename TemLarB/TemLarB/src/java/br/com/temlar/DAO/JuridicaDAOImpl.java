/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Fisica;
import br.com.temlar.modell.Juridica;
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
public class JuridicaDAOImpl implements GenericDAO {
     private Connection conn;

    public JuridicaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) { //casting
        Juridica juridica = (Juridica) object;
        PreparedStatement stmt = null;
        String sql = "Insert into juridica(cnpj, ie, im, id_pessoa) values (?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, juridica.getCnpjJuridica());
            stmt.setString(2, juridica.getIeJuridica());
            stmt.setString(3, juridica.getImJuridica());
            stmt.setInt(4, new PessoaDAOImpl().cadastrar(juridica));
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Pessoa Jurídica! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Pessoa Jurídica! Erro: " + ex.getMessage());
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

        String sql = "select p.*, j.* from pessoa p, juridica j where p.id_pessoa = j.id_pessoa;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Juridica juridica = new Juridica();

                juridica.setIdPessoa(rs.getInt("id_pessoa"));
                juridica.setNomePessoa(rs.getString("nome_pessoa"));
                juridica.setEndPessoa(rs.getString("end_pessoa"));
                juridica.setBairroPessoa(rs.getString("bairro_pessoa"));
                juridica.setCepPessoa(rs.getString("cep_pessoa"));
                juridica.setTelefonePessoa(rs.getString("telefone_pessoa"));
                juridica.setEmailPessoa(rs.getString("email_pessoa"));
                juridica.setLoginPessoa(rs.getString("login_pessoa"));
                juridica.setSenhaPessoa(rs.getString("senha_pessoa"));
                juridica.setUfPessoa(rs.getString("uf_pessoa"));
                juridica.setCidadePessoa(rs.getString("cidade_pessoa"));
                juridica.setCreciPessoa(rs.getString("creci_pessoa"));
                juridica.setNumPessoa(rs.getInt("num_pessoa"));
                juridica.setIdJuridica(rs.getInt("id_juridica"));
                juridica.setCnpjJuridica(rs.getString("cnpj"));
                juridica.setIeJuridica(rs.getString("ie"));
                juridica.setImJuridica(rs.getString("im"));
              

                resultado.add(juridica);

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Pessoa Jurídica! Erro: " + ex.getMessage());
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
        String sql = "Delete from juridica where id_pessoa=?; commit; Delete from pessoa where id_pessoa=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Pessoa Jurídica! Erro: " + ex.getMessage());
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

        Juridica juridica = null;

        String sql = "select j.* , p.* "
                + "from pessoa p, juridica j"
                + " where p.id_pessoa=j.id_pessoa and p.id_pessoa=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                juridica = new Juridica();
                juridica.setIdPessoa(rs.getInt("id_pessoa"));
                juridica.setNomePessoa(rs.getString("nome_pessoa"));
                juridica.setEndPessoa(rs.getString("end_pessoa"));
                juridica.setBairroPessoa(rs.getString("bairro_pessoa"));
                juridica.setCepPessoa(rs.getString("cep_pessoa"));
                juridica.setTelefonePessoa(rs.getString("telefone_pessoa"));
                juridica.setEmailPessoa(rs.getString("email_pessoa"));
                juridica.setLoginPessoa(rs.getString("login_pessoa"));
                juridica.setSenhaPessoa(rs.getString("senha_pessoa"));
                juridica.setUfPessoa(rs.getString("uf_pessoa"));
                juridica.setCidadePessoa(rs.getString("cidade_pessoa"));
                juridica.setCreciPessoa(rs.getString("creci_pessoa"));
                juridica.setCreciPessoa(rs.getString("num_pessoa"));
                juridica.setIdJuridica(rs.getInt("id_juridica"));
                juridica.setCnpjJuridica(rs.getString("cnpj"));
                juridica.setIeJuridica(rs.getString("ie"));          
                juridica.setImJuridica(rs.getString("im"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Pessoa Jurídica! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return juridica;

    }

    @Override
    public Boolean alterar(Object object) {
        Juridica juridica = (Juridica) object;
        PreparedStatement stmt = null;
        String sql = "update juridica set cnpj=?, ie=?, im=? where id_pessoa=?; ";
               
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, juridica.getCnpjJuridica());
            stmt.setString(2, juridica.getIeJuridica());
            stmt.setString(3, juridica.getImJuridica());
            stmt.setInt(4, juridica.getIdPessoa());
            
            if(new PessoaDAOImpl().alterar(juridica)){
                stmt.executeUpdate();
                return true;
            }else{
                return false;
            }
   

        } catch (Exception ex) {
            System.out.println("Problemas ao alterar Pessoa Jurídica! Erro:" + ex.getMessage());
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
