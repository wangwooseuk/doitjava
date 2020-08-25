package chapter04;

public class Example3 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j > i)
					break;
				System.out.println(i + "X" + j + "=" + i * j);
			}
			System.out.println();
		}
	}
}
