package chapter04;

public class Example1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
		int res = 0; 
		int res2 = 0;
		int res3 = 0;
		int res4 = 0;
		
		res = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		
		if(operator == '+') {
			System.out.println("���� " + res + "�Դϴ�.");
		}
		else if(operator == '-') {
			System.out.println("���� " + res2 + "�Դϴ�.");
		}
		else if(operator == '*') {
			System.out.println("���� " + res3 + "�Դϴ�.");
		}
		else if(operator == '/') {
			System.out.println("���� " + res4 + "�Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�");
		}
	}
}
