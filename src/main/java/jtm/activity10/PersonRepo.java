package jtm.activity10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;

/*
TODO Necessary imports commented
 */
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.*;

public class PersonRepo {

	private List<Person> personList;

	public PersonRepo() {
		init();
	}

	public void init() {

		try {

			File fileData = new File("\\data.json");
			BufferedReader reader = new BufferedReader(new FileReader(fileData));
			List<String> linesInList = Files.readAllBytes(Paths.get(fileData));
			List<String> presonList = new List<String>;

			// Files.newBufferedWriter(Path.get(path), lines);
			
			// 1. Read file data.json from resources folder into String
			// 2. Use ObjectMapper to convert String to List of Persons and
			// store in personList field
			// Hint: Correct way how to use ObjectMapper to convert String to List below
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Person oldestPerson() {
		
		Person OldestPerson = new Person();
		for (int i=0; i<size.personList; i++) {
			if (get.personList(i)>OldestPerson) {
				OldestPerson = get.personList(i);
			}
		}
		// Find oldest person in personList field and return it
		return OldestPerson;
	}

	public Person youngestPerson() {
		
		Person YoungestPerson = new Person();
		for (int i=0; i<size.personList; i++) {
			if (get.personList(i)<YoungestPerson) {
				YoungestPerson = get.personList(i);
			}
		}
		// Find youngest person in personList field and return it
		return YoungestPerson;
	}

	public String largestPopulation() {
		// Find country with largest population and return it's name
		return null;
	}

}

/*
 * 
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList =
 * Arrays.asList(personArray);
 */
