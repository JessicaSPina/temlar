/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Administrador;
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
 * @author PC 05
 */
public class AdministradorDAOImpl implements GenericDAO {

    private Connection conn;

    public AdministradorDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Administrador administrador = (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "Insert into administrador (nome_adm, cpf, login, senha, email_adm) values (?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, administrador.getNomeAdm());
            stmt.setString(2, administrador.getCpfAdm());
            stmt.setString(3, administrador.getLoginAdm());
            stmt.setString(4, administrador.getSenhaAdm());
            stmt.setString(5, administrador.getEmailAdm());
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

        String sql = "select a.* from administrador a;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Administrador administrador = new Administrador();
                administrador.setIdAdm(rs.getInt("id_administrador"));
                administrador.setNomeAdm(rs.getString("nome_adm"));
                administrador.setCpfAdm(rs.getString("cpf"));
                administrador.setEmailAdm(rs.getString("email_adm"));
                administrador.setLoginAdm(rs.getString("login"));
                administrador.setSenhaAdm(rs.getString("senha"));
                resultado.add(administrador);

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar administrador! Erro: " + ex.getMessage());
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
        String sql = "Delete from administrador where id_administrador=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Problemas ao excluir Administrador! Erro: " + ex.getMessage());
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

        Administrador administrador = null;

        String sql = "select a.* from administrador a where id_administrador=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                administrador = new Administrador();
                administrador.setIdAdm(rs.getInt("id_administrador"));
                administrador.setNomeAdm(rs.getString("nome_adm"));
                administrador.setCpfAdm(rs.getString("cpf"));
                administrador.setLoginAdm(rs.getString("login"));
                administrador.setSenhaAdm(rs.getString("senha"));
                administrador.setEmailAdm(rs.getString("email_adm"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar administrador! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return administrador;

    }

    @Override
    public Boolean alterar(Object object) {
        Administrador administrador = (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "update administrador set nome_adm=?, cpf=?, login=?, senha=?, email_adm=?  where id_administrador=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, administrador.getNomeAdm());
            stmt.setString(2, administrador.getCpfAdm());
            stmt.setString(3, administrador.getLoginAdm());
            stmt.setString(4, administrador.getSenhaAdm());
            stmt.setString(5, administrador.getEmailAdm());
            stmt.setInt(6, administrador.getIdAdm());
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Administrador! Erro:" + ex.getMessage());
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
    
    public Administrador logarAdm(String login, String senha){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Administrador administrador = null;

        String sql = "select a.id_administrador, p.nome_adm "
                + "from administrador a"
                + " where a.login=? and a.senha=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                administrador = new Administrador();
                administrador.setIdAdm(rs.getInt("id_administrador"));
                administrador.setNomeAdm(rs.getString("nome_adm"));
               
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao logar pessoa! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

        return administrador;

    }

}