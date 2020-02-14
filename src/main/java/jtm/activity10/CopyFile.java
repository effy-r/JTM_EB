package jtm.activity10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {

	public static void main(String[] args) {
	
		
		BufferedReader reader;
		PrintWriter writer;
	
	File rightFile = new File ("C:\\Users\\evija\\Desktop\\newdocument.txt");
	//String newFilePath = filePath + "_backup";
	File copyFile = new File ("C:\\Users\\evija\\Desktop\\newdocument.txt_backup");
	
	try {
		if (copyFile.createNewFile()) {
			
		reader = new BufferedReader (new FileReader(rightFile));
		
		writer = new PrintWriter(new FileWriter(copyFile));
		
		String s;
		
		while ((s = reader.readLine())!= null) {
			
			writer.println(s);
			
		}
		reader.close();
		writer.close();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	//catch (FileNotFoundException f) {
		//f.printStackTrace();
	//}
	//C:\Users\evija\Desktop
}
}