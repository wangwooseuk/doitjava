package example;

/*
 * 1에서 50까지의 수 중 3의 배수의 합계를
 * 구하는 프로그램을 작성하세요.
 */

public class Exam06 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
