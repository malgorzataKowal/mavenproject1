/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.repository;

import java.util.List;
import model.Przychodnia;

/**
 *
 * @author kursant3
 */
public interface przychodniaRepository {
    
    public abstract void save( Przychodnia przychodnia );

	public abstract void update( Przychodnia przychodnia );

	public abstract Przychodnia findById( Long id );

	public abstract List findAllEntries();
	
	public abstract void logToSysout();
        
    
    
}
