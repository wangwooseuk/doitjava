package chapter05;

public class Student {
	int studentID; //필드
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() { //메소드
		System.out.println(studentName + "," + address);
		
	}
}
