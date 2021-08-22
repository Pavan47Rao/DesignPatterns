package Configurations;

import API.Decorator.AutoAPI;
import API.Decorator.AutoDecoratorAPI;

public class BDM extends AutoDecoratorAPI {
	private int price = 258;
	private String description = "Blind-side Detection Monitor" ;
	private final AutoAPI autoapi;
	public BDM(AutoAPI autoapi) {
		this.autoapi = autoapi;	
		//super.itemList.add(this);
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
