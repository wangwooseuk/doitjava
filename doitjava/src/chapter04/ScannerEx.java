package chapter04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		int iNum;
		Scanner sc =new Scanner(System.in); 
		//��ĳ�� ���� �ڵ� - ���� ������ ���� ������ ��(sc)������ �ܿ�����
		//ctrl + shift + o 
		
//		System.out.println("������ �Է��� �ּ���:");
//		System.out.print("> ");
//		iNum = sc.nextInt(); // next �������� �ѱ�� int(4����Ʈ)ũ��� ���
//		System.out.println("�Է��� ����: " + iNum);
//		System.out.println();
//		System.out.print("�Ǽ��� �Է��� �ּ���:");
//		double dNum = sc.nextDouble();
//		System.out.println("�Է��� �Ǽ�: " + dNum);
//		System.out.println();
//		System.out.print("�Ǽ�(f)�� �Է��� �ּ���:");
//		float fNum = sc.nextFloat();
//		System.out.println("�Է��� �Ǽ�(f): " + fNum);
//		System.out.println();
		System.out.print("���ڿ��� �Է��� �ּ���:");
//		String str = sc.next();
//		// ���ڿ� �Է¿��� next() ��������� ������ ���� �� �����ϴ�.
//		// ��ĳ�ʿ��� ������ ������ �Է��� �ǹ��մϴ�.
//		System.out.println("�Է��� ���ڿ�:" + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ�:" + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ�:" + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ�:" + str);
		
		String str = sc.nextLine(); //�� �� �Է� ��ɾ�� ���鵵 �Է� �����մϴ�.
		System.out.println("�Է��� ���ڿ�:" + str);
		
		sc.close(); // ��ĳ�ʴ� �� �̻� ������� �ʴ´ٸ� �ݾ���� �մϴ�.
	}

}
