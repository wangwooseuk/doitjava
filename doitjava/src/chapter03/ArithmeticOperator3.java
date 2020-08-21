package chapter03;

public class ArithmeticOperator3 {

	public static void main(String[] args) {
		int iRes;
		double dRes;
		float fRes;
		
		iRes = 25 + 10;
		System.out.println(iRes); //35
		iRes = 25 - 10;
		System.out.println(iRes); //15
		iRes = 25 * 10;
		System.out.println(iRes); //250
		iRes = 25 / 10;
		System.out.println(iRes); //2
		dRes = 25.0 / 10.0;
		System.out.println(dRes); //2.5
		iRes = 25 % 10;
		System.out.println(iRes); //5
		
		dRes = (double) 25 / 10;
		System.out.println(dRes); //2.5
		
		fRes = (float) 25 / 10;
		System.out.println(fRes); //2.5
		
		iRes = 45 + 25;
		System.out.println(iRes); //70
		iRes = 45 - 25;
		System.out.println(iRes); //20
		iRes = 45 * 25;
		System.out.println(iRes); //1125
		iRes = 45 / 25;
		System.out.println(iRes); //1
		dRes = 45.0 / 25.0;
		System.out.println(dRes); //1.8
		iRes = 45 % 25;
		System.out.println(iRes); //20
		
		dRes = (double) 45 / 25;
		System.out.println(dRes); //1.8
		
		fRes = (float) 45 / 25;
		System.out.println(fRes); //1.8
		
	}
}
