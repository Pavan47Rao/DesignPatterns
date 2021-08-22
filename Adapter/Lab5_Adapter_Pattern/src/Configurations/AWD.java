package Configurations;

import API.Decorator.AutoAPI;
import API.Decorator.AutoDecoratorAPI;

public class AWD extends AutoDecoratorAPI {
	private int price = 3299;
	private String description = "All-wheel drive" ;
	private final AutoAPI autoapi;
	public AWD(AutoAPI autoapi) {
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
