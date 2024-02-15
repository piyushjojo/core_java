package nested_classes;

public class A {
	private int i;
	private static int j;
	static {
		j = 100;
	}

	public A(int i) {
		super();
		this.i = i;
	}

	// Can you add non static method/s in the outer class ? YES
	public void outerShow() {
		// which data members can u access ? both
		System.out.println("i=" + i + " j=" + j);
		//Can outer's instance method DIRECTLY access inner's members ? NO
	//	System.out.println("k="+k+" l="+l);
		//to access inner's non static members : create it's instance first
		B b1=new B(234);
		System.out.println("k="+b1.k+" l="+B.l);		
	}

	// Can you add a static method/s in the outer class ? YES
	public static void outerStaticShow() {
		// which data members can u access DIRECTLY (w/o instance ?) : static member
		// System.out.println("i="+i+" j="+j);
		System.out.println(j);
		//Can outer's static  method DIRECTLY access inner's members ? k : NO , l : B.l
		System.out.println("l="+B.l);
	//	System.out.println(k);
		A a1=new A(120);
		A.B ref=a1.new B(456);
		ref.innerShow();
		System.out.println(ref.k);
		//can u combine above(34 ,35) in single line ?
		A.B ref2=new A(11).new B(34);
		System.out.println(ref2.k);
		ref2.innerShow();
		
		
	}

	// add non static nested (inner) class
	class B {
		// Can you add static as well as non static data members in the inner class ?
		// only non static members
		private int k;
		// private static int l;
		private static final int l = 2345;

		// Can u add parametrized ctor in the inner class to init it's state ? YES
		public B(int k) {
			super();
			this.k = k;
		}

		// Can u add a static init block in inner class : NO
//		static {
//			l=1234;
//		}
		// can u add non static method in the inner class ? YES
		// can it access DIRECTLY (w/o creating outer cls instance) even the private
		// memebrs of the outer cls? YES
		// Why ? With every inner class : javac impl passes Outer class instance :
		// OuterClsName.this
		// eg : A.this
		 void innerShow() {
			// can it access : i j k l ? all
			System.out.println("inner show " + A.this.i + " " + A.j + " " + this.k + " " + B.l);// OPTIONAL :added only
																								// for understanding!
		}
		// Can u add a static method in the inner class ? NO
//		public static void innerStaticShow()
//		{
//			static method can be declared in static inner class.
//		}

	} // inner class end

}
