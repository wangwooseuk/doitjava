package chapter02;

public class CastingEx2 {

	public static void main(String[] args) {
		char ch1 = '±Ø';
		int iNum = ch1;
		System.out.println(iNum);
		
		int iNum1 = 44537;
		char ch2 = (char) iNum1;
		System.out.println(ch2);
		
		double dNum = 3.145678123912;
		iNum1 = (int) dNum;
		System.out.println(iNum1);
		
		float fNum = 3.1455555143f;
		iNum1 = (int) fNum;
		System.out.println(iNum1);
		
		long lNum = 1_505_459_105L;
		iNum1 = (int) lNum;
		System.out.println(iNum1);
		
		int iNum2 = 12345;
		byte bNum = (byte) iNum2;
		System.out.println(bNum);
		
		short sNum = (short) iNum2;
		System.out.println(sNum);
	}

}
