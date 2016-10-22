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
public class Casa extends Imovel {
    
    private Integer idCasa;
    private Integer numQuarto;
    private Integer numBanheiro;
    private String possuiDespejo;
    private String situacaoPintura;
    private Integer qntVagGaragem;
    private Integer numCozinhas;
    private Integer numSalas;
    private String tipoPiso;
    private String mobilia;
    private Integer numSuite;
    private String tipoQuintal;
    private String areaLazer;
    private Integer andar;
    private String areaSevico; 
    private String tipoTelhado;
    private String tipoCasa;
    private Imovel imovel;


    public Casa() {
    }

    public Casa(Integer idCasa, Integer numQuarto, Integer numBanheiro, String possuiDespejo, String situacaoPintura, Integer qntVagGaragem, Integer numCozinhas, Integer numSalas, String tipoPiso, String mobilia, Integer numSuite, String tipoQuintal, String areaLazer, Integer andar, String areaSevico, String tipoTelhado, String tipoCasa, Imovel imovel) {
        this.idCasa = idCasa;
        this.numQuarto = numQuarto;
        this.numBanheiro = numBanheiro;
        this.possuiDespejo = possuiDespejo;
        this.situacaoPintura = situacaoPintura;
        this.qntVagGaragem = qntVagGaragem;
        this.numCozinhas = numCozinhas;
        this.numSalas = numSalas;
        this.tipoPiso = tipoPiso;
        this.mobilia = mobilia;
        this.numSuite = numSuite;
        this.tipoQuintal = tipoQuintal;
        this.areaLazer = areaLazer;
        this.andar = andar;
        this.areaSevico = areaSevico;
        this.tipoTelhado = tipoTelhado;
        this.tipoCasa = tipoCasa;
        this.imovel = imovel;
    }

    public Casa(Integer idCasa, Integer numQuarto, Integer numBanheiro, String possuiDespejo, String situacaoPintura, Integer qntVagGaragem, Integer numCozinhas, Integer numSalas, String tipoPiso, String mobilia, Integer numSuite, String tipoQuintal, String areaLazer, Integer andar, String areaSevico, String tipoTelhado, String tipoCasa, Imovel imovel, Integer idImovel, String bairroImovel, Integer numImovel, String ufImovel, String endImovel, String cepImovel, String metragemImovel, Double valorImovel, Double areaImovel, String tipoAnuncio, String descricaoImovel, String cidadeImovel, Pessoa pessoa) {
        super(idImovel, bairroImovel, numImovel, ufImovel, endImovel, cepImovel, metragemImovel, valorImovel, areaImovel, tipoAnuncio, descricaoImovel, cidadeImovel, pessoa);
        this.idCasa = idCasa;
        this.numQuarto = numQuarto;
        this.numBanheiro = numBanheiro;
        this.possuiDespejo = possuiDespejo;
        this.situacaoPintura = situacaoPintura;
        this.qntVagGaragem = qntVagGaragem;
        this.numCozinhas = numCozinhas;
        this.numSalas = numSalas;
        this.tipoPiso = tipoPiso;
        this.mobilia = mobilia;
        this.numSuite = numSuite;
        this.tipoQuintal = tipoQuintal;
        this.areaLazer = areaLazer;
        this.andar = andar;
        this.areaSevico = areaSevico;
        this.tipoTelhado = tipoTelhado;
        this.tipoCasa = tipoCasa;
        this.imovel = imovel;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Integer getNumBanheiro() {
        return numBanheiro;
    }

    public void setNumBanheiro(Integer numBanheiro) {
        this.numBanheiro = numBanheiro;
    }

    public String getPossuiDespejo() {
        return possuiDespejo;
    }

    public void setPossuiDespejo(String possuiDespejo) {
        this.possuiDespejo = possuiDespejo;
    }

    public String getSituacaoPintura() {
        return situacaoPintura;
    }

    public void setSituacaoPintura(String situacaoPintura) {
        this.situacaoPintura = situacaoPintura;
    }

    public Integer getQntVagGaragem() {
        return qntVagGaragem;
    }

    public void setQntVagGaragem(Integer qntVagGaragem) {
        this.qntVagGaragem = qntVagGaragem;
    }

    public Integer getNumCozinhas() {
        return numCozinhas;
    }

    public void setNumCozinhas(Integer numCozinhas) {
        this.numCozinhas = numCozinhas;
    }

    public Integer getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(Integer numSalas) {
        this.numSalas = numSalas;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public String getMobilia() {
        return mobilia;
    }

    public void setMobilia(String mobilia) {
        this.mobilia = mobilia;
    }

    public Integer getNumSuite() {
        return numSuite;
    }

    public void setNumSuite(Integer numSuite) {
        this.numSuite = numSuite;
    }

    public String getTipoQuintal() {
        return tipoQuintal;
    }

    public void setTipoQuintal(String tipoQuintal) {
        this.tipoQuintal = tipoQuintal;
    }

    public String getAreaLazer() {
        return areaLazer;
    }

    public void setAreaLazer(String areaLazer) {
        this.areaLazer = areaLazer;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public String getAreaSevico() {
        return areaSevico;
    }

    public void setAreaSevico(String areaSevico) {
        this.areaSevico = areaSevico;
    }

    public String getTipoTelhado() {
        return tipoTelhado;
    }

    public void setTipoTelhado(String tipoTelhado) {
        this.tipoTelhado = tipoTelhado;
    }

    public String getTipoCasa() {
        return tipoCasa;
    }

    public void setTipoCasa(String tipoCasa) {
        this.tipoCasa = tipoCasa;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

   
}
