package example;

/*
 * 1���� 50������ ���� ����� ���ϴ� 
 * ���α׷��� �ۼ��ϼ���.
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
