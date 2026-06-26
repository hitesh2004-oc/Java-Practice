package FileHandlingPractice;

import java.io.File;

public class P1 {
	public static void main(String[] args) throws Exception{
		     
//            FileWriter fw = new FileWriter("Hello.txt");
//             File f1 = new File("Hello/Hello.txt");
//             f1.createNewFile();
//		      fw.write("Hello World\n");
//		      fw.write("Spring Boot");
//		      fw.flush();
//		      fw.close();
//             f.mkdir();
//             f.createNewFile();
             System.out.println("Done");
//             FileReader fr = new FileReader("Hello.txt");
//             int i =  fr.read();
//             while(i>0) {
//            	 System.out.print((char)i);
//            	 i = fr.read();
//             }
	
		File f = new File("Hello");
             f.delete();
             
	}

}
