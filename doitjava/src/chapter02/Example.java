package chapter02;

public class Example {

	public static void main(String[] args) {
		int iNum1 = 10;
		float fNum2 = 2.0f;
		
		int iNum3 = (int) iNum1 + (int) fNum2;
		int iNum4 = (int) iNum1 - (int) fNum2;
		int iNum5 = (int) (iNum1 * fNum2);
		int iNum6 = (int) (iNum1 / fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		System.out.println(iNum5);
		System.out.println(iNum6);
		
		char ch1 = '±Û';
		System.out.println((int)ch1);
		int ch2 = 44544;
		System.out.println((char)ch2);
	}

}
