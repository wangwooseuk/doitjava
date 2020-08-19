package chapter04;

public class IfEx {

	public static void main(String[] args) {
		int score = 80;

		if (score >= 90) { // true면 {} 실행
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		} else { //else 구문은 if문에서 false일 경우 실행되는 영역
			System.out.println("점수가 90보다 적습니다.");
			System.out.println("등급은 B입니다.");
		}

//		if (score < 90)  // false면 {} 실행 안함
//			System.out.println("점수가 90보다 적습니다.");
//			System.out.println("등급은 B입니다.");
		//중괄호 {}가 있으면 전체 영향 받고 {}가 없으면 한줄만 영향받음

		System.out.println("마지막 줄입니다."); // if문만 실행안되고 나머지는 실행
	}
}
