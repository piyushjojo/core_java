package p2;

public interface Formula2 {
    double calculate(double a);//public n abstract : implicitly added by javac 
	//public 
    default double sqrt(double a,double b) {//public : implicitly added by javac 
        return Math.sqrt(a/b);
    }
}