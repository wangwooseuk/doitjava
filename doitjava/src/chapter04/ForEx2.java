package chapter04;

public class ForEx2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println("안녕하세요!" + i);
		} //보통 0으로 초기화하고, < 보다 작다를 많이 사용
		
//		System.out.println(i); 
		//int i = 0;초기화를 for문 내부에서 선언하여 {}밖에선 출력불가
		//초기화식, 조건식, 증감식 모두 생략 가능하나 고난이도이며, 잘 사용하지 않는다.
	}
}
