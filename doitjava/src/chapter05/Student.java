package chapter05;

public class Student {
	int studentID; //�ʵ�, ��� ����
	String studentName;
	int grade;
	String address;
	
	/*������ - ��ü�� ������ �� �����ϴ� ���*/
	Student(int num1, long num2) { 
		System.out.println("Student ��ü�� �����մϴ�. ");
	}
	Student(int num1, int num2) { 
		System.out.println("Student ��ü�� �����մϴ�. ");
	}
	Student(long num1, int num2) { 
		System.out.println("Student ��ü�� �����մϴ�. ");
	}	//�Ű������� �̸��� ���Ƶ�, ����(Ÿ��)�� �ٸ��� ����(����) ����.
	Student(int num) { //�Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}
	//Student() {} //����Ʈ ������: �����ڸ� ������� ������ �ڵ����� ����.
	//default �����ڴ� �Ű������� ���� �����ڵ尡 ���� ������.
	Student(long num) { 
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}
	Student() { //�Ű������� ���� ������
		System.out.println("����Ʈ �����ڷ� Student ��ü�� �����մϴ�. ");
	}
	public void showStudentInfo() { //�޼ҵ�, ��� �Լ�
		System.out.println(studentName + "," + address);
		
	}
}
