package edu.neu.csye7874.command;

import edu.neu.csye7874.api.CommandAPI;
import edu.neu.csye7874.api.ReceiverAPI;

public class Subtract  implements CommandAPI {

	private ReceiverAPI subtractReciever;
	
	public Subtract(ReceiverAPI subtractReciever) {
		this.subtractReciever = subtractReciever;
	}
	
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return this.subtractReciever.calculate(a, b);
	}

}
