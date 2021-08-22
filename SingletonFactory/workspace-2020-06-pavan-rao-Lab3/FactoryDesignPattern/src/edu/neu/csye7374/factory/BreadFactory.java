package edu.neu.csye7374.factory;

import edu.neu.csye7374.api.AbstractItemAPI;
import edu.neu.csye7374.item.Bread;

public class BreadFactory extends AbstractItemFactory{

	public AbstractItemAPI getInstance() {
		// TODO Auto-generated method stub
		return new Bread();
	}

}
