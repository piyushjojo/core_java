package p1;

public class FilePrinter implements Printer {
	@Override
	public void print(String mesg) {
		System.out.println("Storing a mesg in the file "+mesg);
	}
	//Can you add , new functionality in the imple class ? YES
	public void close()
	{
		System.out.println("closing file...");
	}
}
