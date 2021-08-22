package edu.neu.csye7374.factory;

import edu.neu.csye7374.Store;
import edu.neu.csye7374.api.AbstractStoreAPI;

public class StoreFactory extends AbstractStoreFactory{
	
	public AbstractStoreAPI getInstance() {
		return new Store();
	}

}
