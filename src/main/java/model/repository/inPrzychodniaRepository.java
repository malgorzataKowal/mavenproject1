package model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Pacjenci;
import model.Przychodnia;
import org.springframework.stereotype.Repository;


@Repository( "inPrzychodniaRepository" )
public class inPrzychodniaRepository  implements przychodniaRepository{
    
    private Map pacjenci_zbiór = new HashMap();
    
   @Override
    public void save( Przychodnia przychodnia ) {
		final boolean notSavedYet = (przychodnia.getId() == null );
		if ( notSavedYet ) {
			przychodnia.setId( determineId() );
		}
		
		pacjenci_zbiór.put( przychodnia.getId(), przychodnia );
	}

    @Override
    public void update(Przychodnia przychodnia) {
        
    }

    @Override
    public Przychodnia findById(Long id) {
       return (Przychodnia)pacjenci_zbiór.get( id );
    }

    @Override
    public List findAllEntries() {
      return new ArrayList( pacjenci_zbiór.values() );
    }

    @Override
    public void logToSysout() {
      System.out.println("Aktualny stan bazy = " + pacjenci_zbiór );
    }
	
    
    private Long determineId() {
		return new Long( pacjenci_zbiór.keySet().size() + 1 );
	}

   
}
