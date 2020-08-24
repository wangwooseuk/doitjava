package chapter04;

public class Example2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		for(i = 2; i <= 9; i = i + 2) {
			for(j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
				continue;
			}
			System.out.println();
		}
	}
}
