package example;

/*
 * 1에서 10까지의 수의 합계를 구하는 프로그램을 
 * 작성하세요
 */

public class Exam03 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		
		
	}
}
