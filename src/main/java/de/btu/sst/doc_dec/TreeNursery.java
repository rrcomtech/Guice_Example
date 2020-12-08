package de.btu.sst.doc_dec;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 *  
 * @author Robert Alexander Uwe Richter
 * @date 08.12.2020
 * @organization BTU Cottbus-Senftenberg, Faculty 1, Chair for Software-Systems Engineering
 *
 */
public class TreeNursery {
	
	private IPlant plant;
	
	// The management has decided 
	@Inject
	public TreeNursery(IPlant p) {
		this.plant = p;
	}
	
	// Lets see the result of growing our plant.
	public void is_growing() {
		
		this.plant.grow();
		
	}
	
}
