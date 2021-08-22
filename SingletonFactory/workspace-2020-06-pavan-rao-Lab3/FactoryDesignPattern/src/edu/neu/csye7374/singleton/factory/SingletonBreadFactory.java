package edu.neu.csye7374.singleton.factory;

import edu.neu.csye7374.factory.AbstractItemFactory;
import edu.neu.csye7374.factory.BreadFactory;

public class SingletonBreadFactory {
	
	private static AbstractItemFactory breadFactory = null;
	
	
	public static AbstractItemFactory getObject() {
		if(breadFactory == null) {
			breadFactory = new BreadFactory();
		}
		return breadFactory;
	}

}
