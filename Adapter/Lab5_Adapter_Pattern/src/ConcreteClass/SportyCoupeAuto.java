package ConcreteClass;

import java.util.List;

import API.Adapter.BillingAPI;
import API.Decorator.AutoAPI;
import Adapter.Calculator;
import Adapter.CalculatorAdapter;
import Configurations.*;

public class SportyCoupeAuto implements AutoAPI {

	private int price;
	private String discription;

	public SportyCoupeAuto(int Price, String Discription) {
		this.discription = Discription;
		this.price = Price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.discription + "\nConfigurations:";
	}
	


	
	

	
	public static void demo() {
		AutoAPI auto1 = new SportyCoupeAuto(25999,"KIA");
		auto1 = new ABS(auto1);
		auto1 = new AC(auto1);
		auto1 = new BB(auto1);
		//CalculatorAdapter calc = new  CalculatorAdapter(new Calculator());
		System.out.println(auto1.getDescription()+ "\nTotal Price: "+ auto1.getPrice()+ '\n');
		
		AutoAPI auto2 = new ABS(new AWD(new BDM(new SportyCoupeAuto(25999,"Honda"))));
		//auto2 = new ABS(auto2);
		//auto2 = new AWD(auto2);
		//auto2 = new BDM(auto2);
		System.out.println(auto2.getDescription()+ "\nTotal Price: "+ auto2.getPrice()+ '\n');
		
		AutoAPI auto3 = new SportyCoupeAuto(35999,"BMW");
		auto3 = new ABS(auto3);
		auto3 = new BB(auto3);
		auto3 = new BDM(auto3);
		System.out.println(auto3.getDescription()+ "\nTotal Price: "+ auto3.getPrice()+ '\n');
		
	}



	

}
