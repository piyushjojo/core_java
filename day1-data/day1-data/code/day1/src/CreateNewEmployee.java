import java.util.Scanner;

class CreateNewEmployee
{
 //UI : user interface : user will be prompted for these details
 public static void main(String[] args)
 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter emp details : id name salary");
	//  Employee e=new Employee();
	Employee e=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
	System.out.println(e.getEmpDetails());
	  sc.close();
	  
 }
}