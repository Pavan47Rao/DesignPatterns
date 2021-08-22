package edu.neu.csye7374.decorator;

import edu.neu.csye7374.api.AutoAPI;
import edu.neu.csye7374.api.AutoDecoratorAPI;

public class AC extends AutoDecoratorAPI{
	
	public static final String AC_DESCRIPTION = " + Air Conditioner (AC)";
	public static double AC = 450.00;
	
		
	public AC(AutoAPI autoAPI) {
		
		super(autoAPI);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() + AC;
		
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + AC_DESCRIPTION;
	}
}
