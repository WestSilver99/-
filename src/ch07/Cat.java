package ch07;

public class Cat {
	String name;
	String breeds;
	double weight;
	
	void claw() {
		System.out.println("������!!");
	}
	void meow() {
		System.out.println("�߿�~");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.name = "�׷�";
		c.breeds = "�丣�þ�";
		c.weight = 4.37;
		
		System.out.printf("�̸�: %s\n", c.name);
		System.out.printf("ǰ��: %s\n", c.breeds);
		System.out.printf("ü��: %.2fkg\n", c.weight);

	}

}
