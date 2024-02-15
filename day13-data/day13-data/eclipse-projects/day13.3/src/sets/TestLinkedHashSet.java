package sets;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		String[] strings= {"one","two","three","four","five","one","yellow","zen","stable","two"};
		//Populate HS using String []
		for(String s : strings)
			System.out.println("Added "+hs.add(s));//t t t t t f ....
		System.out.println("size "+hs.size());//8
		System.out.println("LHS "+hs);// ordered n un sorted
		}

}
