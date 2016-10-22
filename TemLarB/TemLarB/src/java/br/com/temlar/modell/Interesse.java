/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.modell;

import java.util.Date;


/**
 *
 * @author PC 05
 */
public class Interesse {
    private Integer idInteresse;
    private Date dataInteresse;
    private Pessoa pessoa;
    
    public Interesse(){ 
    }

    public Interesse(Integer idInteresse, Date dataInteresse, Pessoa pessoa) {
        this.idInteresse = idInteresse;
        this.dataInteresse = dataInteresse;
        this.pessoa = pessoa;
    }

    public Integer getIdInteresse() {
        return idInteresse;
    }

    public void setIdInteresse(Integer idInteresse) {
        this.idInteresse = idInteresse;
    }

    public Date getDataInteresse() {
        return dataInteresse;
    }

    public void setDataInteresse(Date dataInteresse) {
        this.dataInteresse = dataInteresse;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

   
    
}
