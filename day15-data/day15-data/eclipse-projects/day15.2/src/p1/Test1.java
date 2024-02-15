package p1;

public class Test1 {

	public static void main(String[] args) {
		Formula[] formulae= {new MyFormula(),new AnotherFormula()};
		for(Formula f : formulae) {
			System.out.println(f.calculate(10));
			System.out.println(f.sqrt(44,20));
		}
			

	}

}
