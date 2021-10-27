/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cliente.bean;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author tecsistem
 */
public class MaskCampo {


   
    public MaskFormatter maskTelefone(JFormattedTextField textField) 
       throws ParseException{
        
    MaskFormatter mask = null;  
    mask = new MaskFormatter("(##)#####-####");
    mask.setOverwriteMode(true);
    mask.setValidCharacters("0123456789");
    mask.setPlaceholderCharacter('_');
    mask.install(textField);
    
    return mask;
    }
                     
       
    public MaskFormatter maskCelefone(JFormattedTextField textField) 
       throws ParseException{
        
    MaskFormatter mask = null;  
    mask = new MaskFormatter("(##)#####-####");
    mask.setOverwriteMode(true);
    mask.setValidCharacters("0123456789");
    mask.setPlaceholderCharacter('_');
    mask.install(textField);
    
    return mask;
    }
    
      public MaskFormatter maskCep(JFormattedTextField textField) 
       throws ParseException{
        
    MaskFormatter mask = null;  
    mask = new MaskFormatter("####-####");
    mask.setOverwriteMode(true);
    mask.setValidCharacters("0123456789");
    mask.setPlaceholderCharacter('_');
    mask.install(textField);
    
    return mask;
    }
        public MaskFormatter maskCnpj(JFormattedTextField textField) 
       throws ParseException{
        
    MaskFormatter mask = null;  
    mask = new MaskFormatter("##.###.###/####-##");
    mask.setOverwriteMode(true);
    mask.setValidCharacters("0123456789");
    mask.setPlaceholderCharacter('_');
    mask.install(textField);
    
    return mask;
    }
     
   
                    public MaskFormatter maskCpf(JFormattedTextField textField) 
       throws ParseException{
        
    MaskFormatter mask = null;  
    mask = new MaskFormatter("###.###.###.##");
    mask.setOverwriteMode(true);
    mask.setValidCharacters("0123456789");
    mask.setPlaceholderCharacter('_');
    mask.install(textField);
    
    return mask;
    }
            
}       

