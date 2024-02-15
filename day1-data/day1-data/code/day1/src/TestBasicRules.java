
import java.util.Scanner;
class C
{
	
  public static void main(String[] args)
  {
	  int data=12345;//primitive data type , method local variable is by default : un intialized !
	   boolean active=false;
	   System.out.println("data="+data);
	   data++;
	   String s="hello";
	   s++;
	   Scanner sc=new Scanner(System.in);
	   sc += 10;
	   sc.close();
  }
}
public class A 
{
	 public static void main(String[] args)
  {
	   System.out.println("in A");
  }
}
class B {
		 public static void main(String[] args)
  {
	   System.out.println("in B");
  }
}