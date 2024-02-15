package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import static com.app.banking.AcType.*;
import static java.time.LocalDate.parse;

public class BankUtils {
//add a static  method to return populated map of a/cs
	public static HashMap<Integer, BankAccount> populateAccountMap() {
		// create empty Map n populate it
		HashMap<Integer, BankAccount> map = new HashMap<>();//size=0  init capa=16  L.F=0.75
		// String customerName, AcType acctType, LocalDate creationDate, double balance
		System.out.println("added " + map.put(101, new BankAccount(101, "Rama", SAVING, parse("2020-05-23"), 15000)));
		System.out.println("added " + map.put(10, new BankAccount(10, "Mihir", CURRENT, parse("2021-05-23"), 7000)));

		System.out.println("added " + map.put(21, new BankAccount(21, "Ketan", SAVING, parse("2020-09-23"), 14000)));

		System.out.println("added " + map.put(56, new BankAccount(56, "Riya", FD, parse("2020-03-23"), 150000)));

		System.out.println("added " + map.put(54, new BankAccount(54, "Rama", CURRENT, parse("2022-01-23"), 6700)));

		System.out.println("added " + map.put(29, new BankAccount(29, "Raj", SAVING, parse("2020-09-13"), 16000)));
		System.out.println("added " + map.putIfAbsent(101, new BankAccount(101, "Kiran", SAVING, parse("2020-10-23"), 18000)));
		
		System.out.println("size of map "+map.size());//6
		return map;
	}
}
