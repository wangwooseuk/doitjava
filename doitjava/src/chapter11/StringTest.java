package chapter11;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "ABC";
		String str4 = "ABC";
				
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
