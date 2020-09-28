package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AsDoubleStreamAndBoxedExample {
		public static void main(String[] args) {
			int[] intArray = {1, 2, 3, 4, 5};
			
			IntStream intStream = Arrays.stream(intArray);
//			IntStream intStream = IntStream.of(intArray);
			intStream
					.asDoubleStream()
					.forEach(d -> System.out.println(d));
			System.out.println();
			
			intStream = Arrays.stream(intArray);
//			intStream
//					.boxed()
//					.forEach(obj -> System.out.println(obj.intValue()));
			
			Stream<Integer> temp = intStream.boxed();
			temp.forEach(obj -> System.out.println(obj.intValue()));
	}
}
