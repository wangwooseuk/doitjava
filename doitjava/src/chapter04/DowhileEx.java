package chapter04;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
				System.out.print("> ");
				inputString = scan.nextLine();
				System.out.println(inputString);
		} while (!inputString.equals("q"));
		System.out.println();
		System.out.println("���α׷� ����");
		scan.close();
	}
}
