package edu.neu.csye7374.singleton.factory;

import edu.neu.csye7374.factory.AbstractItemFactory;
import edu.neu.csye7374.factory.IphoneFactory;

public class SingletonIphoneFactory{

    private static AbstractItemFactory iphoneFactory = null;
	
	
	public static AbstractItemFactory getObject() {
		if(iphoneFactory == null) {
			iphoneFactory = new IphoneFactory();
		}
		return iphoneFactory;
	}

}
