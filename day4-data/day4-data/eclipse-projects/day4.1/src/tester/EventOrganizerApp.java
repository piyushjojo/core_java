package tester;

import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

/*
 * (eg : EventOrganizer app : tester --main / scanner)
Prompt user for event capacity.
Create suitable data structure to hold the participant details
Options 
1. Register Student : 
2. Register Faculty : 
3. Display participant details : for-each 
10. Exit
 */

public class EventOrganizerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter event capacity");// 10
		// Create suitable data structure to hold the participant details
		// creates an array holding Person type of refs that can refer to either Student
		// or Faculty.
		Person[] pariticipants = new Person[sc.nextInt()];// objs : 1 : Person[] , cls : [Linheritance.Person
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println(
					"Options 1. Register Student 2. Register Faculty 3. Display registered participant details 10.Exit");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:// student reg
				if (counter < pariticipants.length) {
					System.out.println("Enter Student details : fn, ln, gradYear, course, courseFees, marks");
					pariticipants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt());// up casting
				} else
					System.out.println("Event full !!!!!!");

				break;

			case 2: // faculty reg
				if (counter < pariticipants.length) {
					System.out.println("Enter Faculty details : fn, ln, exp in yrs , sme");
					pariticipants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event full !!!!!!");
				break;
			case 3:
				System.out.println("Participant Detaills");// for-each
				// {s1,s2,f1,s3,s4,f2,f3,null,null,null}
				for (Person p : pariticipants) // p=pariticipants[0],....
					if (p != null)
						System.out.println(p);//run time polymorphism
				break;
			case 10:
				exit = true;
				break;
			}
		}
		sc.close();

	}

}
