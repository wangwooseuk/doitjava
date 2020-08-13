package chapter02;

public class IntegerEx2 {

	public static void main(String[] args) {
		byte bNum = 50; // -128 ~ 127
		short sNum = 30_000; //-32000대 ~ 32000대
		int iNum = 1_900_000_000; // -21억 ~ 21억
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		
//		bNum = 150; //범위 초과
//		sNum = 33_000; //범위 초과
//		iNum = 2_200_000_000; //범위 초과
		
		System.out.println(2_200_000_000L); //long 범위 L대문자 사용
		
		int result;
		result = sNum + bNum;
		
		long lNum = 5_000_000_000L;
		System.out.println(lNum);
		
	}

}
