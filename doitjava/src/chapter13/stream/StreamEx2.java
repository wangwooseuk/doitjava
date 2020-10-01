package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class StreamEx2 {
	public static void main(String[] args) {
		DoubleStream doubleStream = Arrays.stream(new double[] {50, 20, 10, 30, 40});
		doubleStream.sorted().forEach(n -> System.out.print(n +","));
		System.out.println();
		
		List<Student> stList = Arrays.asList(
				new Student("유재석", 35), 
				new Student("강호동", 15),
				new Student("박명수", 45)
		);
		stList.stream().sorted().forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		stList.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println();
		stList.stream().sorted().forEach(System.out :: println);
		System.out.println();
		
		int sum1 = stList.stream().mapToInt(Student :: getScore).sum();
		int sum2 = stList.stream().map(Student :: getScore).reduce(0,(a, b) -> a + b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}
}
