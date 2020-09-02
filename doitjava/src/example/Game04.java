package example;

import java.util.Scanner;

/*
 * 1부터 100 사이의 소수를 개수는?
 */

public class Game04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");

		int num = sc.nextInt();
		int cnt = 0;

		for (int i = 2; i <= num; i++) {
			cnt++;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println("입력한 숫자의 소수의 개수는 " + cnt + "개입니다.");
		sc.close();
	}
}
