package chapter04;

public class Example1_2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '-';
		
		int res = 0; 
		int res2 = 0;
		int res3 = 0;
		int res4 = 0;
		
		res = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		
		switch(operator) {
			case '+':
				System.out.println("값은 " + res + "입니다.");
				break;
			case '-':
				System.out.println("값은 " + res2 + "입니다.");
				break;
			case '*':
				System.out.println("값은 " + res3 + "입니다.");
				break;
			case '/':
				System.out.println("값은 " + res4 + "입니다.");
				break;
			default :
				System.out.println("오류입니다.");
		}
	}
}
