/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.temlar.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ana Paula
 */
public class Conversoes {
    public static Date converterData(String data) throws Exception{
        
            if(data != null || !data.trim().equals("")){
                try{
                    SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
                    return fmt.parse(data);
                }catch(Exception ex){
                    throw new Exception(ex.getMessage());
                }
            }else{
                return null;
            }
        
    }
    
}
