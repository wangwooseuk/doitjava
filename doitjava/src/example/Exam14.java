package example;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line;
		do {
			System.out.print("몇 줄을 출력할까요(홀수만 입력): ");
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
