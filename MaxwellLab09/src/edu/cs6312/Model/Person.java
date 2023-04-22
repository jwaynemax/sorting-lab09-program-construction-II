/**
 * 
 */
package edu.cs6312.Model;

/**
 * Define Person object
 * @author justinmaxwell
 * @version 3/3/2023
 *
 */
public class Person {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String ipAddress;
	
	
	/**
	 * Constructor
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param ipAddress
	 */
	public Person(String id, String firstName, String lastName, String email, String ipAddress) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setIpAddress(ipAddress);
	}

	/**
	 * Get Id
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * Set id
	 * @precondition cannot be null, empty, or negative
	 * @postcondition none
	 * @param id the id to set
	 */
	public void setId(String id) {
		
		if (id.isEmpty() || id.equals(null) || Integer.valueOf(id) < 0) {
			throw new IllegalArgumentException("Cannot be null, empty, or negative");
		}
		
		this.id = id;

	}
	
	/**
	 * Get firstName
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Set firstName
	 * @precondition cannot be null or empty
	 * @postcondition none
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		
		if (firstName.isEmpty() || firstName.equals(null)) {
			throw new IllegalArgumentException("Cannot be null or empty");
		}
		
		this.firstName = firstName;
	}
	
	/**
	 * Get lastName
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * set lastName
	 * @precondition cannot be null or empty
	 * @postcondition none
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		
		if (lastName.isEmpty() || lastName.equals(null)) {
			throw new IllegalArgumentException("Cannot be null or empty");
		}
		
		this.lastName = lastName;
	}
	
	/**
	 * Get email
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Set email
	 * @precondition cannot be null or empty
	 * @postcondition none
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		
		if (email.isEmpty() || email.equals(null)) {
			throw new IllegalArgumentException("Cannot be null or empty");
		}
		
		this.email = email;
	}
	
	/**
	 * Get ipAddress
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return this.ipAddress;
	}
	
	/**
	 * Set ipAddress
	 * @precondition cannot be null or empty
	 * @postcondition none
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		
		if (ipAddress.isEmpty() || ipAddress.equals(null)) {
			throw new IllegalArgumentException("Cannot be null or empty");
		}
		
		this.ipAddress = ipAddress;
	}

	@Override
	public String toString() {
		return "Person [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email
				+ ", ipAddress=" + this.ipAddress + "]";
	}
	
}
