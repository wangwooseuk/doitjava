package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList( //요소의 추가/삭제 불가
				new Student("홍길동", 90),
				new Student("신용권", 92)
				);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
		
		list.stream().forEach(s -> System.out.println(s));
		list.stream().forEach(System.out :: println);
	}
}
