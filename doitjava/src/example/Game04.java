package example;

import java.util.Scanner;

/*
 * 1부터 100 사이의 소수를 나타내라.
 */

public class Game04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int cnt = 0;
		System.out.print("숫자를 입력하세요: ");

		num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println(i);
			}
			cnt = 0;
		}
	}
}
