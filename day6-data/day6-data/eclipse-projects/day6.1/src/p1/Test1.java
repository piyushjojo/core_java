package p1;

public class Test1 {

	public static void main(String[] args) {
		ConsolePrinter p1=new ConsolePrinter();
		p1.print("mesg1");
		FilePrinter p2=new FilePrinter();
		p2.print("mesg2");
		NetworkPrinter p3=new NetworkPrinter();
		p3.print("mesg3");

	}

}
