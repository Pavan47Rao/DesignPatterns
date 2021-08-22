package edu.neu.csye7874.command;

import edu.neu.csye7874.api.CommandAPI;
import edu.neu.csye7874.api.ReceiverAPI;

public class Add implements CommandAPI {

	private ReceiverAPI addReceiver;
	
	public Add(ReceiverAPI addReceiver) {
		this.addReceiver = addReceiver;
	}
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return this.addReceiver.calculate(a, b);
	}

}
