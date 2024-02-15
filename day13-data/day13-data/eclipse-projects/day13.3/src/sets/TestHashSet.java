package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		String[] strings= {"one","two","three","four","five","one","yellow","zen","stable","two"};
		//Populate HS using String []
		for(String s : strings)
			System.out.println("Added "+hs.add(s));//t t t t t f ....
		System.out.println("size "+hs.size());
		System.out.println("HS "+hs);//un ordered n un sorted
		System.out.println(hs.add("tree"));
		System.out.println("zen exists "+hs.contains("zen"));//t
		//can u attach an iterator to the HS ? YES
		Iterator<String> itr=hs.iterator();
		System.out.println(itr.getClass());//HashSet ---> mainitains HashMap<K,V> --> HashMap.KeyIterator
		while(itr.hasNext())
		//	itr.remove();
			System.out.println(itr.next());
		System.out.println("HS via Iterator "+hs);
		//DO try removing specific elems using Itr's remove 
		System.out.println("removing elem using Set API "+hs.remove("zen"));
		System.out.println("zen exists "+hs.contains("zen"));//f
		System.out.println(hs);
		

	}

}
