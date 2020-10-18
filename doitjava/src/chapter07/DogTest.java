package chapter07;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("치와와", "철수");
		dogArray[1] = new Dog("진돗개", "영희");
		dogArray[2] = new Dog("푸들", "재석");
		dogArray[3] = new Dog("말티즈", "호동");
		dogArray[4] = new Dog("포메라니안", "명수");
		
		for(int i=0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println();
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}
}
