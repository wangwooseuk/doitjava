package example;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�?(Ȧ���� �Է�): ");
		int line = sc.nextInt();
		int upLine = line / 2;
		int downLine = line - upLine;

		for (int i = 0; i < upLine; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = downLine - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

//		for (int i = 0; i <= 4; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}
//		for (int i = 4-1; i >= 0; i--) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}
	}
}
