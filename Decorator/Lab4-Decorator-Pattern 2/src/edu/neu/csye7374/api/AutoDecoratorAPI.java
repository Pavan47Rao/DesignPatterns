package edu.neu.csye7374.api;

public  abstract class AutoDecoratorAPI implements AutoAPI{
	
	private AutoAPI autoAPI;
	
	
	 public AutoDecoratorAPI(AutoAPI autoAPI) {
		this.autoAPI = autoAPI;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.autoAPI.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.autoAPI.getDescription();
	}
	
	

}
