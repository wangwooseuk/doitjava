package example;

import java.util.Scanner;

/*
 * 1���� 100 ������ �Ҽ��� ������?
 */

public class Game04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���: ");

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
		System.out.println("�Է��� ������ �Ҽ��� ������ " + cnt + "���Դϴ�.");
		sc.close();
	}
}
