package p3;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method from the i/f");
		return a*a;
	}
	//Can you override a static method in the imple class  ? No
//	@Override
	static void show()
    {
    	System.out.println("In class's  re-declared static method show");
    	//can u access i/f static method show ? YES , How ? 
    	Formula.show();
    }
	
	

}
