package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet {

	public static void main(String[] args) {
		// create EMPTY HS to stroe emp details
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp("rnd-123", "a1", 12345);
		Emp e2=new Emp("rnd-123", "a1", 12345);
		Emp e3=new Emp("rnd-124", "b1", 22345);
		System.out.println("e1 added "+emps.add(e1));//t
		System.out.println("e2 added "+emps.add(e2));//t ???????????????????
		System.out.println("e3 added "+emps.add(e3));//t
	
		System.out.println("size "+emps.size());//3
		System.out.println(emps);//dups will be seen!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("----------------------------------");
		System.out.println(e1.equals(e2));//true
			System.out.println(e1.hashCode()+" "+e2.hashCode());//same
	}

}
