package nested_classes;

public class Test {

	public static void main(String[] args) {
		A.B innerRef=new A(12).new B(34);
		innerRef.innerShow();

	}

}
