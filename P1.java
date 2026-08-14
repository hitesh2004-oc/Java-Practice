package hello;

import java.io.File;

public class P1 {
	public static void main (String[] args) {
		// Using this File Class We Create File
	  File f = new File("Data");
	  boolean s1 = f.mkdir();
	  
	 File a = new File(f , "test.txt");
	 // it will give us Exception So we use Try & Catch
	 try {
		 a.createNewFile();
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }

	}

}
