package chapter12;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str = Util.compare("a", "b"); (x)
		
		int res1 = Util.compare(10, 20);
		System.out.println(res1);
		
		int res2 = Util.compare(4.5, 3);
		System.out.println(res2);
	}
}
