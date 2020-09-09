package chapter05;

public class FunctionTest3 {
	public static void main(String[] args) {
		Operator oper = new Operator(); //클래스의 이름과 동일한 메소드는 생성자라고 함.
		int num1 = 10;
		int num2 = 5;
		int res1 = oper.add(num1, num2);
		System.out.println(res1);
		
		int res2 = oper.sub(num1, num2);
		System.out.println(res2);
		
		int res3 = oper.mul(num1, num2);
		System.out.println(res3);
		
		int res4 = oper.div(num1, num2);
		System.out.println(res4);

	}
}
