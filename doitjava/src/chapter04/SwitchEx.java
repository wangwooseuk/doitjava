package chapter04;

public class SwitchEx {

	public static void main(String[] args) {
		int  ranking = 1;
		char medalcolor;
		switch (ranking) {
			case 1:
				medalcolor = 'G';
				break;
			case 2:
				medalcolor = 'S';
				break;
			case 3:
				medalcolor = 'B';
				break;
			default:
				medalcolor = 'A';
				break;
		}
		System.out.println(ranking + "�� �޴��� ������" + medalcolor + "�Դϴ�.");
		
		if (ranking == 1) {
			medalcolor = 'G';
		} else if(ranking == 2) {
			medalcolor = 'S';
		} else if (ranking == 3) {
			medalcolor = 'B';
		} else {
			medalcolor = 'A';
		}
		System.out.println(ranking + "�� �޴��� ������" + medalcolor + "�Դϴ�.");
	}
}
