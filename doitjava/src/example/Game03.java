package example;

import java.util.Scanner;

public class Game03 {

	public static void main(String[] args) {
		// ���� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// switch case ������ ����ؾ� �մϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ ������ ���ڸ� �˰� �����Ű���?: ");
		
		int day = 0;
		int month = sc.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 30;
		}
		System.out.println(month + "���� ������ ���ڴ� " + day + "���Դϴ�.");
		sc.close();
	}
}
