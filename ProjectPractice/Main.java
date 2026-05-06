package ProjectPractice;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        StudentBusiness service = new StudentBusiness();
	        
	        while(true) {
	        	System.out.println("--------S M S-------");
	        	System.out.println("1) Add Students");
	        	System.out.println("2) View Students");
	        	System.out.println("3) Search Students");
	        	System.out.println("4) Update Students");
	        	System.out.println("5) Delete Students");
	        	System.out.println("6) Exit");
	        	
	        	System.out.println("Enter Choice: ");
	        	int choice = sc.nextInt();
	        	
	        	switch(choice) {
	         	case 1: System.out.print("Enter Id: ");
    	        int id = sc.nextInt();
    	        if(service.searchStudent(id) != null) {
    	            System.out.println("Student with this ID already exists!");
    	            break;
    	        }
    	        sc.nextLine();
    	        
    	        System.out.print("Enter Name: ");
    	        String name = sc.nextLine();
    	        
    	        System.out.print("Enter Age: ");
    	        int age = sc.nextInt();
    	        sc.nextLine();
    	        
    	        System.out.print("Enter City: ");
    	        String city = sc.nextLine();
    	        
    	        service.addStudents(new Student(id,name,age,city));
    	        break;
    	        
    	case 2: 
    		service.viewStudent();
    		break;
    		
    	case 3:
    		System.out.print("Enter Id: ");
    		int sid = sc.nextInt();
    		Student s = service.searchStudent(sid);
    		if(s != null) s.Display();
    		else System.out.println("Student Not Found!");
    		break;
    		
    	case 4:
    		System.out.print("Enter Id: ");
    		int uid =  sc.nextInt();
    		sc.nextLine();
    		
    		 System.out.print("Enter New Name: ");
             String uname = sc.nextLine();

             System.out.print("Enter New Age: ");
             int uage = sc.nextInt();
             sc.nextLine();

             System.out.print("Enter New City: ");
             String ucity = sc.nextLine();

             service.updateStudent(uid, uname, uage, ucity);
             break;
             
    	  case 5:
              System.out.print("Enter ID: ");
              int did = sc.nextInt();
              service.deleteStudent(did);
              break;

          case 6:
              System.out.println("Exiting...");
              return;

          default:
              System.out.println("Invalid Choice!");
    	}
	     }
	        
	}

}
