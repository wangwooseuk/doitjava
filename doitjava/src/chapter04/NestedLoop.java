package chapter04;

public class NestedLoop {

	public static void main(String[] args) {
//		int dan;
//		int times;
		
		for (int dan = 2; dan <= 9; dan++) {
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}  //dan,times 대신 보통 index = i,j 를 사용
			System.out.println(); //엔터 줄 띄우기
		}
	}
}
