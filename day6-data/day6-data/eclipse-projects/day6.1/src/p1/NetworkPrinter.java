package p1;

public class NetworkPrinter implements Printer {
	@Override
	public void print(String mesg) {
		System.out.println("Printing a mesg on the network printer "+mesg);
	}
}
