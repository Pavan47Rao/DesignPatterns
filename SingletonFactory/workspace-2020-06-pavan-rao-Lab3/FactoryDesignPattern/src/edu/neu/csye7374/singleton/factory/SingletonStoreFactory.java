package edu.neu.csye7374.singleton.factory;

import edu.neu.csye7374.factory.AbstractStoreFactory;
import edu.neu.csye7374.factory.StoreFactory;

public class SingletonStoreFactory {
	
   private static AbstractStoreFactory storeFactory = null;
	
	
	public static AbstractStoreFactory getObject() {
		if(storeFactory == null) {
			storeFactory = new StoreFactory();
		}
		return storeFactory;
	}

}
