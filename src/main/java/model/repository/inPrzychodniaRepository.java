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
    
    private Map pacjenci_zbi�r = new HashMap();
    
   @Override
    public void save( Przychodnia przychodnia ) {
		final boolean notSavedYet = (przychodnia.getId() == null );
		if ( notSavedYet ) {
			przychodnia.setId( determineId() );
		}
		
		pacjenci_zbi�r.put( przychodnia.getId(), przychodnia );
	}

    @Override
    public void update(Przychodnia przychodnia) {
        
    }

    @Override
    public Przychodnia findById(Long id) {
       return (Przychodnia)pacjenci_zbi�r.get( id );
    }

    @Override
    public List findAllEntries() {
      return new ArrayList( pacjenci_zbi�r.values() );
    }

    @Override
    public void logToSysout() {
      System.out.println("Aktualny stan bazy = " + pacjenci_zbi�r );
    }
	
    
    private Long determineId() {
		return new Long( pacjenci_zbi�r.keySet().size() + 1 );
	}

   
}
