package p3;

public interface Formula {
    double calculate(double a);//public n abstract : implicitly added by javac 
	//public 
    default double sqrt(double a,double b) {//public : implicitly added by javac 
        return Math.sqrt(a+b);
    }
    //Can you add a static method in the i/f : YES, javac impl adds : public
    static void show()
    {
    	System.out.println("In i/f static method show");
    }
}