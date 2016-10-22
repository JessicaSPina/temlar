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
public class Juridica extends Pessoa {

    private Integer idJuridica;
    private String cnpjJuridica;
    private String ieJuridica;
    private String imJuridica;

    public Juridica() {
    }

    public Juridica(Integer idJuridica, String cnpjJuridica, String ieJuridica, String imJuridica) {
        this.idJuridica = idJuridica;
        this.cnpjJuridica = cnpjJuridica;
        this.ieJuridica = ieJuridica;
        this.imJuridica = imJuridica;
    }

    public Juridica(Integer idJuridica, String cnpjJuridica, String ieJuridica, String imJuridica, Integer idPessoa, String nomePessoa, String endPessoa, String bairroPessoa, String cepPessoa, String telefonePessoa, String emailPessoa, String loginPessoa, String senhaPessoa, String ufPessoa, String cidadePessoa, String creciPessoa, Integer numPessoa) {
        super(idPessoa, nomePessoa, endPessoa, bairroPessoa, cepPessoa, telefonePessoa, emailPessoa, loginPessoa, senhaPessoa, ufPessoa, cidadePessoa, creciPessoa, numPessoa);
        this.idJuridica = idJuridica;
        this.cnpjJuridica = cnpjJuridica;
        this.ieJuridica = ieJuridica;
        this.imJuridica = imJuridica;
    }

    public Integer getIdJuridica() {
        return idJuridica;
    }

    public void setIdJuridica(Integer idJuridica) {
        this.idJuridica = idJuridica;
    }

    public String getCnpjJuridica() {
        return cnpjJuridica;
    }

    public void setCnpjJuridica(String cnpjJuridica) {
        this.cnpjJuridica = cnpjJuridica;
    }

    public String getIeJuridica() {
        return ieJuridica;
    }

    public void setIeJuridica(String ieJuridica) {
        this.ieJuridica = ieJuridica;
    }

    public String getImJuridica() {
        return imJuridica;
    }

    public void setImJuridica(String imJuridica) {
        this.imJuridica = imJuridica;
    }

}