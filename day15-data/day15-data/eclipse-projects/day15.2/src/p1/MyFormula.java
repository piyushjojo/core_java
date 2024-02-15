package p1;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method from the i/f");
		return a*a;
	}
	

}
