package chapter08;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent p = new Parent();
		Parent parent = child;
		p.method1();
		p.method2();
		
		System.out.println();
		
		parent.method1();
		parent.method2();
		//parent.method3() ȣ�� �Ұ���
		child.method3();
	}
}
