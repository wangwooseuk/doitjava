package chapter11;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//�ڵ� Boxing
		//Integer obj = Integer.valueOf(100);
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//���Խ� �ڵ� UnBoxing
		//int value = obj.intValue();
		int value = obj;
		System.out.println("value: " + value);
		
		//����� �ڵ� UnBoxing
		int res = obj + 100;
		System.out.println("res: " + res);
	}
}
