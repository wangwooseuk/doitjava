package chapter05;

import java.util.Scanner;

/* �ʵ�, �޼ҵ�*/
public class FunctionTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student kim = new Student(); // ���ο� ��ü ����
		Student seo = new Student(); // ���ο� ��ü ����
		
		
		System.out.println(kim == seo); // �� ��ü�� ���� ��ü�� �ƴϴ�.

		/* method ȣ�� */
		kim.showStudentInfo();
		// ��ü�� �ʱⰪ�� null�̰�, int�� 0�̰�, boolean�� false��.

		/* ��ü�� ����� ��Ʈ������(.)�� �̿��Ͽ� ������ �� �ֽ��ϴ�. */
		kim.studentID = 2020010001;
		kim.studentName = "������";
		kim.grade = 3;
		kim.address = "����";
		kim.showStudentInfo();

		seo.studentID = 202001002;
		seo.studentName = "������";
		seo.grade = 1;
		seo.address = "����";
		seo.showStudentInfo();

		Student jo = new Student();
		jo.studentID = 202001003;
		jo.showStudentInfo();
		
		Student park = new Student();
		park.studentID = 1234123;
		park.studentName = "�ڸ���";
		park.address = "�뱸��";
		park.grade = 3;
		park.showStudentInfo();
	}
}