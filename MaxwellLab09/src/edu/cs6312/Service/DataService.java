/**
 * 
 */
package edu.cs6312.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import edu.cs6312.Model.Person;

/**
 * Read data from JSON
 * @author justinmaxwell
 * @version 3/3/2023
 */
public class DataService {
	
	/**
	 * Read JSON file and parse to array
	 * @return array of Person objects
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
    public static Person[] readPersonJSON() throws FileNotFoundException, IOException, ParseException {
    	
    	Object obj = new JSONParser().parse(new FileReader("people_mock_data.json"));
        
    	JSONArray ja = (JSONArray) obj;
    	    	
    	Iterator itr2 = ja.iterator();
    	
    	Person[] people = new Person[ja.size()];
    	int count = 0;
    	
    	while (itr2.hasNext()) {
            Iterator<Map.Entry> itr1 = ((Map) itr2.next()).entrySet().iterator();        	
            while (itr1.hasNext()) {                
                String lastName = (String) itr1.next().getValue();
        		String id = String.valueOf(itr1.next().getValue());
        		String ipAddress = (String) itr1.next().getValue();
        		String firstName = (String) itr1.next().getValue();
        		String email = (String) itr1.next().getValue();
                
                Person person = new Person(id, firstName, lastName, email, ipAddress);
        		people[count] = person;
                
            }
            count++;
        }    	
    	return people;
    }
}
