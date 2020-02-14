package jtm.activity10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

/*
TODO Necessary imports commented
 */
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonRepo {

	private List<Person> personList;
	//private List<Person> countryList;

	public PersonRepo() {
		init();
	}

	public void init() {

		try {

//			File fileData = new File(
//					"/home/student/Desktop/javabootcamp-studentsproject-09047f538cba/src/main/resources/data.json");

			// Path path =
			// "/home/student/Desktop/javabootcamp-studentsproject-09047f538cba/src/main/resources/data.json";

			// BufferedReader reader = new BufferedReader(new FileReader(fileData));

			Path pathToFile = Paths.get(
					"/home/student/Desktop/javabootcamp-studentsproject-09047f538cba/src/main/resources/data.json");
			List<String> linesInList = Files.readAllLines(pathToFile);

			String res = String.join("\n", linesInList);

			ObjectMapper objectMapper = new ObjectMapper();

			personList = objectMapper.readValue(res, new TypeReference<List<Person>>() {
			});
			
			//countryList = objectMapper.readValue(res, new TypeReference<List<Person>>()
			
			

//			System.out.println(Arrays.toString(personList.toArray()));
//			System.out.println("The size of the array" + personList.size());

			// reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 1. Read file data.json from resources folder into String
		// 2. Use ObjectMapper to convert String to List of Persons and
		// store in personList field
		// Hint: Correct way how to use ObjectMapper to convert String to List below
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

	}

	public Person oldestPerson() {

		Person OldestPerson = personList.get(0);

		for (int i = 1; i < personList.size(); i++) {

			if (OldestPerson.getBirthDate().compareTo(personList.get(i).getBirthDate()) > 0) {

				OldestPerson = personList.get(i);
			}
		}
		// Find oldest person in personList field and return it
		return OldestPerson;

	}

	public Person youngestPerson() {


		Person YoungestPerson = personList.get(0);

		for (int i = 1; i < personList.size(); i++) {

			if (personList.get(i).getBirthDate().compareTo(YoungestPerson.getBirthDate()) > 0) {

				YoungestPerson = personList.get(i);
			}
		}
		// Find oldest person in personList field and return it
		return YoungestPerson;
		
	}

	public String largestPopulation() {
		
		//List <int> populationList = new List <int>;
		
		int population = 0;
		String biggestPopulation = null;
		
		ArrayList<String> countryList = new ArrayList<String>();
		
		for (int i = 0; i < personList.size(); i++) {
			
			countryList.add(personList.get(i).getCountry());
			
			
			}
		
		for (int i=0; i<countryList.size(); i++) {
			
			if (population < Collections.frequency(countryList, countryList.get(i))) {
				
				//Collections.frequency(countryList, countryList.get(i));
			
				population = i;

			}
		}
		
		biggestPopulation = countryList.get(population);
		
		System.out.println(biggestPopulation);
		// Find country with largest population and return it's name
		return biggestPopulation;
	}

}

/*
 * 
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList =
 * Arrays.asList(personArray);
 */
