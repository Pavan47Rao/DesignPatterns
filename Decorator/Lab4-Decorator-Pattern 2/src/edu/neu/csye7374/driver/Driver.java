package edu.neu.csye7374.driver;

import edu.neu.csye7374.api.AutoAPI;
import edu.neu.csye7374.carmodel.SportyCoupe;
import edu.neu.csye7374.decorator.ABS;
import edu.neu.csye7374.decorator.AC;
import edu.neu.csye7374.decorator.AWD;
import edu.neu.csye7374.decorator.BB;
import edu.neu.csye7374.decorator.BDM;

public class Driver {
	
public static void main(String[] args) {
	
	AutoAPI auto = new SportyCoupe();
	auto = new BB(auto);
	auto = new BDM(auto);
	auto = new AWD(auto);
	
	
	System.out.println(auto.getDescription()+" total price of $"+auto.getPrice());
	
	AutoAPI car2 = new SportyCoupe();
	car2 = new AC(new ABS(new BDM(new BB(car2))));
	System.out.println("\n\n");
	System.out.println(car2.getDescription()+" total price of $"+car2.getPrice());
	
	
	AutoAPI car3 = new SportyCoupe();
	car3 = new AC(car3);
	car3 = new BDM(car3);
	car3 = new BB(car3);
	car3 = new AWD(car3);
	car3 = new ABS(car3);
	System.out.println("\n\n");
	System.out.println(car3.getDescription()+" total price of $"+car3.getPrice());
	
}
	

}
