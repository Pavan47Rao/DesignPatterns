package edu.neu.csye7874.invoker;

import edu.neu.csye7874.api.CommandAPI;

public class Invoker {
	
	private CommandAPI command;
	
	public Invoker(CommandAPI command) {
		this.command = command;
	}
	
	public int invoke(int a, int b) {
		return this.command.calculate(a, b);
	}
	
	
}
