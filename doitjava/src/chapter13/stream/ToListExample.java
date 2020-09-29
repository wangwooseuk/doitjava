package chapter13.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("ȫ�浿", 10, Student2.Sex.MALE),
				new Student2("�����", 6, Student2.Sex.FEMALE),
				new Student2("�ſ��", 10, Student2.Sex.MALE),
				new Student2("�ڼ���", 6, Student2.Sex.FEMALE)
		);
		
		//���л��鸸 ���� List ����
		List<Student2> maleList = totalList.stream().filter(s -> s.getSex()==Student2.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		//���л��鸸 ���� HashSet ����
		Set<Student2> femaleList = totalList.stream().filter(s -> s.getSex()==Student2.Sex.FEMALE)
//				.collect(Collectors.toCollection(HashSet :: new));
//				.collect(Collectors.toCollection(() -> {return new HashSet<Student2>();}));
				.collect(Collectors.toCollection(() -> new HashSet<Student2>()));
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}

}
