package hello;

import java.io.File;

public class P1 {
	public static void main (String[] args) {
	  File f = new File("Data");
	  boolean s1 = f.mkdir();
	  
	 File a = new File(f , "test.txt");
	 
	 try {
		 a.createNewFile();
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }

	}

}
