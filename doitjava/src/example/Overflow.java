package example;

public class Overflow {

	public static void main(String[] args) {
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		
		//������ �ִ밪���� +�� �ϸ� -�� ���������� ��Ÿ����
		//������ ���������� -�� �ϸ� +�ִ밪���� ��Ÿ����.
		
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
