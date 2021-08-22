package edu.neu.csye7874.receiver;

import edu.neu.csye7874.api.ReceiverAPI;

public class SumReceiver implements ReceiverAPI{

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = a; i <= b; i++)
			sum += i;
		return sum;
	}

}
