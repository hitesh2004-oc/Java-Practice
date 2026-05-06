package ProjectPractice;

import java.util.ArrayList;

public class StudentBusiness {
	ArrayList<Student> al = new ArrayList<>();
	
	public void addStudents(Student s) {
		al.add(s);
		System.out.println("Student Added!!");
	}
	
	public void viewStudent() {
		if(al.isEmpty()) {
			System.out.println("Student not Found");
			return;
		}
		for(Student s : al) {
			s.Display();
		}
	}
	public Student searchStudent(int id) {
		for(Student s : al) {
			if(s.id == id) {
				return s;
			}
		}
		return null;
	}
	public void deleteStudent(int id) {
		Student s = searchStudent(id);
		if(s != null) {
			al.remove(s);
			System.out.println("Student Deleted!");
		}else System.out.println("Student Not Found!");	
	}

	public void updateStudent(int id, String name, int age, String city) {
		Student s = searchStudent(id);
		if(s != null) {
			s.name = name;
			s.age = age;
			s.city = city;
			System.out.println("Student Updated!");
		}else System.out.println("Student Not Found!");
		
		
	}

}
