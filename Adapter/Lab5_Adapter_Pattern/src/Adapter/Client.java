package Adapter;

import java.util.ArrayList;
import java.util.List;

import API.Adapter.BillingAPI;
import API.Decorator.AutoAPI;
import ConcreteClass.SportyCoupeAuto;
import Configurations.ABS;
import Configurations.AC;
import Configurations.AWD;
import Configurations.BB;
import Configurations.BDM;

public class Client {

	private final BillingAPI bill;
	private List<AutoAPI> autoList;
	private double balance;
	private double discountoff;

	public double getDiscountoff() {
		return discountoff;
	}

	public double getBalance() {
		return balance;
	}

	public Client(BillingAPI bill, double balance, double discountoff) {
		this.bill = bill;
		this.autoList = new ArrayList<AutoAPI>();
		this.discountoff = discountoff;
		this.balance = balance;
	}

	public void add(AutoAPI auto) {
		autoList.add(auto);
	}

	public double totalPrice() {
		return bill.accumulation(autoList);
	}

	public double discountOff() {
		return bill.discountoff(discountoff);
	}

	public double Payment() {
		return bill.payment(balance);
	}

	public static void demo() {
		Calculator calc = new Calculator();
		Client obj = new Client(new CalculatorAdapter(calc), 100000, 0.2);
		System.out.println("Balance of Account: " + obj.getBalance());
		AutoAPI auto1 = new SportyCoupeAuto(25999, "KIA");
		auto1 = new ABS(auto1);
		auto1 = new AC(auto1);
		auto1 = new BB(auto1);

		System.out.println(auto1.getDescription() + "\nTotal Price: " + auto1.getPrice() + '\n');

		AutoAPI auto2 = (new SportyCoupeAuto(25999, "Honda"));
		auto2 = new ABS(auto2);
		auto2 = new AWD(auto2);
		auto2 = new BDM(auto2);
		System.out.println(auto2.getDescription() + "\nTotal Price: " + auto2.getPrice() + '\n');

		AutoAPI auto3 = new SportyCoupeAuto(35999, "BMW");
		auto3 = new ABS(auto3);
		auto3 = new BB(auto3);
		auto3 = new BDM(auto3);
		System.out.println(auto3.getDescription() + "\nTotal Price: " + auto3.getPrice() + '\n');

		
		obj.add(auto1);
		obj.add(auto2);
		obj.add(auto3);
		
		System.out.println("Total Price of Order: " + obj.totalPrice());
		System.out.println("After discount ("+obj.getDiscountoff()*100+"% OFF):" + obj.discountOff());
		System.out.println("Balance After Billing : " + obj.Payment());
	}

}
