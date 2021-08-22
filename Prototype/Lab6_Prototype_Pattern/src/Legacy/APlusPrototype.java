package Legacy;

public class APlusPrototype implements GraphPrototypeAPI{

	@Override
	public void showMagnitude(int count) {
		// TODO Auto-generated method stub
		for(int i = 0; i < count; i++) {
			System.out.print("+");
		}
	}

}
