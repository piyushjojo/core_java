package inheritance;

public class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		System.out.println("in person");
		this.firstName = firstName;
		this.lastName = lastName;
	}

//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	// why / need of overriding toString : to replace F.Q cls Name@hashCode()
	// version by actual details
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
