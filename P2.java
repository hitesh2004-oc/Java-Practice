package hello;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		//Display All File & Folder
		File f = new File("D:\\TestingProject");
		String[] arr = f.list();
		
		for(String p :arr) {
		
			File f1 = new File(f,p);
			if(f1.isFile()) {
				System.out.println(p+"  it is File");
			}
			if(f1.isDirectory()) {
				System.out.println(p+"  it is Folder");
			}
		}
		//Write the Data inside the File
		
		try {
			FileWriter fw = new FileWriter("Hitesh.txt");
			fw.write("This is My First File Data Write");
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		//Read the File Data......
		File r = new File("Hitesh.txt");
		try {
			Scanner sc = new Scanner(r);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		//Delete the File on Exiting Folder
		if(r.delete()) {
			System.out.println("Deleted the File");
		}
		else {
			System.out.println("Not Found the File");
		}
		
	}

}
