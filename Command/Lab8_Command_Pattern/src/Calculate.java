import edu.neu.csye7874.command.Add;
import edu.neu.csye7874.command.Divide;
import edu.neu.csye7874.command.Multiply;
import edu.neu.csye7874.command.Subtract;
import edu.neu.csye7874.command.Sum;
import edu.neu.csye7874.invoker.Invoker;
import edu.neu.csye7874.receiver.AddReceiver;
import edu.neu.csye7874.receiver.DivideReceiver;
import edu.neu.csye7874.receiver.MultiplyReceiver;
import edu.neu.csye7874.receiver.SubtractReceiver;
import edu.neu.csye7874.receiver.SumReceiver;

public class Calculate {
	
	public static void demo() {
		Invoker addInvoker = new Invoker(new Add(new AddReceiver()));
		System.out.println("Addition: "+addInvoker.invoke(6, 3));
		
		Invoker subtractInvoker = new Invoker(new Subtract(new SubtractReceiver()));
		System.out.println("Subtraction: "+subtractInvoker.invoke(6, 3));
		
		Invoker multiplyInvoker = new Invoker(new Multiply(new MultiplyReceiver()));
		System.out.println("Multiplication: "+multiplyInvoker.invoke(6, 3));
		
		Invoker divideInvoker = new Invoker(new Divide(new DivideReceiver()));
		System.out.println("Division: "+divideInvoker.invoke(6, 3));
		
		Invoker sumInvoker = new Invoker(new Sum(new SumReceiver()));
		System.out.println("Sum: "+sumInvoker.invoke(1, 4));
	}
}
