package chapter03;

public class ArithmeticOperator2 {

	public static void main(String[] args) {
		int iRes;
		double dRes;
		float fRes;
		
		iRes = 10 + 6;
		System.out.println(iRes); //16
		iRes = 10 - 6;
		System.out.println(iRes); //4
		iRes = 10 * 6;
		System.out.println(iRes); //60
		iRes = 10 / 6;
		System.out.println(iRes); //1
		dRes = 10.0 / 6.0;
		System.out.println(dRes); //1.6666
		iRes = 10 % 6;
		System.out.println(iRes); //4
		
		dRes = (double) 10 / 6;
		System.out.println(dRes); //1.6666666666666667
		
		fRes = (float) 10 / 6;
		System.out.println(fRes); //1.6666667
		
		iRes = 50 + 20;
		System.out.println(iRes); //70
		iRes = 50 - 20;
		System.out.println(iRes); //30
		iRes = 50 * 20;
		System.out.println(iRes); //1000
		iRes = 50 / 20;
		System.out.println(iRes); //2
		dRes = 50.0 / 20.0;
		System.out.println(dRes); //2.5
		iRes = 50 % 20;
		System.out.println(iRes); //10
		
		dRes = (double) 50 / 20;
		System.out.println(dRes); //2.5
		
		fRes = (float) 50 / 20;
		System.out.println(fRes); //2.5
		
	}
}
