package example;

/*
 * 1���� 50������ �� �� 3�� ����� ������
 * ���ϴ� ���α׷��� �ۼ��ϼ���.
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
