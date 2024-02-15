package p1;


public class AnotherFormula implements Formula {

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method from the i/f");
		return a+a;
	}
	//Can you override inherited def method imple to achieve run time poly ? YES
	@Override
	public double sqrt(double a, double b) {
		System.out.println("overriding inherited def method ");
		return Math.sqrt(a-b);
	}
	
	

}
