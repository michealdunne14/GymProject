package code;

/*
/ * This is getters and setters for author address email and gender  
 * 
 *  @author Micheal Dunne.
 *  @version 02/05/2017
 */
public abstract class Person {
	String internet;
	private String location;
	public String gen;
	private String name;

	/**
	 * Constructor for objects of class Person.
	 * 
	 * @param Micheal
	 *            Dunne
	 * 
	 * @param text
	 *            This is getters and setters for author address email and
	 *            gender
	 * @param address
	 */
	public Person(String author, String address, String email, String gender) {
		name = author;
		location = address;
		internet = email;
		gen = gender;

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the internet
	 */
	public String getInternet() {
		return internet;
	}

	/**
	 * @param internet
	 *            the internet to set
	 */
	public void setInternet(String internet) {
		this.internet = internet;
	}

	/**
	 * @return the gen
	 */
	public String getGen() {
		return gen;
	}

	/**
	 * @param gen
	 *            the gen to set
	 */
	public void setGen(String gen) {
		this.gen = gen;
	}

	public String toString() {
		return "\n" + " Your locaction is: " + location + ":" + " Your email is: " + internet + ":"
				+ " Your Gender is: " + ":" + gen;
	}
}
