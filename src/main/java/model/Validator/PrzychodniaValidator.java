/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Validator;

import model.Przychodnia;
import org.springframework.validation.Errors;

/**
 *
 * @author kursant3
 */
public class PrzychodniaValidator {
    
    
    private PacjentValidator PACJENT_VALIDATOR;
    
    public PrzychodniaValidator(){
    
   PACJENT_VALIDATOR = new PacjentValidator();
    
    }
    public void validate(Przychodnia przychodnia,Errors errors){
        
     PACJENT_VALIDATOR.validate(przychodnia.getPacjenci(), errors);
    
    
    
    }
}
