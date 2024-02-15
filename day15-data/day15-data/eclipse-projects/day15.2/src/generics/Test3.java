package generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.time.LocalDate.of;

public class Test3 {

	public static void main(String[] args) {
		// shuffle elems of string list
		List<String> strings=Arrays.asList("one","two","three");
		Collections.shuffle(strings);
		System.out.println("shuffled string list "+strings);
		// shuffle elems of growable local date list
		List<LocalDate> asList = Arrays.asList(of(2020,1,23),of(2021,11,2),of(2020,10,2),of(2022,8,20));
		ArrayList<LocalDate> dates=new ArrayList<>(asList);
		
		dates.add(LocalDate.now());
		System.out.println("orig dates "+dates);
//		asList.add(LocalDate.now());
		//which of the follow. is fixed in size ? asList OR dates : asList
		System.out.println("shuffled dates ");
		Collections.shuffle(dates);
		System.out.println("shuffled dates "+dates);
		// shuffle elems of integer list : lab work 
		
		

	}

}
