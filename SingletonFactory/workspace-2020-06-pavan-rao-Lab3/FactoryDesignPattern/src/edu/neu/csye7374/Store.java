package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.neu.csye7374.api.AbstractItemAPI;
import edu.neu.csye7374.api.AbstractStoreAPI;
import edu.neu.csye7374.factory.AbstractItemFactory;
import edu.neu.csye7374.factory.AbstractStoreFactory;
import edu.neu.csye7374.singleton.factory.SingletonBreadFactory;
import edu.neu.csye7374.singleton.factory.SingletonIphoneFactory;
import edu.neu.csye7374.singleton.factory.SingletonStoreFactory;
import edu.neu.csye7374.singleton.factory.SingletonTravelTripFactory;

public class Store extends AbstractStoreAPI{
	
	private int id;
	private String name;
	private String description;
	
	List<AbstractItemAPI> items = new ArrayList();
	
	{
		this.id = 1;
		this.name = "Store1";
		this.description = "Store description";
	}
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store(int id, String name, String description) {
		super();
		this.id = id;
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
	public void addItem(AbstractItemAPI item) {
		// TODO Auto-generated method stub
		items.add(item);
		
	}

	@Override
	public void sellItem(AbstractItemAPI item) {
		// TODO Auto-generated method stub
		items.remove(item);
		
	}
	
	@Override
	public  void showInventory() {
		for(AbstractItemAPI item : items) {
			System.out.println(item);
		}
	}

	@Override
	public void sortInventory(Comparator<AbstractItemAPI> c) {
		// TODO Auto-generated method stub
		
		items.sort(c);
		
	}
	
	public static void demo() {
		System.out.println(Store.class.getName() +".demo()...");
		
		AbstractStoreFactory storeFactory = SingletonStoreFactory.getObject();
		AbstractStoreAPI store = storeFactory.getInstance();
		
		AbstractItemFactory iphoneFactory = SingletonIphoneFactory.getObject();
		AbstractItemFactory breadFactory = SingletonBreadFactory.getObject();
		AbstractItemFactory traveltripFactory = SingletonTravelTripFactory.getObject();
		
		AbstractItemAPI iphone = iphoneFactory.getInstance();
		AbstractItemAPI bread = breadFactory.getInstance();
		AbstractItemAPI travelTrip = traveltripFactory.getInstance();
		
		store.addItem(iphone);
		store.addItem(bread);
		store.addItem(travelTrip);
		
		System.out.println("### List of Items in Store ###");
		store.showInventory();
		
		System.out.println("### Sort items by Price ###");
		store.sortInventory(new SortByPrice());
		store.showInventory();
		
		System.out.println("### Sort items by Name ###");
		store.sortInventory(new SortByName());
		store.showInventory();
		
		
		System.out.println("### Remove iphone from store ###");
		store.sellItem(iphone);
		store.showInventory();
		
		System.out.println(Store.class.getName() +".demo()... done!");
	}

}


class SortByPrice implements Comparator<AbstractItemAPI>{

	@Override
	public int compare(AbstractItemAPI item1, AbstractItemAPI item2) {
		// TODO Auto-generated method stub
		return (int) (item2.getPrice() - item1.getPrice());
	}
	
}

class SortByName implements Comparator<AbstractItemAPI>{

	@Override
	public int compare(AbstractItemAPI item1, AbstractItemAPI item2) {
		// TODO Auto-generated method stub
		return item1.getName().compareToIgnoreCase(item2.getName());
	}
	
}