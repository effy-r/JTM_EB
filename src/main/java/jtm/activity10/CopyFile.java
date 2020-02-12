package jtm.activity10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {

	public static void main(String[] args) {
	
		
	
	
	File rightFile = new File ("C:\\Users\\evija\\Desktop\\newdocument.txt");
	//String newFilePath = filePath + "_backup";
	File copyFile = new File ("C:\\Users\\evija\\Desktop\\newdocument.txt_backup");
	
	try {
		
		BufferedReader in = new BufferedReader (new FileReader(rightFile));
		
		//List<String> linesInList = Files.readAllBytes(Paths.get(rightFile));
		//Files.newBufferedWriter(Path.get(path), lines);
		PrintWriter out = new PrintWriter(new FileWriter(copyFile));
		String s;
		while ((s = in.readLine())!= null) {
			out.println(s);
		}
		in.close();
		out.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	//C:\Users\evija\Desktop
}
}