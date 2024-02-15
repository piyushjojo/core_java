package tester;

import static utils.BankUtils.populateAccountMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.banking.AcType;
import com.app.banking.BankAccount;

import custom_exceptions.BankingException;
import static com.app.banking.AcType.*;
import static java.time.LocalDate.parse;
import static utils.BankingValidationRules.validateBalance;

public class TestBanking {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<Integer, BankAccount> accountMap = populateAccountMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Create A/C 2.Display All A/C info 3.Get A/C Summary 10.Exit ");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter acct no");
						int acctNo = sc.nextInt();
						if (accountMap.containsKey(acctNo))
							throw new BankingException("Dup a/c no !!!!!!!!!!!!!!");
						// => new a/c no
						
						System.out.println(
								"Enter a/c details : customerName,  acctType,  creationDate(yyyy-MM-dd),  balance");
						accountMap.put(acctNo, new BankAccount(acctNo, sc.next(), valueOf(sc.next().toUpperCase()),
								parse(sc.next()), validateBalance(sc.nextDouble())));
						System.out.println("a/c created successfully!");
						break;
					case 2:
						System.out.println("All Bank A/Cs ");
						for (BankAccount a : accountMap.values())
							System.out.println(a);
						break;
					case 3:
						System.out.println("Enter a/c no");
						BankAccount acct = accountMap.get(sc.nextInt());
						if (acct == null)
							throw new BankingException("Invalid A/C No !!!!!!!!!!!!!!!");
						System.out.println("Bank A/c Summary " + acct);
						break;
					case 4:
						System.out.println("Enter src dest a/c nos n transfer amount");
						acct = accountMap.get(sc.nextInt());
						if (acct == null)
							throw new BankingException("Invalid Src A/C No !!!!!!!!!!!!!!!");
						// => src a/c valid
						BankAccount dest = accountMap.get(sc.nextInt());
						if (dest == null)
							throw new BankingException("Invalid Dest A/C No !!!!!!!!!!!!!!!");
						acct.fundsTransfer(dest, sc.nextDouble());
						break;
					case 5: System.out.println("Enter a/c no , to close a/c");
					    acct=accountMap.remove(sc.nextInt());
					    if(acct == null)
					    	throw new BankingException("Invalid A/C No , Can't close the a/c!!!!!!!!!!!!");
					    System.out.println("Closed A/C "+acct);
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}

			System.out.println("HM " + accountMap);
		} // sc.close()

	}

}
