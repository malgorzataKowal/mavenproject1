/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

//import javax.enterprise.inject.Model;
import javax.annotation.Resource;
import model.Pacjenci;
import model.Przychodnia;
import model.Validator.PacjentValidator;
import model.Validator.PrzychodniaValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.repository.przychodniaRepository;
import org.springframework.validation.Errors;


@Controller
@RequestMapping( "/addPacjenci.do" )
public class PrzychodniaController {
    
    private final static String FORM_VIEW = "addPacjenciForm";
    private final static String FORM_HOME="home";
    private final static String FORM_CONTROLLER="connector";
    
    @Resource( name="inPrzychodniaRepository" )
	private przychodniaRepository przychodnia_repository;
    
    
    @RequestMapping( method = RequestMethod.GET )
	public String setupForm( Model model ) {
		model.addAttribute("przychodnia",new Przychodnia());
		
		return FORM_VIEW;
	}
     @RequestMapping( method = RequestMethod.POST )
	public String submitForm( @ModelAttribute Przychodnia przychodnia, Errors errors) {
		
            	new PrzychodniaValidator().validate( przychodnia, errors );
             if ( errors.hasErrors() ) {
             
                 return FORM_VIEW;
             }
		 przychodnia_repository.save(przychodnia);
		 przychodnia_repository.logToSysout();
                 przychodnia_repository.findAllEntries();
                 
		System.out.println("przychodnia");
                
		return FORM_CONTROLLER;
	}   
}
