package chapter07;

public class ArrayExam02 {
	public static void main(String[] args) {
		double[] dNum = new double[6];
		
		dNum[0] = 10.0;
		dNum[2] = 15.0;
		dNum[4] = 20.0;
		double sum = 0;
		
		for(int i=0; i<dNum.length; i++) {
			System.out.println(dNum[i]);
			sum += dNum[i];
		}
		System.out.println();
		System.out.println(sum);
	}
}
