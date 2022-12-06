package ch08;

public class DrinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Drink d1 = new Drink(); => 생성자 X
		Drink d2 = new Drink("박카스", 800);

	}

}

class Drink{
	String name;
	int price;
	
	/*
	Drink(){
		name = "이름 없음";
		price = 0;
	} =>이 부분이 빠지면 생성자 없는 객체를 생성 할 수가 없다! ... <디폴스 생성자>
	*/ 
	
	Drink(String n, int p){
		name = n;
		price = p;
	}
}
