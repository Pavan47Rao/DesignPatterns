package edu.neu.csye7374.singleton.factory;

import edu.neu.csye7374.factory.AbstractItemFactory;
import edu.neu.csye7374.factory.TraveltripFactory;

public class SingletonTravelTripFactory{

private static AbstractItemFactory traveltripFactory = null;
	
	
	public static AbstractItemFactory getObject() {
		if( traveltripFactory == null) {
			 traveltripFactory = new TraveltripFactory();
		}
		return  traveltripFactory;
	}

}
