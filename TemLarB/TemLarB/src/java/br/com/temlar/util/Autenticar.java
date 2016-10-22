/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.temlar.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author tiago
 */
public class Autenticar extends Authenticator {

    private String usuario;
    private String senha;

    public Autenticar(){
    }

    public Autenticar(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(usuario, senha);
    }

}