package chapter02;

public class IntegerEx2 {

	public static void main(String[] args) {
		byte bNum = 50; // -128 ~ 127
		short sNum = 30_000; //-32000�� ~ 32000��
		int iNum = 1_900_000_000; // -21�� ~ 21��
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		
//		bNum = 150; //���� �ʰ�
//		sNum = 33_000; //���� �ʰ�
//		iNum = 2_200_000_000; //���� �ʰ�
		
		System.out.println(2_200_000_000L); //long ���� L�빮�� ���
		
		int result;
		result = sNum + bNum;
		
		long lNum = 5_000_000_000L;
		System.out.println(lNum);
		
	}

}
