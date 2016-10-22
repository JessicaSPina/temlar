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
public class Pessoa {
    private Integer idPessoa;
    private String nomePessoa;
    private String endPessoa;
    private String bairroPessoa;
    private String cepPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    private String loginPessoa;
    private String senhaPessoa;
    private String ufPessoa;
    private String cidadePessoa;
    private String creciPessoa;
    private Integer numPessoa;

    public Pessoa() {
    }

    public Pessoa(Integer idPessoa, String nomePessoa, String endPessoa, String bairroPessoa, String cepPessoa, String telefonePessoa, String emailPessoa, String loginPessoa, String senhaPessoa, String ufPessoa, String cidadePessoa, String creciPessoa, Integer numPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.endPessoa = endPessoa;
        this.bairroPessoa = bairroPessoa;
        this.cepPessoa = cepPessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
        this.loginPessoa = loginPessoa;
        this.senhaPessoa = senhaPessoa;
        this.ufPessoa = ufPessoa;
        this.cidadePessoa = cidadePessoa;
        this.creciPessoa = creciPessoa;
        this.numPessoa = numPessoa;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEndPessoa() {
        return endPessoa;
    }

    public void setEndPessoa(String endPessoa) {
        this.endPessoa = endPessoa;
    }

    public String getBairroPessoa() {
        return bairroPessoa;
    }

    public void setBairroPessoa(String bairroPessoa) {
        this.bairroPessoa = bairroPessoa;
    }

    public String getCepPessoa() {
        return cepPessoa;
    }

    public void setCepPessoa(String cepPessoa) {
        this.cepPessoa = cepPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getLoginPessoa() {
        return loginPessoa;
    }

    public void setLoginPessoa(String loginPessoa) {
        this.loginPessoa = loginPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    public String getUfPessoa() {
        return ufPessoa;
    }

    public void setUfPessoa(String ufPessoa) {
        this.ufPessoa = ufPessoa;
    }

    public String getCidadePessoa() {
        return cidadePessoa;
    }

    public void setCidadePessoa(String cidadePessoa) {
        this.cidadePessoa = cidadePessoa;
    }

    public String getCreciPessoa() {
        return creciPessoa;
    }

    public void setCreciPessoa(String creciPessoa) {
        this.creciPessoa = creciPessoa;
    }

    public Integer getNumPessoa() {
        return numPessoa;
    }

    public void setNumPessoa(Integer numPessoa) {
        this.numPessoa = numPessoa;
    }


    
    
}
