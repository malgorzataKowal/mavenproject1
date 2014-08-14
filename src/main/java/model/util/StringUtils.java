/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.util;

/**
 *
 * @author kursant3
 */
public class StringUtils {
    
    
    public String wrapNullInEmpty( String str ) {
		
		if ( str == null ) {
			return "";
		}
		
		return str;
		
	}
	
	public static boolean isEmpty( String str ) {
		if ( str == null || str.length() == 0 ) {
			return true;
		}
		
		return false;
	}
    
}
