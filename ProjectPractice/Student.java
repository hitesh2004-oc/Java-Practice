package ProjectPractice;

public class Student {
	int id;
	String name;
	int age;
	String city;
	
	public Student(int id, String name, int age, String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public void Display() {
		System.out.println("Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]");
	}
	
	

}
