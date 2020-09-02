package example;

public class Overflow {

	public static void main(String[] args) {
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		
		//변수의 최대값에서 +를 하면 -의 최저값으로 나타나고
		//변수의 최저값에서 -를 하면 +최대값으로 나타난다.
		
		int iNum = Integer.MIN_VALUE;
		System.out.println(iNum);
		iNum--;
		System.out.println(iNum);
		
		long lNum = Long.MAX_VALUE;
		System.out.println(lNum);
		lNum++;
		System.out.println(lNum);
		
		float fNum = Float.MIN_VALUE;
		System.out.println(fNum);
		fNum++;
		System.out.println(fNum);
		
		double dNum = Double.MAX_VALUE;
		System.out.println(dNum);
		dNum++;
		System.out.println(dNum);
		
		short sNum = Short.MIN_VALUE;
		System.out.println(sNum);
		sNum--;
		System.out.println(sNum);
	}
}
