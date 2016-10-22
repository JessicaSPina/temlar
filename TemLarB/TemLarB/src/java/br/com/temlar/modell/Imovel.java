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
public class Imovel {
    private Integer idImovel;
    private String bairroImovel;
    private Integer numImovel;
    private String ufImovel;
    private String endImovel;
    private String cepImovel;
    private String metragemImovel;
    private Double valorImovel;
    private Double areaImovel;
    private String tipoAnuncio;
    private String descricaoImovel;
    private String cidadeImovel;
    private Pessoa pessoa;


    public Imovel() {
    }

    public Imovel(Integer idImovel, String bairroImovel, Integer numImovel, String ufImovel, String endImovel, String cepImovel, String metragemImovel, Double valorImovel, Double areaImovel, String tipoAnuncio, String descricaoImovel, String cidadeImovel, Pessoa pessoa) {
        this.idImovel = idImovel;
        this.bairroImovel = bairroImovel;
        this.numImovel = numImovel;
        this.ufImovel = ufImovel;
        this.endImovel = endImovel;
        this.cepImovel = cepImovel;
        this.metragemImovel = metragemImovel;
        this.valorImovel = valorImovel;
        this.areaImovel = areaImovel;
        this.tipoAnuncio = tipoAnuncio;
        this.descricaoImovel = descricaoImovel;
        this.cidadeImovel = cidadeImovel;
        this.pessoa = pessoa;
    }

    public Integer getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(Integer idImovel) {
        this.idImovel = idImovel;
    }

    public String getBairroImovel() {
        return bairroImovel;
    }

    public void setBairroImovel(String bairroImovel) {
        this.bairroImovel = bairroImovel;
    }

    public Integer getNumImovel() {
        return numImovel;
    }

    public void setNumImovel(Integer numImovel) {
        this.numImovel = numImovel;
    }

    public String getUfImovel() {
        return ufImovel;
    }

    public void setUfImovel(String ufImovel) {
        this.ufImovel = ufImovel;
    }

    public String getEndImovel() {
        return endImovel;
    }

    public void setEndImovel(String endImovel) {
        this.endImovel = endImovel;
    }

    public String getCepImovel() {
        return cepImovel;
    }

    public void setCepImovel(String cepImovel) {
        this.cepImovel = cepImovel;
    }

    public String getMetragemImovel() {
        return metragemImovel;
    }

    public void setMetragemImovel(String metragemImovel) {
        this.metragemImovel = metragemImovel;
    }

    public Double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(Double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public Double getAreaImovel() {
        return areaImovel;
    }

    public void setAreaImovel(Double areaImovel) {
        this.areaImovel = areaImovel;
    }

    public String getTipoAnuncio() {
        return tipoAnuncio;
    }

    public void setTipoAnuncio(String tipoAnuncio) {
        this.tipoAnuncio = tipoAnuncio;
    }

    public String getDescricaoImovel() {
        return descricaoImovel;
    }

    public void setDescricaoImovel(String descricaoImovel) {
        this.descricaoImovel = descricaoImovel;
    }

    public String getCidadeImovel() {
        return cidadeImovel;
    }

    public void setCidadeImovel(String cidadeImovel) {
        this.cidadeImovel = cidadeImovel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    

    
}
