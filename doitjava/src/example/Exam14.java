package example;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line;
		do {
			System.out.print("�� ���� ����ұ��(Ȧ���� �Է�): ");
			line = sc.nextInt();
		} while (line % 2 == 0);
		for (int i = line - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (j == i) {
					System.out.print("@");
				} else {
					System.out.print("$");
				}
			}
			System.out.println();
		}
		sc.close();

//		for(int i=9; i>=0; i--) {
//			System.out.println(i);
//		}
	}
}
