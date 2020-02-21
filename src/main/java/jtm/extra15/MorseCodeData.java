package jtm.extra15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



public class MorseCodeData {

	
	static HashMap morseLibrary = new HashMap<String, String> ();
	//BufferedReader reader;
	//PrintWriter writer;
	
	private static void insertMorseCode() {
		try {
			System.out.println(	"Does it work?");
			
			Path pathToFile = Paths.get(
					"/home/student/Desktop/javabootcamp-studentsproject-09047f538cba/src/main/java/jtm/extra15/MorseLetters.txt");
			
			//File morseFile = new File (pathToFile);
			
			
			//reader = new BufferedReader (new FileReader(morseFile));
			
			//writer = new PrintWriter(new FileWriter(copyFile));
			
			System.out.println("1");
			
			List<String> linesInList = Files.readAllLines(pathToFile);
			System.out.println("2");

			String res = String.join("\n", linesInList);
			System.out.println("3");

			ObjectMapper objectMapper = new ObjectMapper();
			System.out.println("1");

			morseLibrary = objectMapper.readValue(res, null);
			
		System.out.println(	"Does it work?" + morseLibrary.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		//MorseCodeData one = new 
		insertMorseCode();
		//System.out.println(	"Does it work?" + (insertMorseCode().toString()));
		
	}
}
