package chapter04;

public class DowhileExample {

	public static void main(String[] args) {
		int num = 20;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		System.out.println(num);
		
		num = 20;
		sum = 0;
		
		while(num <= 10) {
			sum += num++;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		System.out.println(num);
	}
}
