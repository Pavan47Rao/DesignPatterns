package edu.neu.csye7374.decorator;

import edu.neu.csye7374.api.AutoAPI;
import edu.neu.csye7374.api.AutoDecoratorAPI;

public class AWD extends AutoDecoratorAPI{
	
	public static final String AWD_DESCRIPTION = " +All Wheel Drive (AWD)";
	public static double AWD_PRICE = 3000.00;
	
		
	public AWD(AutoAPI autoAPI) {
		
		super(autoAPI);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() + AWD_PRICE;
		
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + AWD_DESCRIPTION;
	}

}
