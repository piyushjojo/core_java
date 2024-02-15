
import java.util.Scanner;
public class C
{
	
  public static void main(String[] args)
  {
	  int data=12345;//primitive data type , method local variable is by default : un intialized !
	   
	   System.out.println("data="+data);
	   data++;
	   String s="hello";
	   s++;
	   Scanner sc=new Scanner(System.in);
	   sc += 10;
	   sc.close();
  }
}
