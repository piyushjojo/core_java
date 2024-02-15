package p1;

public class Test4 {

	public static void main(String[] args) {
		Printer[] printers = /* new Printer[] */ { new FilePrinter(), new ConsolePrinter(), new NetworkPrinter() };// which byte codes will
																								// loaded in meta space
		// Printer.class , [Lp1.Printer , FP,CP ,NP
		// objs : 1 array , CP , len=3, printers[0] ---> FP instance , ....
		for (Printer p : printers) {
			p.print("test message");
			// p.close();//javac err
			if (p instanceof FilePrinter)
				((FilePrinter) p).close();
			else
				System.out.println("Not a file printer!!!!!!!!!!!!!!!!!");

		}

	}

}
