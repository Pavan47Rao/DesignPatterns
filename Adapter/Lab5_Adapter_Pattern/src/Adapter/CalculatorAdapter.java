package Adapter;

import java.util.List;

import API.Adapter.BillingAPI;
import API.Adapter.CalculateAPI.OPERATION;
import API.Decorator.AutoAPI;

public class CalculatorAdapter implements BillingAPI{

	private final Calculator calc;
	private double sum;
	public CalculatorAdapter(Calculator calc) {
		super();
		this.calc = calc;
		this.sum =0;
	}
	@Override
	public double accumulation(List<AutoAPI> prices) {
		// TODO Auto-generated method stub
		sum =0;
		for(AutoAPI itemPrice:prices) {
			sum = this.calc.operation(OPERATION.ADD,sum,itemPrice.getPrice());
		}
		return sum;
	}
	@Override
	public double discountoff(double discount) {
		// TODO Auto-generated method stub
		return this.calc.operation(OPERATION.MULT,1-discount,sum);
	}
	@Override
	public double payment(double cash) {
		// TODO Auto-generated method stub
		return this.calc.operation(OPERATION.SUB,cash,sum);
	}

	

}
