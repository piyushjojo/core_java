package string_handling;

public class Test1 {

	public static void main(String[] args) {
		 String s=new String("hello");
		String s1=s.concat(" abc !");
		System.out.println(s);//hello
		System.out.println(s1);
		s=s.concat("12345");
		System.out.println(s);//hello12345
		System.out.println(s.toUpperCase());//upper cased !
		System.out.println(s);//hello12345
		String s2=s.replace('l', 't');
		System.out.println(s);//hello12345
		System.out.println(s2);//hetto12345
		

	}

}
