package example;

public class Student {
	String studentName = "ÀÌ¼ø½Å";
	int studentID;
	int age;
	int serialNum=1000;
	
	public Student() {
		
	}
	public Student(String name, int age) {
		serialNum++;
		this.studentID=serialNum;
		this.age = age;
		this.studentName=name;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	public void showInfo() {
		System.out.println(studentName+","+age);
	}
}
