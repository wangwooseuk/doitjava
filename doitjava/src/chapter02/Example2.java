package chapter02;

public class Example2 {
	
	public static void main(String[] args) {
		int iNum = 15;
		double dNum = 4.5;
		
		int iNum1 = (int) (iNum + dNum);
		int iNum2 = (int) (iNum - dNum);
		int iNum3 = (int) iNum * (int) dNum;
		int iNum4 = (int) iNum / (int) dNum;
		System.out.println(iNum1);
		System.out.println(iNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		char ch1 = 'Пе';
		System.out.println((int)ch1);
		int iNum5 = ch1;
		System.out.println(iNum5);
		
		int iNum6 = 50773;
		System.out.println((char)iNum6);
		char ch2 = (char) iNum6;
		System.out.println(ch2);
		
		}
}
