package API.Adapter;

import java.util.List;

import API.Decorator.AutoAPI;

public interface BillingAPI {
	double accumulation(List<AutoAPI> itemsPrices);
	double discountoff(double discount);
	double payment(double payment);

}
