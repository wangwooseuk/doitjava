package example;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?: ");
		int line = sc.nextInt();

		for (int i = line; i >= 0; i--) {
			for (int j = 0; j < line; j++) {
				if (j >= line - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for(int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
