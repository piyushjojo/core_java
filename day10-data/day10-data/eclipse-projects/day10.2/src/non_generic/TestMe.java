package non_generic;

public class TestMe {

	public static void main(String[] args) {
		// Create Holder class instance to hold an int value : 12345
		Holder h1=new Holder (12345);//int ---> auto boxing(Integer.valueOf(12345) ---> Integer ---> up casted --> Object
		System.out.println(h1.getClass());//non_generic.Holder
		System.out.println(h1.getRef().getClass());//java.lang.Integer
		int data=(Integer)h1.getRef();//downcasting : p   , auto unboxing : javac
		// Create another Holder class instance to hold  a string
		Holder h2=new Holder("testing stuff");//javac impl : up casting
		System.out.println(h2.getRef().getClass());//java.lang.String
		String s=(String)h2.getRef();
		h1=h2;
		data=(Integer)h1.getRef();
		System.out.println(data);
		

	}

}
