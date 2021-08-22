package edu.neu.csye7374.decorator;

import edu.neu.csye7374.api.AutoAPI;
import edu.neu.csye7374.api.AutoDecoratorAPI;

public class BB extends AutoDecoratorAPI{
	public static final double bbPrice = 199.00;
	public static final String bbDecorator = " +BB";
	public BB(AutoAPI autoAPI) {
		super(autoAPI);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+bbPrice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+bbDecorator;
	}
}
