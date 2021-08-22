package edu.neu.csye7374.carmodel;

import edu.neu.csye7374.api.AutoAPI;

public class SportyCoupe implements AutoAPI{
	
	private double price = 49800.00;
	private String description = "Audi TT Coupe";

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

}
