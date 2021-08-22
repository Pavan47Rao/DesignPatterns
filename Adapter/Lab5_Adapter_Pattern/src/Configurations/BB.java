package Configurations;

import API.Decorator.AutoAPI;
import API.Decorator.AutoDecoratorAPI;

public class BB extends AutoDecoratorAPI {
	private int price = 997;
	private String description = "Bumper to Bumper warrantee" ;
	private final AutoAPI autoapi;
	public BB(AutoAPI autoapi) {
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
