package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet2 {

	public static void main(String[] args) {
		// create EMPTY HS to stroe emp details
		HashSet<Emp> emps=new HashSet<>();
		//BBBB AaBB AaAa BBAa : different string having SAME hash code
		Emp e1=new Emp("BBBB", "a1", 12345);
		Emp e2=new Emp("AaBB", "a11", 12345);
		Emp e3=new Emp("AaAa", "b11", 22345);
		Emp e4=new Emp("BBAa", "a2", 12345);
		Emp e5=new Emp("rnd-123", "a3", 12345);
		Emp e6=new Emp("rnd-130", "b3", 22345);
		System.out.println("e1 added "+emps.add(e1));//t , hc : 1 , eq : 0
		System.out.println("e2 added "+emps.add(e2));//t , hc : 1 , eq : 1
		System.out.println("e3 added "+emps.add(e3));//t , hc : 1 , eq : 2
		System.out.println("e4 added "+emps.add(e4));//t , hc : 1 , eq : 3
		System.out.println("e5 added "+emps.add(e5));//t , hc : 1 , eq : 0
		System.out.println("e6 added "+emps.add(e6));//t , hc : 1 , eq : 0
	
		System.out.println("size "+emps.size());//6
		for(Emp e : emps)
			System.out.println(e);
		//no dups , have we followed in Emp class  --which part of the contract ? 
		//both (i.e mandatory n optional)
		System.out.println("----------------------------------");
		
	}

}
