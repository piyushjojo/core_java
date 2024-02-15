package generic;

public class TestMe {

	public static void main(String[] args) {
		// Create Holder class instance to hold an int value : 12345
		Holder<Integer> h1 = new Holder<>(12345);// javac : auto boxing , <> => diamond op . type of the RHS is inferred
													// from the type of LHS
		int data=h1.getRef();//RHS : Integer  ---> auto un boxing --> int
		System.out.println(h1.getClass());
		System.out.println(h1.getRef().getClass());

		// Create another Holder class instance to hold a string
		Holder<String> h2=new Holder<>("hello");//which impl conversion javac : NO CONVERSION !!!!
		String s=h2.getRef();
	//h1=h2;//un comment it to understand why generics ? 

	}

}
