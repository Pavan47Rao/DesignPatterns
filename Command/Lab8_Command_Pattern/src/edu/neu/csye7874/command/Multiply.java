package edu.neu.csye7874.command;

import edu.neu.csye7874.api.CommandAPI;
import edu.neu.csye7874.api.ReceiverAPI;

public class Multiply  implements CommandAPI {

	private ReceiverAPI multiplyReceiver;
	
	public Multiply(ReceiverAPI multiplyReceiver) {
		this.multiplyReceiver = multiplyReceiver;
	}
	
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return this.multiplyReceiver.calculate(a, b);
	}

}
