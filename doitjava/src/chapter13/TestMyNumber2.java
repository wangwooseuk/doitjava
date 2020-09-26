package chapter13;

public class TestMyNumber2 {
	public static void main(String[] args) {
		int a = 200;
		int b = 350;
		
		//Ŭ���ı�ݰ�ü
		MyNumber2 mn = new ImplNumber2();
	  //ImplNumber2 mn = new ImplNumber2();
		int res = mn.getSum(a, b);
		System.out.println(res);
		
		//�͸�����ü
		MyNumber2 mn2 = new MyNumber2() {
			@Override
			public int getSum(int a, int b) {
				return a + b;
			}
		};
		res = mn2.getSum(a, b);
		System.out.println(res);
		
		//���ٽ�
		MyNumber2 mn3 = (x, y) -> x + y;
		res = mn3.getSum(a, b);
		System.out.println(res);
	}
}
