

package model;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Przychodnia {
    
    private Long id;
    Pacjenci pacjenci = new Pacjenci();

    public Przychodnia(){}
    @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
	
    public Pacjenci getPacjenci() {
        return pacjenci;
    }

    public void setPacjenci(Pacjenci pacjenci) {
        this.pacjenci = pacjenci;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    
}
