package chapter05;

public class CalcStatic {
	static double pi = 3.14159; //�������
	int num1 = 10; //�ν��Ͻ� ���
	static int num2 = 20; //�ν��Ͻ� ���
	
	static int plus(int x, int y) { //����
		return x + y;
	}
	
	static int minus(int x, int y) { //����
		return x - y;
	}
	
	int meltiply(int x, int y) { //�ν��Ͻ�
		return x * y;
	}
}
