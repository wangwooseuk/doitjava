package chapter11;

class MyDog {
	String name;
	String type;
	
	MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String toString() {
		return type + " " + name;
	}
}

public class Q4 {
	public static void main(String[] args) {
		MyDog dog = new MyDog("삽살개", "말티즈");
		System.out.println(dog);
	}
}
