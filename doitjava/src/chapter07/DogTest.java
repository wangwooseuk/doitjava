package chapter07;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("ġ�Ϳ�", "ö��");
		dogArray[1] = new Dog("������", "����");
		dogArray[2] = new Dog("Ǫ��", "�缮");
		dogArray[3] = new Dog("��Ƽ��", "ȣ��");
		dogArray[4] = new Dog("���޶�Ͼ�", "���");
		
		for(int i=0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println();
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}
}
