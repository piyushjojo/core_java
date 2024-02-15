package tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import static utils.CustomerValidationRules.*;
import static utils.CMSUtils.*;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty AL
			ArrayList<Customer> customers = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Customer registration 2. Login 3. Link Adhar Card "
						+ "4. Display all customer details 5. Change Password " + "100. Exit ");
				System.out.println("Choose ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter customer details :  name,  email,  password,  regAmount,  "
								+ "dob (day-mon-yr)  plan");
						customers.add(validateAllInputs(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), customers));
						break;
					case 2:
						System.out.println("Enter  email , dob , password for authentication");
						Customer autheticatedCustomer = autheticateCustomer(sc.next(), sc.next(), sc.next(), customers);
						System.out
								.println("You have logged in successfully !  Hello " + autheticatedCustomer.getName());
						break;
					case 3:
						System.out.println("Enter email n dob");
						Customer cust = findByPK(sc.next(), sc.next(), customers);
						// => valid PK --> customer found
						System.out.println("Enter Adhar card no n location");
						cust.linkAdharCard(sc.next(), sc.next());
						System.out.println("Customer Name  : " + cust.getName() + " linked adhar card");
						break;
					case 4:
						System.out.println("Customer Details ");
						// simplest is for-each , BUT only for practice --use Iterator n display .
						// attach Iterator
						Iterator<Customer> custItr = customers.iterator();
						while (custItr.hasNext())
							System.out.println(custItr.next());

						break;
					case 5: // change pwd
						System.out.println("For changing PWD : enter email ,dob ,  old password , new password");
						System.out.println(changePassword(sc.next(), sc.next(), sc.next(), sc.next(), customers));
						break;
					case 6:
						System.out.println("Enter email n dob , to un subscribe");
						cust = findByPK(sc.next(), sc.next(), customers);
						//=> cust is found
						System.out.println("Customer unsubscribed "+customers.remove(cust));
						break;
					case 7 :
						for (Customer c : customers)
							if(c.getDob().before(seniorCitizenDate) && c.getPlan()==ServicePlan.DIAMOND)
							{
								c.setPlan(ServicePlan.PLATINUM);
								c.setRegAmount(ServicePlan.PLATINUM.getPlanCharges());
							}
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}

	}

}
