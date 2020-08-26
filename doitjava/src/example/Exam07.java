package example;

/*
 * 1에서 10까지의 수의 곱을 구하는 
 * 프로그램을 작성하세요.
 */

public class Exam07 {

	public static void main(String[] args) {
		int res = 1;
		
		for(int i=1; i<=10; i++) {
			res *= i;
		}
		System.out.println(res);
	}
}
