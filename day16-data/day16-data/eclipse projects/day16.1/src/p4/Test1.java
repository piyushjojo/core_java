package p4;

import static p4.ComputationUtils.computeAnyOperation;

public class Test1 {

	public static void main(String[] args) {
		// perform addition of 2 nums , display result : ano inner class
		System.out.println("res="+computeAnyOperation(10, 20, new Computable() {

			@Override
			public double compute(double d1, double d2) {
				// TODO Auto-generated method stub
				return d1+d2;
			}
		}));
		//Java 8 onwards , is it possible to directly pass behavior , as the method arg ? YES --lambda expr  
		// perform mult  of 2 nums , display result : lambda expr
		System.out.println("res="+computeAnyOperation(10, 20, (a,b) -> a * b ));

	}

}
