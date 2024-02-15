package strings;

public class Test3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("testing");
		System.out.println(sb);// testing
		System.out.println(sb.length() + " capa " + sb.capacity());// 7 23
		StringBuilder sb2 = sb.append(123.456);
		System.out.println(sb);// testing123.456
		System.out.println(sb2);// testing123.456
		System.out.println(sb == sb2);// true
		sb.append(false).append(123).append(23.456F).append(new char[] { 'y', 'e', 's' });
		System.out.println(sb);
		System.out.println(sb.length() + " capa " + sb.capacity());
		sb.insert(7, "new string");
		System.out.println(sb);
		sb.delete(0, 7);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);// reversed contents !
		StringBuilder sb3 = new StringBuilder("hello");
		StringBuilder sb4 = new StringBuilder("hello");
		System.out.println(sb3 == sb4);// f
		System.out.println(sb3.equals(sb4));// f : since SB class HAS NOT overridden Object's equals : chks by ref
											// equality !

	}

}
