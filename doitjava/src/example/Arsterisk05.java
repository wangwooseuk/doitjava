package example;

public class Arsterisk05 {

	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (4 - i >= j) {
//					System.out.print(" ");
//				}
//			}
//			System.out.println(6 - i);
//		}

//		for (int i = 4; i >= 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println(i + 1);
//		}

		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if(i == j) {
					System.out.print(i + 1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
