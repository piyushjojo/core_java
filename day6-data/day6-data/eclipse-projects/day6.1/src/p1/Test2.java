package p1;

public class Test2 {

	public static void main(String[] args) {
		Printer p;//p : i/f type of ref var. no objs created so far. , how many bytes : as per JVM spec. : stack
	//	System.out.println(p);
//		p=new Printer();
		p=new FilePrinter();//FilePrinter IS-A Printer : yes , implements => up casting
		//Can i/f ref DIRECTLY (w/o type casting) refer to ANY imple cls instance ? YES
		p.print("some mesg!!!!");//no javac err : since print() exists in Printer , JVM : print() : FilePrinter
		//run time poly
		p=new NetworkPrinter();//no java err
		p.print("other mesg");
		

	}

}
