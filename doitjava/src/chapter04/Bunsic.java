package chapter04;

import java.util.Scanner;

public class Bunsic {
	
	public static void main(String[] args) {
		System.out.println("�н��� �Դϴ�.");
		System.out.println("�޴��� �ֹ��� �ּ���");
		Scanner sc = new Scanner(System.in);
		String menu = "";
		System.out.println("A: dduck, B: sundae, C: oden, D: ramen");
		System.out.print("> ");
		
		menu = sc.next();
		
		switch(menu) {
			case "A":
				System.out.println("�����̸� �ֹ��߽��ϴ�.");
				break;
			case "B":
				System.out.println("���븦 �ֹ��߽��ϴ�.");
				break;
			case "C":
				System.out.println("������ �ֹ��߽��ϴ�.");
				break;
			default:
				System.out.println("����� �ֹ��߽��ϴ�.");
		}
		sc.close();
	}
}
