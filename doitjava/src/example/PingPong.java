package example;

/*
 * 1에서 100까지의 숫자를 출력하고 
 * 3의 배수에 "Ping" 5의 배수에 "Pong" 중복일 때 "PingPong"으로
 * 출력되는 프로그램을 작성하세요.
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
			} //if문을 사용할 때 먼저 사용한 조건은 다음 사용할 때 사라진다.
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
