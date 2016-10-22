/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.modell;

import java.util.Date;

/**
 *
 * @author Ana Paula
 */
public class Fisica extends Pessoa {
    
    private Integer idFisica;
    private String rgFisica;
    private String cpfFisica;
    private Date dataNascimentoFisica;
    private String estadoCivilFisica;
    private String sexoFisica;

    public Fisica() {
    }

    public Fisica(Integer idFisica, String rgFisica, String cpfFisica, Date dataNascimentoFisica, String estadoCivilFisica, String sexoFisica) {
        this.idFisica = idFisica;
        this.rgFisica = rgFisica;
        this.cpfFisica = cpfFisica;
        this.dataNascimentoFisica = dataNascimentoFisica;
        this.estadoCivilFisica = estadoCivilFisica;
        this.sexoFisica = sexoFisica;
    }

    public Fisica(Integer idFisica, String rgFisica, String cpfFisica, Date dataNascimentoFisica, String estadoCivilFisica, String sexoFisica, Integer idPessoa, String nomePessoa, String endPessoa, String bairroPessoa, String cepPessoa, String telefonePessoa, String emailPessoa, String loginPessoa, String senhaPessoa, String ufPessoa, String cidadePessoa, String creciPessoa, Integer numPessoa) {
        super(idPessoa, nomePessoa, endPessoa, bairroPessoa, cepPessoa, telefonePessoa, emailPessoa, loginPessoa, senhaPessoa, ufPessoa, cidadePessoa, creciPessoa, numPessoa);
        this.idFisica = idFisica;
        this.rgFisica = rgFisica;
        this.cpfFisica = cpfFisica;
        this.dataNascimentoFisica = dataNascimentoFisica;
        this.estadoCivilFisica = estadoCivilFisica;
        this.sexoFisica = sexoFisica;
    }

    public Integer getIdFisica() {
        return idFisica;
    }

    public void setIdFisica(Integer idFisica) {
        this.idFisica = idFisica;
    }

    public String getRgFisica() {
        return rgFisica;
    }

    public void setRgFisica(String rgFisica) {
        this.rgFisica = rgFisica;
    }

    public String getCpfFisica() {
        return cpfFisica;
    }

    public void setCpfFisica(String cpfFisica) {
        this.cpfFisica = cpfFisica;
    }

    public Date getDataNascimentoFisica() {
        return dataNascimentoFisica;
    }

    public void setDataNascimentoFisica(Date dataNascimentoFisica) {
        this.dataNascimentoFisica = dataNascimentoFisica;
    }

    public String getEstadoCivilFisica() {
        return estadoCivilFisica;
    }

    public void setEstadoCivilFisica(String estadoCivilFisica) {
        this.estadoCivilFisica = estadoCivilFisica;
    }

    public String getSexoFisica() {
        return sexoFisica;
    }

    public void setSexoFisica(String sexoFisica) {
        this.sexoFisica = sexoFisica;
    }

    
    
}
