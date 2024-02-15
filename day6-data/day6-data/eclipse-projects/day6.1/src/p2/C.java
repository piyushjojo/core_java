package p2;

public class C implements A,B{

	@Override
	public double compute(double d1, double d2) {
		System.out.println(A.DATA+" "+B.DATA);
		return d1+d2;
	}

}
