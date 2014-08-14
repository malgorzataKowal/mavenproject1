/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Validator;

import model.Pacjenci;
import model.Przychodnia;
import model.util.StringUtils;
import org.springframework.validation.Errors;

/**
 *
 * @author kursant3
 */
public class PacjentValidator {
    
   public void validate( Pacjenci pacjenci, Errors errors ) {
		if ( StringUtils.isEmpty(pacjenci.getName()) ) {
			errors.rejectValue( "pacjenci.name", "required" );
		}
		
		if (StringUtils.isEmpty(pacjenci.getSurname()) ) {
			errors.rejectValue( "pacjenci.surname", "required" );
		}
    } 
}
