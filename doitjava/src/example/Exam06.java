package example;

/*
 * 1���� 50������ �� �� 3�� ����� �հ踦
 * ���ϴ� ���α׷��� �ۼ��ϼ���.
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
