package chapter13;

class A { // 외부 클래스
	A() {  //메소드
		System.out.println("A 객체가 생성됨");
	}
	// 내부 인스턴스 멤버 클래스
	class B {
		B() { //메소드
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		//static int field2;
		void method1() {
		}
		//static void method2(){}
	}
	
	// 내부 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {
		}
		static void method2() {
		}
	}
	void method() {
		//메소드 안에 생성하는 클래스 = 로컬 클래스
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			//static int field2;
			void method1() {
			}
			//static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}