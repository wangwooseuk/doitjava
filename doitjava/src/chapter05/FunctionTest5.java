package chapter05;

/*
 * Ŭ������ �������
 * �ʵ� ��ü�� �����Ͱ� ����Ǵ� �� int fieldName;
 * ������ ��ü ������ �ʱ�ȭ ���� ��� ClassName() {	}	
 * �޼ҵ� ��ü�� ���ۿ� �ش��ϴ� ���� ��� void methodName(){	}
 * 
 */
public class FunctionTest5 {
	public static void main(String[] args) {
		Obj obj = new Obj();
		int res = obj.add(1, 2);
		System.out.println(res);
	}
}

class Obj {
	int add(int a, int b) {
		return a + b + c;
	}
	int c = 10;
}