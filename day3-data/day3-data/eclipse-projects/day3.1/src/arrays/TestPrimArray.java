package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.

Display array data using for-each loop
 */
public class TestPrimArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] data;//no class loaded n no objs created in heap : at this stmt.
		//data : ref type of var , array type , can refer to array obj holding double vals , mem allocated on stack
		System.out.println("how many double vals to store ?"); //4
		data=new double[sc.nextInt()];//class : [D : method area , heap : 6 , CP , length=4 , 0 ...3
		System.out.println("def array contents using for loop");
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		System.out.println("\n name of the loaded class "+data.getClass());//[D
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter data");
			data[i]=sc.nextDouble();
			
		}
		System.out.println("array contents : for-each");
		for(double d : data) //d=data[0] , d=data[1]......d=data[data.length-1] 
		{
			System.out.print(d+" ");
			d *= 2;
		}
		//display array again : for-each
		System.out.println("array contents : for-each");
		for(double d : data) //d=data[0] , d=data[1]......d=data[data.length-1] 
		{
			System.out.print(d+" ");
			
		}
		System.out.println();
		System.out.println("Array contents via Arrays.toString");
		//Do you a method to display arrya contents directly : w/o for for -each
		System.out.println(Arrays.toString(data));		
		sc.close();
		

	}

}
