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
public class Lote  extends Imovel{
    private Integer idLote;
    private String tipoMuro;
    private String aterrado;
    private Imovel imovel;
    private Pessoa pessoa;

    public Lote() {
    }

    public Lote(Integer idLote, String tipoMuro, String aterrado, Imovel imovel, Pessoa pessoa) {
        this.idLote = idLote;
        this.tipoMuro = tipoMuro;
        this.aterrado = aterrado;
        this.imovel = imovel;
        this.pessoa = pessoa;
    }
    

    public Integer getIdLote() {
        return idLote;
    }

    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }

    public String getTipoMuro() {
        return tipoMuro;
    }

    public void setTipoMuro(String tipoMuro) {
        this.tipoMuro = tipoMuro;
    }

    public String getAterrado() {
        return aterrado;
    }

    public void setAterrado(String aterrado) {
        this.aterrado = aterrado;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    

   
           
    
    
}
