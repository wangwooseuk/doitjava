package chapter08;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3() ȣ�� �Ұ���
		
		System.out.println();
		
		child.method1();
		child.method2();
		child.method3();
	}
}
