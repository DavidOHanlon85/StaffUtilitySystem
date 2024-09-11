/**
 * 
 */
package math.examples;

import java.util.Objects;

/**
 * 
 */
public class Employee {
	
	private static final int MAX_LENGTH = 20;
	private static final int MIN_LENGTH = 3;
	private static final int MAX_AGE = 30;
	private static final int MIN_AGE = 18;

	// Instance variables

	private String name;
	private String lastName;
	private int age;

	// Constructors

	/**
	 * Constructor with args for Employee
	 * @param name
	 * @param lastName
	 * @param age
	 */
	public Employee(String name, String lastName, int age) {
		this.setName(name);
		this.setLastName(lastName);
		this.setAge(age);
	}
	

	// Getters and setters

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name
	 * @param name
	 * @throws IllegalArgumentException - if invalid name (too short, too long etc.)
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name == null) {
			throw new IllegalArgumentException("Can't set name to null");
		} else if (name.length()>= MIN_LENGTH && name.length() <= MAX_LENGTH) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Invalid name length");
		}
			
			
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) throws IllegalArgumentException {
		if (validAge(age)) {
		this.age = age;
		} else {
			throw new IllegalArgumentException("Invalid Age");
		}
	}
	
	/**
	 * return true if age matches business rules
	 * @param age
	 * @return
	 */
	private boolean validAge(int age) {
		if (age < MIN_AGE || age > MAX_AGE) {
			return false;
		}
		
		return true;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, lastName, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}
	
	

}
