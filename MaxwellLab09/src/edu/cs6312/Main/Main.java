/**
 * 
 */
package edu.cs6312.Main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import edu.cs6312.Model.Person;
import edu.cs6312.Model.Sorting;
import edu.cs6312.Service.DataService;

/**
 * Main class
 * @author justinmaxwell
 * @version 3/3/2023
 */
public class Main {

	/**
	 * 0-argument
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		DataService.readPersonJSON();
		
		System.out.println(DataService.readPersonJSON()[999]);
		
	}

}
