package chapter08;

public class StudentEx {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("studentNo: " + student.studentNo);
		
		System.out.println();
		
		People people = new People("유재석", "2345-789");
		
		System.out.println(people.name);
		System.out.println(people.ssn);
	}
}
