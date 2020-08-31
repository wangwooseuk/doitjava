package chapter04;

public class SwitchEx4 {

	public static void main(String[] args) {
		int cnt = 4;
		
		switch(cnt) {
			case 1:
				System.out.println("1Ãþ ¾à±¹");
				break;
			case 2:
				System.out.println("2Ãþ Á¤Çü¿Ü°ú");
				break;
			case 3:
				System.out.println("3Ãþ ÇÇºÎ°ú");
				break;
			case 4:
				System.out.println("4Ãþ Ä¡°ú");
				break;
			case 5:
				System.out.println("5Ãþ Çï½º Å¬·´");
				break;
			default:
				System.out.println("¾ø´Â Ãþ");
		}
		
	}
}
