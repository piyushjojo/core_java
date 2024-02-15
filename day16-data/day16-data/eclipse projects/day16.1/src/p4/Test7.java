package p4;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		//Objetive : display the elems from the int stream
		//Can u attach a stream to an array : yes !
		int[] data= {1,23,4,56,10,30,-300,-10,50};
		//int[] ---> attach a stream (src) --> no intermediate op --> terminal op (forEach)
		Arrays.stream(data) //java.util.stream.IntStream : src
		.forEach(i -> System.out.print(i+" "));

	}

}
