/*
Create another class(for the purpose of separation)  : CreateBox --for  UI. 
Add psvmain(..){...}
Use scanner --to accept box dims from user, create box instance.
display its details & volume.
*/
package com.cdac.tester;
import com.cdac.core.Box;
import java.util.Scanner;
class CreateBox{
	 public static void main(String[] args)
	 {
		//create scanner instance wrapping stdin : System.in : InputStream
		int data;
		Scanner sc=new Scanner(System.in);
		Box b1;//b1 : ref type var : class type (i.e can ONLY refer to Box type obj) , as per JVM's specs : 4/8/16 bytes are allocated in stack frm of main(...) , no box type of objs are created so far.
	//	System.out.println(b1);
		System.out.println("Enter box dims : w d h");//10 20 30
		b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//RHS : Box class instance , created in heap
	//	display dims
		System.out.println(b1.getBoxDims());
		System.out.println("Volume ="+b1.getVolume());	
		Box b2=b1;	//copy of refs
	    System.out.println(b2.getBoxDims());
		b1=null;
	//	System.out.println(b1.getBoxDims());//NPE
	//	how many objs markedfor GC ? 0
		System.out.println(b2.getBoxDims());
		b2=null; //how many objs marked for GC ? : 1
		Box b3=new Box(2,3,4);
		b3=new Box(2,3,4);//how many objs marked for GC ?  1 : earlier box obj(from line no 28)
		sc.close();
		System.out.println("main over.....");
		 
	 }
}