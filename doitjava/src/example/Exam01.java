package example;

import java.util.Scanner;

/*
 * �� �� ������ �о� �鿩 ���� ���̸� "Same"��,
 * �ٸ� ���̸� "Different"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 */

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��� �ּ���: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��� �ּ���: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		if(num1 == num2) System.out.println("Same");
		else System.out.println("Different");
		
		System.out.println(num1 == num2 ? "Same" : "Different");
		
		sc.close();
	}
}
