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
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
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
