package p4;

public interface ComputationUtils {
//add a static method to perform ANY arithmetic op on 2 double args
	static double computeAnyOperation(double d1,double d2,Computable ref)
	{
		return ref.compute(d1, d2);
	}
}
