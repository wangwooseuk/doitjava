package chapter05;

public class Student {
	int studentID; //필드, 멤버 변수
	String studentName;
	int grade;
	String address;
	
	/*생성자 - 객체를 생성할 때 실행하는 블록*/
	Student(int num1, long num2) { 
		System.out.println("Student 객체를 생성합니다. ");
	}
	Student(int num1, int num2) { 
		System.out.println("Student 객체를 생성합니다. ");
	}
	Student(long num1, int num2) { 
		System.out.println("Student 객체를 생성합니다. ");
	}	//매개변수의 이름이 같아도, 형태(타입)가 다르면 정의(생성) 가능.
	Student(int num) { //매개변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다. " + num);
	}
	//Student() {} //디폴트 생성자: 생성자를 명시하지 않으면 자동으로 생성.
	//default 생성자는 매개변수가 없고 실행코드가 없는 생성자.
	Student(long num) { 
		System.out.println("Student 객체를 생성합니다. " + num);
	}
	Student() { //매개변수가 없는 생성자
		System.out.println("디폴트 생성자로 Student 객체를 생성합니다. ");
	}
	public void showStudentInfo() { //메소드, 멤버 함수
		System.out.println(studentName + "," + address);
		
	}
}
