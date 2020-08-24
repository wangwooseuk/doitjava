package chapter04;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("hello!" + i);
			if(i == 1) {
				continue; //continue문은 현재 반복을 중단하고 다음 반복을 시작
			}
			System.out.println("출력..");
		}
		int cnt = 0;
		while(true) {
			System.out.println("while" + cnt++);
			if(cnt == 5) {
				continue;
			}
			System.out.println("출력..");
			if(cnt == 10) {
				break; //break문은 반복을 끝낼때 사용
			}
		}
	}
}
