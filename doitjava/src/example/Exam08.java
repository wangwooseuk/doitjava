package example;

/*
 * 1에서 50까지의 수 중 3의 배수의 개수를
 * 구하는 프로그램을 작성하세요.
 */

public class Exam08 {

	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
