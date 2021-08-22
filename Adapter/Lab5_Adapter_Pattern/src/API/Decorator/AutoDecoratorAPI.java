package API.Decorator;

import java.util.ArrayList;
import java.util.List;

import Adapter.Calculator;
import Adapter.CalculatorAdapter;

public abstract class AutoDecoratorAPI implements AutoAPI {
	//public List<AutoAPI> itemList = new ArrayList<>();
	//public CalculatorAdapter calc = new  CalculatorAdapter(new Calculator());
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "description";
	}

}
