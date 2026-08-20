package hello;

import java.io.*;


public class Test {
	public static void main(String[] args) throws Exception {
//		File f = new File("data.txt");
//		
//		try {
//			f.createNewFile();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		File fm = new File("Folder");
		fm.mkdir();
		File f = new File(fm,"data.txt");
		
		  f.createNewFile();
			FileWriter fw = new FileWriter("data.txt");
			fw.write("Hello Hitesh");
			fw.write("\nHello Vinod");
			fw.write("\nHello Mohit");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader("data.txt");
//		int i =	fr.read();
//		while(i != -1) {
//			System.out.print((char)i);
//			i =	fr.read();
//		}
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
			
	
	}

}
