package edu.neu.csye7374.item;

import edu.neu.csye7374.api.AbstractItemAPI;

public class Traveltrip extends AbstractItemAPI{
	
	private int id;
	private double price;
	private String name;
	private String description;
	
	{
		this.id = 1;
		this.price = 80.30;
		this.name = "TravelTrip";
		this.description = "Boston bus tour";
	}
	public Traveltrip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Traveltrip(int id, double price, String name, String description) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
	}
	
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#").append(this.id);
		sb.append(" | $").append(this.price);
		sb.append(" | ").append(this.name);
		sb.append(" | ").append(this.description).append("\n");
		
		return sb.toString();
	}

}
