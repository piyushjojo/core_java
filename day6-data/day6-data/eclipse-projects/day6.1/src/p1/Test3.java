package p1;

public class Test3 {

	public static void main(String[] args) {
		Printer[] printers= {new FilePrinter(),new ConsolePrinter(),new NetworkPrinter()};// which byte codes will loaded in meta space
		//Printer.class , [Lp1.Printer , FP,CP ,NP
		//objs : 1 array , CP , len=3, printers[0] ---> FP instance , ....
		for (Printer p : printers)
			p.print("test message");
		//Can non imple class access i/f constants DIRECTLY ? NO
		System.out.println(Printer.DATA);

	}

}
