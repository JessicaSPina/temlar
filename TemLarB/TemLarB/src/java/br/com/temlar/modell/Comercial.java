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
public class Comercial extends Imovel{
  
    private Integer idComercial;
    private Integer numSalas;
    private String mobilia;
    private String tipoPiso;
    private String tipoTelhado;
    private String situacaoPintura;
    private Integer numBanheiro;
    private Integer qntVagGaragem;
    private String copa;
    private Imovel imovel;

    public Comercial() {
    }

    public Comercial(Integer idComercial, Integer numSalas, String mobilia, String tipoPiso, String tipoTelhado, String situacaoPintura, Integer numBanheiro, Integer qntVagGaragem, String copa, Imovel imovel) {
        this.idComercial = idComercial;
        this.numSalas = numSalas;
        this.mobilia = mobilia;
        this.tipoPiso = tipoPiso;
        this.tipoTelhado = tipoTelhado;
        this.situacaoPintura = situacaoPintura;
        this.numBanheiro = numBanheiro;
        this.qntVagGaragem = qntVagGaragem;
        this.copa = copa;
        this.imovel = imovel;
    }

    public Comercial(Integer idComercial, Integer numSalas, String mobilia, String tipoPiso, String tipoTelhado, String situacaoPintura, Integer numBanheiro, Integer qntVagGaragem, String copa, Imovel imovel, Integer idImovel, String bairroImovel, Integer numImovel, String ufImovel, String endImovel, String cepImovel, String metragemImovel, Double valorImovel, Double areaImovel, String tipoAnuncio, String descricaoImovel, String cidadeImovel, Pessoa pessoa) {
        super(idImovel, bairroImovel, numImovel, ufImovel, endImovel, cepImovel, metragemImovel, valorImovel, areaImovel, tipoAnuncio, descricaoImovel, cidadeImovel, pessoa);
        this.idComercial = idComercial;
        this.numSalas = numSalas;
        this.mobilia = mobilia;
        this.tipoPiso = tipoPiso;
        this.tipoTelhado = tipoTelhado;
        this.situacaoPintura = situacaoPintura;
        this.numBanheiro = numBanheiro;
        this.qntVagGaragem = qntVagGaragem;
        this.copa = copa;
        this.imovel = imovel;
    }

    public Integer getIdComercial() {
        return idComercial;
    }

    public void setIdComercial(Integer idComercial) {
        this.idComercial = idComercial;
    }

    public Integer getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(Integer numSalas) {
        this.numSalas = numSalas;
    }

    public String getMobilia() {
        return mobilia;
    }

    public void setMobilia(String mobilia) {
        this.mobilia = mobilia;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public String getTipoTelhado() {
        return tipoTelhado;
    }

    public void setTipoTelhado(String tipoTelhado) {
        this.tipoTelhado = tipoTelhado;
    }

    public String getSituacaoPintura() {
        return situacaoPintura;
    }

    public void setSituacaoPintura(String situacaoPintura) {
        this.situacaoPintura = situacaoPintura;
    }

    public Integer getNumBanheiro() {
        return numBanheiro;
    }

    public void setNumBanheiro(Integer numBanheiro) {
        this.numBanheiro = numBanheiro;
    }

    public Integer getQntVagGaragem() {
        return qntVagGaragem;
    }

    public void setQntVagGaragem(Integer qntVagGaragem) {
        this.qntVagGaragem = qntVagGaragem;
    }

    public String getCopa() {
        return copa;
    }

    public void setCopa(String copa) {
        this.copa = copa;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    
    
    
    
    
}
