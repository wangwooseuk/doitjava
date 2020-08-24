package chapter04;

public class ForEx3 {

	public static void main(String[] args) {
		int i, j;
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i = 0; i < 3; i++) {
			System.out.println("hello!");
		}
		//내부에 중복해서 i를 사용하면 안되고 다른 for문에서는 i를 중복 가능
	}
}
