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
public class Plano {
    private Integer idPlano;
    private String nomePlano;
    private String periodoPlano;
    private Double valorPlano;
    private String regrasPlano;
    private Integer quantidadeFotosPlano;
    private Integer quantidadeImoveisPlano;

    public Plano() {
    }

    public Plano(Integer idPlano, String nomePlano, String periodoPlano, Double valorPlano, String regrasPlano, Integer quantidadeFotosPlano, Integer quantidadeImoveisPlano) {
        this.idPlano = idPlano;
        this.nomePlano = nomePlano;
        this.periodoPlano = periodoPlano;
        this.valorPlano = valorPlano;
        this.regrasPlano = regrasPlano;
        this.quantidadeFotosPlano = quantidadeFotosPlano;
        this.quantidadeImoveisPlano = quantidadeImoveisPlano;
    }

    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getPeriodoPlano() {
        return periodoPlano;
    }

    public void setPeriodoPlano(String periodoPlano) {
        this.periodoPlano = periodoPlano;
    }

    public Double getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(Double valorPlano) {
        this.valorPlano = valorPlano;
    }

    public String getRegrasPlano() {
        return regrasPlano;
    }

    public void setRegrasPlano(String regrasPlano) {
        this.regrasPlano = regrasPlano;
    }

    public Integer getQuantidadeFotosPlano() {
        return quantidadeFotosPlano;
    }

    public void setQuantidadeFotosPlano(Integer quantidadeFotosPlano) {
        this.quantidadeFotosPlano = quantidadeFotosPlano;
    }

    public Integer getQuantidadeImoveisPlano() {
        return quantidadeImoveisPlano;
    }

    public void setQuantidadeImoveisPlano(Integer quantidadeImoveisPlano) {
        this.quantidadeImoveisPlano = quantidadeImoveisPlano;
    }

   

}


