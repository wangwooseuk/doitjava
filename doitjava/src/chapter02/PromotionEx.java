package chapter02;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;  //int <-- byte
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;  //int <-- char
		System.out.println("���� �����ڵ� :" + intValue);
		
		intValue = 200;
		double doubleValue = intValue; //double <-- int
		System.out.println(doubleValue);
//		intValue = doubleValue; //ū �ڷ����� �����ڷ������� ����ȯ �ȵ�
		
		int result = intValue + byteValue;
		System.out.println(result);
		
		short shortValue = 100;
		int res = byteValue + shortValue; //�⺻���� ������ int�� short�� �ƴ϶� int�� ��ƾ��Ѵ�.
		
		long longValue = 1000L;
		long res2 = intValue + longValue; //�⺻�� int���� long�� �� ũ�⶧���� long�� ��߾��Ѵ�.
	}

}
