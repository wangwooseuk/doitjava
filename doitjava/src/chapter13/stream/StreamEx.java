package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEx {
	public static void main(String[] args) {
		int[] intArr = new int[] {50, 40, 30, 20, 10};
		
		Arrays.stream(intArr)
					.filter(t -> t%3!=0)
					.forEach(t -> System.out.print(t + ","));
		System.out.println();
		
		boolean str = Arrays.stream(intArr)
					.anyMatch(t -> t%2==0);
					System.out.println(str);		
		str = Arrays.stream(intArr)
					.allMatch(t -> t%3==0);
					System.out.println(str);
		
		IntStream str2 = Arrays.stream(intArr);
			str2.asDoubleStream().forEach(t -> System.out.print(t + ","));
	}
}
