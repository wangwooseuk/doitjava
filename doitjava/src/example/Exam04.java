package example;

/*
 * 1에서 10까지의 수 중 짝수의 합계를
 * 구하는 프로그램을 작성하세요.
 */

public class Exam04 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
