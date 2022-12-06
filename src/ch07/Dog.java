package ch07;

public class Dog {
	String name;
	String breeds;
	int age;
	
	void wag() {
		System.out.printf("[%s] »ì¶û»ì¶û~\n", name);
	}
	void bark() {
		System.out.printf("[%s] ¸Û¸Û!\n", name);
	}
	void bark(int times) {
		String sound = "ÄÈÄÈ!";
		System.out.printf("[%s] %s(x%d)\n", name, sound, times);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.name = "¸Á°í";
		d1.breeds = "°ñµç¸®Æ®¸®¹ö";
		d1.age = 2;
		
		d2.name = "±î¹Ì";
		d2.breeds = "¹Í½º";
		d2.age = 3;
		
		System.out.printf("d1 => {%s, %s, %d¼¼}\n", 
				d1.name, d1.breeds, d1.age);
		System.out.printf("d2 => {%s, %s, %d¼¼}\n", 
				d2.name, d2.breeds, d2.age);
		
		d1.wag();
		d2.bark();
		d1.bark(3);

	}

}
