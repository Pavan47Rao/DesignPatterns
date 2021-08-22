package Configurations;



import java.util.List;

import API.Decorator.AutoAPI;
import API.Decorator.AutoDecoratorAPI;

public class ABS extends AutoDecoratorAPI {
	private int price = 699;
	private String description = "Anti-lock braking system" ;
	private final AutoAPI autoapi;
	
	public ABS(AutoAPI autoapi) {
		
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
