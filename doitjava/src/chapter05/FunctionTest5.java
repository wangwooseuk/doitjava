package chapter05;

/*
 * 클래스의 구성멤버
 * 필드 객체의 데이터가 저장되는 곳 int fieldName;
 * 생성자 객체 생성시 초기화 역할 담당 ClassName() {	}	
 * 메소드 객체의 동작에 해당하는 실행 블록 void methodName(){	}
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