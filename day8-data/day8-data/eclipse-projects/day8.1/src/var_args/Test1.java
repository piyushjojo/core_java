package var_args;

public class Test1 {

	public static void main(String... args) {
		displayAnimalNames(new Cat("Mojo"),new Dog("Pluto"),new Horse("Speedy"));

	}
	//add a static method to display names of all the animals : var-args
	private static void displayAnimalNames(Animal...animals)
	{
		for(Animal a : animals)
			System.out.println(a.getName());
	}

}
