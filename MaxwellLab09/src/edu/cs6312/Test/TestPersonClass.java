package edu.cs6312.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.cs6312.Model.Person;

class TestPersonClass {

	@Test
	void testPersonConstructor() {
		Person person = new Person("1", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
				
		assertEquals("John", person.getFirstName(), "Testing constructor.");
	}
	
	@Test
	void testSetGetId() {
		Person person = new Person("2", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		
		person.setId("3");
				
		assertEquals("3", person.getId(), "Testing id.");
	}
	
	@Test
	void testNullId() {		
		assertThrows(NullPointerException.class, () -> {
			Person person = new Person(null, "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		});
	}
	
	@Test
	void testEmptyId() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Person person = new Person("", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		});
	}
	
	@Test
	void testNegativeId() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Person person = new Person("-1", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		});
	}
	
	@Test
	void testSetGetFirstName() {
		Person person = new Person("2", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		
		person.setFirstName("Test");
				
		assertEquals("Test", person.getFirstName(), "Testing firstName.");
	}
	
	@Test
	void testNullFirstName() {		
		assertThrows(NullPointerException.class, () -> {
			Person person = new Person("1", null, "Doe", "jdoe@sample.com", "141.181.28.200");
		});
	}
	
	@Test
	void testEmptyFirstName() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Person person = new Person("", "", "Doe", "jdoe@sample.com", "141.181.28.200");
		});
	}
	
	@Test
	void testSetGetLastName() {
		Person person = new Person("2", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		
		person.setLastName("Test");
				
		assertEquals("Test", person.getLastName(), "Testing lastName.");
	}
	
	@Test
	void testNullLastName() {		
		assertThrows(NullPointerException.class, () -> {
			Person person = new Person("1", "John", null, "jdoe@sample.com", "141.181.28.200");
		});
	}
	
	@Test
	void testEmptyLastName() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Person person = new Person("", "John", "", "jdoe@sample.com", "141.181.28.200");
		});
	}
	
	@Test
	void testSetGetEmail() {
		Person person = new Person("2", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		
		person.setEmail("Test@sample.com");
				
		assertEquals("Test@sample.com", person.getEmail(), "Testing email.");
	}
	
	@Test
	void testNullEmail() {		
		assertThrows(NullPointerException.class, () -> {
			Person person = new Person("1", "John", "Doe", null, "141.181.28.200");
		});
	}
	
	@Test
	void testEmptyEmail() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Person person = new Person("", "John", "Doe", "", "141.181.28.200");
		});
	}
	
	@Test
	void testSetGetIp() {
		Person person = new Person("2", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		
		person.setIpAddress("141.181.28.400");
				
		assertEquals("141.181.28.400", person.getIpAddress(), "Testing ipAddress.");
	}
	
	@Test
	void testNullUp() {		
		assertThrows(NullPointerException.class, () -> {
			Person person = new Person("1", "John", "Doe", "jdoe@sample.com", null);
		});
	}
	
	@Test
	void testEmptyIp() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Person person = new Person("", "John", "", "jdoe@sample.com", "");
		});
	}

	@Test
	void testToString() {		
		Person person = new Person("2", "John", "Doe", "jdoe@sample.com", "141.181.28.200");
		
		assertEquals("Person [id=2, firstName=John, lastName=Doe, email=jdoe@sample.com, ipAddress=141.181.28.200]", person.toString(), "Testing toString.");
	}
}
