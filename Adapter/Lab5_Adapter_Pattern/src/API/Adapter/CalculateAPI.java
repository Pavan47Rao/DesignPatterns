package API.Adapter;

public interface CalculateAPI {
	public enum OPERATION {
		ADD,SUB,MULT,DIV
	}
	double operation(OPERATION op, double a, double b);

}
