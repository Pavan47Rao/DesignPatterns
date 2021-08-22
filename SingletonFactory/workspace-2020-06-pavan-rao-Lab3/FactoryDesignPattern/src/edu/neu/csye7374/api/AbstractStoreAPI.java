package edu.neu.csye7374.api;

import java.util.Comparator;

public abstract class AbstractStoreAPI {
	
	public abstract int getId();
	public abstract void setId(int id);
	
	public abstract String getName();
	public abstract void setName(String name);
	
	public abstract String getDescription();
	public abstract void setDescription(String description);
	
	public abstract void addItem(AbstractItemAPI item);
	public abstract void sellItem(AbstractItemAPI item);
	
	public abstract void sortInventory(Comparator<AbstractItemAPI> c);
	public  abstract void showInventory();
}
