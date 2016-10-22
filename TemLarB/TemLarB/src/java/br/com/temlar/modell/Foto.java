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
public class Foto {
    
    private Integer idFoto;
    private String caminho;
    private String descricao;
    private Imovel imovel;
    private Quarto quarto;

    public Foto() {
    }

    public Foto(Integer idFoto, String caminho, String descricao, Imovel imovel, Quarto quarto) {
        this.idFoto = idFoto;
        this.caminho = caminho;
        this.descricao = descricao;
        this.imovel = imovel;
        this.quarto = quarto;
    }

    public Integer getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Integer idFoto) {
        this.idFoto = idFoto;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    
    
}
