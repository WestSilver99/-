package ch08;

public class AvengerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avenger thor = new Avenger("�丣", 150);
		Avenger thanos = new Avenger("Ÿ�뽺", 160);
		thor.punch(thanos);
		thor.punch(thanos);
		thanos.punch(thor);

	}

}

class Avenger{
	String name;
	int hp;
	
	Avenger(String s, int i){
		name = s;
		hp = i;
	}
	
	void punch(Avenger enemy) {
		System.out.printf("[%s]�� ��ġ!", name);
		enemy.hp -=10;
		System.out.printf(" -> %s�� ü��: %d\n", enemy.name, enemy.hp);
	}
}