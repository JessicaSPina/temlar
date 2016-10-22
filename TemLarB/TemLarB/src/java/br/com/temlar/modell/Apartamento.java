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
public class Apartamento {
    
    private Integer idApartamento;
    private Integer andar;
    private Casa casa;
    private Imovel imovel;

    public Apartamento() {
    }

    public Apartamento(Integer idApartamento, Integer andar, Casa casa, Imovel imovel) {
        this.idApartamento = idApartamento;
        this.andar = andar;
        this.casa = casa;
        this.imovel = imovel;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    

}
