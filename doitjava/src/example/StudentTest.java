package example;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.getStudentName();
		student.age = 15;
		System.out.println(student.serialNum);
		student.showInfo();
		student.setStudentName("강호동");
		student.showInfo();
		
		
		Student student2 = new Student("홍길동", 23);
		System.out.println(student2.studentID);
		student2.showInfo();
		
		
	}
}
