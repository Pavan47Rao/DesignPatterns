package Configurations;

import API.Decorator.AutoAPI;
import API.Decorator.AutoDecoratorAPI;

public class AC extends AutoDecoratorAPI {
	private int price = 597;
	private String description = "Air Condition" ;
	private final AutoAPI autoapi;
	public AC(AutoAPI autoapi) {
		this.autoapi = autoapi;	
		
	}
	
	@Override
	public int getPrice() {
		return autoapi.getPrice()+price;
		
	}
	@Override
	public String getDescription() {
		return autoapi.getDescription()+'\n'+description;
	}

}
