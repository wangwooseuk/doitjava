package example;

/*
 * 1���� 10������ �� �� Ȧ���� �հ踦
 * ���ϴ� ���α׷��� �ۼ��ϼ���.
 */

public class Exam05 {

	public static void main(String[] args) {
		int sum = 0;
		
//		for(int i=1; i<=10; i++) {
//			if(i % 2 != 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
