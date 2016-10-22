/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.DAO;

import br.com.temlar.modell.Fisica;
import br.com.temlar.modell.Juridica;
import br.com.temlar.modell.Pessoa;
import br.com.temlar.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ana Paula
 */
public class PessoaDAOImpl {

    private Connection conn;

    public PessoaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception("Problemas ao conectar ao BD! Erro: " + ex.getMessage());
        }
    }
    
    public Integer cadastrar(Pessoa pessoa){//métodos iguais mais os objetos são diferentes
    
        PreparedStatement stmt = null;
        ResultSet rs=null;
        Integer idPessoa=null;
        String sql = "Insert into pessoa (nome_pessoa, end_pessoa, bairro_pessoa, cep_pessoa, telefone_pessoa, email_pessoa, login_pessoa, senha_pessoa, uf_pessoa, cidade_pessoa, creci_pessoa, num_pessoa) values (?,?,?,?,?,?,?,?,?,?,?,?) returning id_pessoa;";
        
        //returning insere a tabela e já retorna o que vc quer
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getEndPessoa());
            stmt.setString(3, pessoa.getBairroPessoa());
            stmt.setString(4, pessoa.getCepPessoa());
            stmt.setString(5, pessoa.getTelefonePessoa());
            stmt.setString(6, pessoa.getEmailPessoa());
            stmt.setString(7, pessoa.getLoginPessoa());
            stmt.setString(8, pessoa.getSenhaPessoa());
            stmt.setString(9, pessoa.getUfPessoa());
            stmt.setString(10, pessoa.getCidadePessoa());
            stmt.setString(11, pessoa.getCreciPessoa());
            stmt.setInt(12, pessoa.getNumPessoa());
            rs=stmt.executeQuery();
            if(rs.next()){
                idPessoa=rs.getInt("id_pessoa");
                
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Pessoa! Erro:" + ex.getMessage());
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
        return idPessoa;
    }
    
    public Boolean alterar (Pessoa pessoa){
        PreparedStatement stmt = null;
        String sql="update pessoa set nome_pessoa=?, end_pessoa=?, bairro_pessoa=?, cep_pessoa=?, telefone_pessoa=?, email_pessoa=?, login_pessoa=?, senha_pessoa=?, uf_pessoa=?, cidade_pessoa=?, creci_pessoa=?, num_pessoa=? where id_pessoa=?;";
        try{
            stmt=conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNomePessoa());
            stmt.setString(2, pessoa.getEndPessoa());
            stmt.setString(3, pessoa.getBairroPessoa());
            stmt.setString(4, pessoa.getCepPessoa());
            stmt.setString(5, pessoa.getTelefonePessoa());
            stmt.setString(6, pessoa.getEmailPessoa());
            stmt.setString(7, pessoa.getLoginPessoa());
            stmt.setString(8, pessoa.getSenhaPessoa());
            stmt.setString(9, pessoa.getUfPessoa());
            stmt.setString(10, pessoa.getCidadePessoa());
            stmt.setString(11, pessoa.getCreciPessoa());
            stmt.setInt(12, pessoa.getNumPessoa());
            stmt.setInt(13, pessoa.getIdPessoa());
            stmt.executeUpdate();
            return true;
        }catch (SQLException ex){
            System.out.println("Problemas ao alterar Pessoa! Erro: " + ex.getMessage());
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
    
    public Pessoa logarPessoa(String login, String senha){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Pessoa pessoa = null;

        String sql = "select p.id_pessoa, p.nome_pessoa "
                + "from pessoa p"
                + " where p.login_pessoa=? and p.senha_pessoa=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("id_pessoa"));
                pessoa.setNomePessoa(rs.getString("nome_pessoa"));
               
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

        return pessoa;

    }

    
}
