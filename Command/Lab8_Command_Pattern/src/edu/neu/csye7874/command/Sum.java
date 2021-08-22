package edu.neu.csye7874.command;

import edu.neu.csye7874.api.CommandAPI;
import edu.neu.csye7874.api.ReceiverAPI;

public class Sum  implements CommandAPI {

	private ReceiverAPI sumReciever;
	
	public Sum(ReceiverAPI sumReciever) {
		this.sumReciever = sumReciever;
	}
	
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return this.sumReciever.calculate(a, b);
	}

}