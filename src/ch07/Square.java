package ch07;

public class Square {
	int length;
	
	int area() {
		return length*length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.length = 4;
		int result = s.area();
		
		System.out.printf("�� ���� ���̰� %d�� ���簢���� ����: %d", s.length, result);

	}

}
