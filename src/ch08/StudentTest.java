package ch08;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student park = new Student(2019122104, "Park");
		Student kim = new Student(201920608, "Kim");
		Student lee = new Student(2019153237, "Lee");
		System.out.printf("Student 개체의 수: %d", Student.count);

	}

}

class Student{
	static int count  = 0;
	
	int id;
	String name;
	
	Student(int id, String name){
		Student.count++;
		this.name = name;
		this.id =id;
	}
	
	
}