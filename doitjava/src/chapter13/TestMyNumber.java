package chapter13;

public class TestMyNumber {
	public static void main(String[] args) {
//		MyNumber max = (x, y) -> (x >= y) ? x : y;
//		System.out.println(max.getMax(10, 20));
		
		int num1 = 10;
		int num2 = 20;
		
		//클래스기반 객체
		MyNumber in = new ImplNumber(); //둘다 가능
//		ImplNumber in = new ImplNumber();
		int result = in.getMax(num1, num2);
		System.out.println("in: " + result);
		
		//익명구현 객체
		MyNumber in2 = new MyNumber() {
//		MyNumber in2 = new ImplNumber() {
//		ImplNumber in2 = new ImplNumber() {
			@Override
			public int getMax(int num1, int num2) {
				int result = num1 >= num2 ? num1 : num2;
				return result;
			}
		};
		result = in2.getMax(num1, num2);
		System.out.println("in2: " + result);
		
		//람다식
//		MyNumber in3 = getMax(int x, int y)(x, y) -> {return x >= y ? x : y;};
		MyNumber in3 = (x, y) -> x >= y ? x : y;
		result = in3.getMax(num1, num2);
		System.out.println("in3: " + result);
	}
}
