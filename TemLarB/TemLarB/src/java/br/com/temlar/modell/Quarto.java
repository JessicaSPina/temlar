/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.modell;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Ana Paula
 */
public class Quarto {
    private Integer idQuarto;
    private String tipoTelhadoQuarto;
    private String tipoPisoQuarto;
    private String situacaoPinturaQuarto;
    private String bairroQuarto;
    private String endQuarto;
    private Integer numQuarto;
    private Boolean mobiliaQuarto;
    private String cidadeQuarto;
    private String ufQuarto;
    private Double valorQuarto;
    private Pessoa pessoa;
    private String cepQuarto;
  

    public Quarto() {
        
    }

    public Quarto(Integer idQuarto, String tipoTelhadoQuarto, String tipoPisoQuarto, String situacaoPinturaQuarto, String bairroQuarto, String endQuarto, Integer numQuarto, Boolean mobiliaQuarto, String cidadeQuarto, String ufQuarto, Double valorQuarto, Pessoa pessoa, String cepQuarto) {
        this.idQuarto = idQuarto;
        this.tipoTelhadoQuarto = tipoTelhadoQuarto;
        this.tipoPisoQuarto = tipoPisoQuarto;
        this.situacaoPinturaQuarto = situacaoPinturaQuarto;
        this.bairroQuarto = bairroQuarto;
        this.endQuarto = endQuarto;
        this.numQuarto = numQuarto;
        this.mobiliaQuarto = mobiliaQuarto;
        this.cidadeQuarto = cidadeQuarto;
        this.ufQuarto = ufQuarto;
        this.valorQuarto = valorQuarto;
        this.pessoa = pessoa;
        this.cepQuarto = cepQuarto;
    }

    public Integer getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Integer idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getTipoTelhadoQuarto() {
        return tipoTelhadoQuarto;
    }

    public void setTipoTelhadoQuarto(String tipoTelhadoQuarto) {
        this.tipoTelhadoQuarto = tipoTelhadoQuarto;
    }

    public String getTipoPisoQuarto() {
        return tipoPisoQuarto;
    }

    public void setTipoPisoQuarto(String tipoPisoQuarto) {
        this.tipoPisoQuarto = tipoPisoQuarto;
    }

    public String getSituacaoPinturaQuarto() {
        return situacaoPinturaQuarto;
    }

    public void setSituacaoPinturaQuarto(String situacaoPinturaQuarto) {
        this.situacaoPinturaQuarto = situacaoPinturaQuarto;
    }

    public String getBairroQuarto() {
        return bairroQuarto;
    }

    public void setBairroQuarto(String bairroQuarto) {
        this.bairroQuarto = bairroQuarto;
    }

    public String getEndQuarto() {
        return endQuarto;
    }

    public void setEndQuarto(String endQuarto) {
        this.endQuarto = endQuarto;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    

    public String getCidadeQuarto() {
        return cidadeQuarto;
    }

    public void setCidadeQuarto(String cidadeQuarto) {
        this.cidadeQuarto = cidadeQuarto;
    }

    public String getUfQuarto() {
        return ufQuarto;
    }

    public void setUfQuarto(String ufQuarto) {
        this.ufQuarto = ufQuarto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getValorQuarto() {
        return valorQuarto;
    }

    public void setValorQuarto(Double valorQuarto) {
        this.valorQuarto = valorQuarto;
    }

    public Boolean getMobiliaQuarto() {
        return mobiliaQuarto;
    }

    public void setMobiliaQuarto(Boolean mobiliaQuarto) {
        this.mobiliaQuarto = mobiliaQuarto;
    }

    public String getCepQuarto() {
        return cepQuarto;
    }

    public void setCepQuarto(String cepQuarto) {
        this.cepQuarto = cepQuarto;
    }
    
    
}
