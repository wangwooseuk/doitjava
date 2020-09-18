package chapter11;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 Boxing
		//Integer obj = Integer.valueOf(100);
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//대입시 자동 UnBoxing
		//int value = obj.intValue();
		int value = obj;
		System.out.println("value: " + value);
		
		//연산시 자동 UnBoxing
		int res = obj + 100;
		System.out.println("res: " + res);
	}
}
