package chapter08;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();
		//parent.method3() 호출 불가능
	}
}
