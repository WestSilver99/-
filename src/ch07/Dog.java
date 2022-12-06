package ch07;

public class Dog {
	String name;
	String breeds;
	int age;
	
	void wag() {
		System.out.printf("[%s] ������~\n", name);
	}
	void bark() {
		System.out.printf("[%s] �۸�!\n", name);
	}
	void bark(int times) {
		String sound = "����!";
		System.out.printf("[%s] %s(x%d)\n", name, sound, times);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.name = "����";
		d1.breeds = "��縮Ʈ����";
		d1.age = 2;
		
		d2.name = "���";
		d2.breeds = "�ͽ�";
		d2.age = 3;
		
		System.out.printf("d1 => {%s, %s, %d��}\n", 
				d1.name, d1.breeds, d1.age);
		System.out.printf("d2 => {%s, %s, %d��}\n", 
				d2.name, d2.breeds, d2.age);
		
		d1.wag();
		d2.bark();
		d1.bark(3);

	}

}
