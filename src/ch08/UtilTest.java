package ch08;

public class UtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util.m1();
		//Util.m2(); static�� �ƴϱ� ������ �ùٸ� ǥ�� X
		Util util = new Util();
		util.m2();

	}

}

class Util{
	static void m1() {
		System.out.println("Ŭ���� �޼ҵ� m1()�� ȣ��Ǿ����ϴ�.");
	}
	void m2() {
		System.out.println("�ν��Ͻ� �޼ҵ� m2()�� ȣ��Ǿ����ϴ�.");
	}
}