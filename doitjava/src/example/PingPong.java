package example;

/*
 * 1���� 100������ ���ڸ� ����ϰ� 
 * 3�� ����� "Ping" 5�� ����� "Pong" �ߺ��� �� "PingPong"����
 * ��µǴ� ���α׷��� �ۼ��ϼ���.
 */
public class PingPong {

	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "PingPong");
			} else if(i % 3 == 0) { 
				System.out.println(i + "Ping");
			} else if(i % 5 == 0) { 
				System.out.println(i + "Pong");
			} else {
				System.out.println(i);
			} //if���� ����� �� ���� ����� ������ ���� ����� �� �������.
		}
		
		for(int i=1; i<=100; i++) {
			System.out.println(i + " ");
			if(i % 3 ==0) {
				System.out.println("Ping");
			}
			if(i % 5 == 0) {
				System.out.println("Pong");
			}
			System.out.println();
		}
	}
}
