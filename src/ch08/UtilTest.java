package ch08;

public class UtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util.m1();
		//Util.m2(); static이 아니기 때문에 올바른 표현 X
		Util util = new Util();
		util.m2();

	}

}

class Util{
	static void m1() {
		System.out.println("클래스 메소드 m1()가 호출되었습니다.");
	}
	void m2() {
		System.out.println("인스턴스 메소드 m2()가 호출되었습니다.");
	}
}