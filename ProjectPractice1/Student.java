package ProjectPractice1;

public class Student {
	int id;
	String name;
	String city;
	
	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public void Display(int id,String name,String city) {
		System.out.println("ID : "+id+" Name : "+name+" City : "+city);
	}

}
