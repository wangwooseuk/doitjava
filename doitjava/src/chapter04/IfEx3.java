package chapter04;

public class IfEx3 {

	public static void main(String[] args) {
		int score = 75;

		if (score >= 90) { // true면 {} 실행
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
			//if는 무조건 있어야 함
		} else if (score >= 80) { //else 구문은 if문에서 false일 경우 실행되는 영역
			System.out.println("점수가 80보다 크거나 같습니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) { //else 구문은 if문에서 false일 경우 실행되는 영역
			if (score >= 75) {
				System.out.println("점수가 75보다 크거나 같습니다.");
				System.out.println("등급은 C+입니다.");
			} else {
				System.out.println("점수가 70보다 크거나 같습니다.");
				System.out.println("등급은 C입니다.");
			}	// else if는 여러개 있어도 된다.
		} else { 
			System.out.println("등급은 F입니다.");
		} //위의 조건이 모두 해당되지 않을 때 실행, 생략 가능
			//if 중첩은 3단계까지가 일반적
		
//		if (score < 90)  // false면 {} 실행 안함
//			System.out.println("점수가 90보다 적습니다.");
//			System.out.println("등급은 B입니다.");
		//중괄호 {}가 있으면 전체 영향 받고 {}가 없으면 한줄만 영향받음

		System.out.println("마지막 줄입니다."); // if문만 실행안되고 나머지는 실행
	}
}
