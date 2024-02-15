package inheritance;

public class A /* extends Object */{
	public A() {
	//	super();
		System.out.println("in A");
	}
}
class B extends A
{
	public B() {
		//super();
		System.out.println("in B");
	}
}
class C extends B
{
	public C() {
		//javac impl adds super(); => invokes immediate super cls' MATCHING ctor
		
		System.out.println("in C");
	}
}
