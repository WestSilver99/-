package ch08;

public class DrinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Drink d1 = new Drink(); => ������ X
		Drink d2 = new Drink("��ī��", 800);

	}

}

class Drink{
	String name;
	int price;
	
	/*
	Drink(){
		name = "�̸� ����";
		price = 0;
	} =>�� �κ��� ������ ������ ���� ��ü�� ���� �� ���� ����! ... <������ ������>
	*/ 
	
	Drink(String n, int p){
		name = n;
		price = p;
	}
}
