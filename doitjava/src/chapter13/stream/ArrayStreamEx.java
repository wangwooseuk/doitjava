package chapter13.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamEx {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr)
						.filter(t -> t%2==0)
						.forEach(t->System.out.print(t + ","));
		System.out.println();
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		int sum  = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf("1"));
		list.add(Integer.valueOf('2'));
		list.add(3);
		list.add(4);
		list.add(5);
		int sum2 = list.stream().mapToInt(t->t.intValue()).sum();
		System.out.println(sum2);
	}
}
