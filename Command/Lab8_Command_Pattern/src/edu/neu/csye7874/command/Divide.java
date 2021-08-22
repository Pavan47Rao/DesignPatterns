package edu.neu.csye7874.command;

import edu.neu.csye7874.api.CommandAPI;
import edu.neu.csye7874.api.ReceiverAPI;

public class Divide  implements CommandAPI {

	private ReceiverAPI divideReceiver;
	
	public Divide(ReceiverAPI divideReceiver) {
		this.divideReceiver = divideReceiver;
	}
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return this.divideReceiver.calculate(a, b);
	}

}
