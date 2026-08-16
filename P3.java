package hello;

import java.io.File;

public class P3 {
	public static void main(String[] args) {
		File f = new File("Folder1");
		f.mkdir();
		
		 File a = new File(f , "test.txt");
		 
		 try {
			 a.createNewFile();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	}

}
