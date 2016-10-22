/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.modell;

/**
 *
 * @author Ana Paula
 */
public class Administrador {
    private Integer idAdm;
    private String nomeAdm;
    private String cpfAdm;
    private String loginAdm;
    private String senhaAdm;
    private String emailAdm;

    public Administrador() {
    }

    public Administrador(Integer idAdm, String nomeAdm, String cpfAdm, String loginAdm, String senhaAdm, String emailAdm) {
        this.idAdm = idAdm;
        this.nomeAdm = nomeAdm;
        this.cpfAdm = cpfAdm;
        this.loginAdm = loginAdm;
        this.senhaAdm = senhaAdm;
        this.emailAdm = emailAdm;
    }

    public Integer getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(Integer idAdm) {
        this.idAdm = idAdm;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    public String getCpfAdm() {
        return cpfAdm;
    }

    public void setCpfAdm(String cpfAdm) {
        this.cpfAdm = cpfAdm;
    }

    public String getLoginAdm() {
        return loginAdm;
    }

    public void setLoginAdm(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

    public String getEmailAdm() {
        return emailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        this.emailAdm = emailAdm;
    }
    
    
}
