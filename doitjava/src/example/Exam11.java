package example;

/*
 * 1부터 50까지의 합의 평균을 구하는 
 * 프로그램을 작성하세요.
 */

public class Exam11 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=50; i++) {
			sum += i;
		}
//		double res = (double) sum / 50;
		double res = sum / 50.0;
		System.out.println(res);
	}
}
