package jtm.activity10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {

	/*
	 * TODO Implement method that takes path to file as a parameter And copies whole
	 * contents of the file to the same location but with a new file name:
	 * <old_file_name>_backup e.g. if file is data.txt copy should be named
	 * data.txt_backup
	 */
	
	

	public void copyFile(String filePath) {
		
		
		BufferedReader reader;
		PrintWriter writer;
	
	File rightFile = new File (filePath);
	String newFilePath = filePath + "_backup";
	File copyFile = new File (newFilePath);
	
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
	
		System.out.println(filePath);
		System.out.println("Works");
		System.out.println(filePath);
		
//		
//		File rightFile = new File(filePath);
//		String newFilePath = filePath + "_backup";
//		File copyFile = new File(newFilePath);
//
//		try {
//			BufferedReader in = new BufferedReader(new FileReader(rightFile));
//
//			// List<String> linesInList = Files.readAllBytes(Paths.get(rightFile));
//			// Files.newBufferedWriter(Path.get(path), lines);
//			PrintWriter out = new PrintWriter(new FileWriter(copyFile));
//			String s;
//			while ((s = in.readLine()) != null) {
//				out.println(s);
//			}
//			in.close();
//			out.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
