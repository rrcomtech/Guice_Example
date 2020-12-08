package de.btu.sst.doc_dec;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 *  
 * @author Robert Alexander Uwe Richter
 * @date 08.12.2020
 * @organization BTU Cottbus-Senftenberg, Faculty 1, Chair for Software-Systems Engineering
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        // Create Guice objects.    	
    	System.out.println("The management is about to decide which tree will grow in the ");
    	Injector injector = Guice.createInjector(new TreeNurseryManagement());
    	TreeNursery nursery = injector.getInstance(TreeNursery.class);
    	
    	nursery.is_growing();
        
    }
}
