package chapter04;

public class Bunsic2 {

	public static void main(String[] args) {
		System.out.println("XX�н� �Դϴ�.");
		System.out.println("�ֹ��� �ּ���");
		
		int dduck = 3000;
		int sundae = 2000;
		int oden = 1000;
		int ramen = 2500;
		
		int order1 = 0, order2 = 0, order3 = 0, order4 = 0;
		
		order1 = 2;
		order2 = 2;
		order3 = 3;
		order4 = 1;
	
		int res1 = dduck * order1;
		int res2 = sundae * order2;
		int res3 = oden * order3;
		int res4 = ramen * order4;
		
		System.out.println("������ " + order1 + "�κ� �ֹ��Ͽ��� " + res1 + "�� �Դϴ�.");
		System.out.println("���� " + order2 + "�κ� �ֹ��Ͽ��� " + res2 + "�� �Դϴ�.");
		System.out.println("���� " + order3 + "�� �ֹ��Ͽ��� " + res3 + "�� �Դϴ�.");
		System.out.println("��� " + order4 + "�κ� �ֹ��Ͽ��� " + res4 + "�� �Դϴ�.");
		
		System.out.println("�� ������ " + (res1 + res2 + res3 + res4) + "�� �Դϴ�.");
	}
}