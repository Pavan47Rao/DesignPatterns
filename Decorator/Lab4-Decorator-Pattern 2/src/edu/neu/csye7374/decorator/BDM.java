package edu.neu.csye7374.decorator;

import edu.neu.csye7374.api.AutoAPI;
import edu.neu.csye7374.api.AutoDecoratorAPI;

public class BDM extends AutoDecoratorAPI{
	public static final double bdmPrice = 599.99;
	public static final String bdmDecorator = " +BDM";
	
	public BDM(AutoAPI autoAPI) {
		super(autoAPI);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+bdmPrice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+bdmDecorator;
	}
}
