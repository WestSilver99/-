package ch08;

public class HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero ironman = new Hero("���̾��", 100, 120);
		Hero hulk = new Hero("��ũ", 200,80);
		
		System.out.println(ironman.toStr());
		System.out.println(hulk.toStr());
	}

}

class Hero{
	String name;
	int power;
	int speed;
	
	Hero(String n, int p, int s){
		name = n;
		power =p;
		speed = s;
	}
	
	String toStr() {
		return String.format("Hero{name: %s, power: %d, speed: %d}", name,power,speed);
	}
}