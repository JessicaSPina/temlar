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
public class TipoImovel {
    private Integer idTipo;
    private String nomeTipo;

    public TipoImovel(Integer idTipo, String nomeTipo) {
        this.idTipo = idTipo;
        this.nomeTipo = nomeTipo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }
    
    
    
}
