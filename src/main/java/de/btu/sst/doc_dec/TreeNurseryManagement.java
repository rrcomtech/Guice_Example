package de.btu.sst.doc_dec;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 *  
 * @author Robert Alexander Uwe Richter
 * @date 08.12.2020
 * @organization BTU Cottbus-Senftenberg, Faculty 1, Chair for Software-Systems Engineering
 *
 */
public class TreeNurseryManagement extends AbstractModule {

	@Override
	protected void configure() {				
		// The plant is a tree.
		bind(IPlant.class).to(Tree.class);
		// The tree is a sequoia tree!
		bind(Tree.class).to(SequoiaTree.class);		
		// The management has decided.
	}	
	
}
