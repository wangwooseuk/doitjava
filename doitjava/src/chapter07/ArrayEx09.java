package chapter07;

public class ArrayEx09 {
	public static void main(String[] args) {
		int[][] arr = { 
						{ 10, 20 }, //(0,0) (0,1)
						{ 30, 40 }, //(1,0) (1,1)
						{ 50, 60, 70 } //(2,0) (2,1) (2,2)
					};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
