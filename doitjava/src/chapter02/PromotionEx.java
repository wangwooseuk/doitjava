package chapter02;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;  //int <-- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;  //int <-- char
		System.out.println("가의 유니코드 :" + intValue);
		
		intValue = 200;
		double doubleValue = intValue; //double <-- int
		System.out.println(doubleValue);
//		intValue = doubleValue; //큰 자료형은 작은자료형으로 형변환 안됨
		
		int result = intValue + byteValue;
		System.out.println(result);
		
		short shortValue = 100;
		int res = byteValue + shortValue; //기본적인 연산이 int라 short가 아니라 int에 담아야한다.
		
		long longValue = 1000L;
		long res2 = intValue + longValue; //기본이 int지만 long이 더 크기때문에 long에 담야야한다.
	}

}
