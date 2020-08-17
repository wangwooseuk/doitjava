package chapter03;

public class UnaryOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;  //같은 타입은 한 줄에 선언과 초기화를 할 수 있다.
		int d = 200;
		int e = 300;
		
		int c = 100, f = 500, g = 600;
				
		System.out.println("a++ =" + (a++) + ", ++b =" + ++b); //헷갈린다면 괄호를 써라.
		System.out.println("a =" + a + ", b =" + b);
		
		System.out.println("++d =" + (++d) + ", e++ =" + (e++)); //201 300
		System.out.println("d =" + d + ", e =" + e); //201 301
		
		c++; //100
		System.out.println(c); //101
		c++; //101
		c++; //102
		System.out.println(c++); //103
		System.out.println(c); //104
		++c; //105
		c++; //105
		++c; //107
		++c; //108
		++c; //109
		c++; //109
		System.out.println(++c); //111
		
		f++; //500
		f++; //501
		f++; //502
		f++; //503
		f++; //504
		++f; //506
		++f; //507
		++f; //508
		f++; //508
		System.out.println(f++); //509
		System.out.println(f); //510
		
		++g; //601
		++g; //602
		++g; //603
		++g; //604
		g++; //604
		g++; //605
		++g; //607
		g++; //607
		g++; //608
		g++; //609
		++g; //611
		++g; //612
		++g; //613
		System.out.println(g); //613
		
		--g; //612
		g--; //612
		g--; //611
		g--; //610
		--g; //608
		--g; //607
		g--; //607
		--g; //605
		g--; //605
		g--; //604
		System.out.println(g); //603
		
		System.out.println("++f =" + (++f) + ", g++ =" + (g++)); //511 603
		System.out.println("f =" + f + ", g =" + g ); //511 604
	}

}
