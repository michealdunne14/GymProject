package code;

import java.util.HashMap;
import java.util.Date;

/*
 * The StudentMember class is a class that gets student id college and the packchoice
 * 
 *  @author Micheal Dunne.
 *  @version 02/05/2017
 */
public class StudentMember extends Member<Object> {
	private String packchoice;
	private String studentId;
	private String college;
	private int ch;
	String author;
	String address;
	String email;
	String gender;
	double calculateBMI;
	String determineBMICategory;
	String chosenPackage;
	double weight;

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	double height;

	public StudentMember(String author, String address, String email, String gender, double weight, double height,
			String studentId, String collegeName) {
		super(author, address, email, gender, height, weight);
		packchoice = chosenPackage;
	}

	/**
	 * @return the packchoice
	 */
	public String getPackchoice() {
		return packchoice;
	}

	/**
	 * @param packchoice
	 *            the packchoice to set
	 */
	public void setPackchoice(String packchoice) {
		this.packchoice = packchoice;
	}

	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the college
	 */
	public String getCollege() {
		return college;
	}

	/**
	 * @param college
	 *            the college to set
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	/**
	 * @return the ch
	 */
	public int getCh() {
		return ch;
	}

	/**
	 * @param ch
	 *            the ch to set
	 */
	public void setCh(int ch) {
		this.ch = ch;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the calculateBMI
	 */
	public double getCalculateBMI() {
		return calculateBMI;
	}

	/**
	 * @param calculateBMI
	 *            the calculateBMI to set
	 */
	public void setCalculateBMI(double calculateBMI) {
		this.calculateBMI = calculateBMI;
	}

	/**
	 * @return the determineBMICategory
	 */
	public String getDetermineBMICategory() {
		return determineBMICategory;
	}

	/**
	 * @param determineBMICategory
	 *            the determineBMICategory to set
	 */
	public void setDetermineBMICategory(String determineBMICategory) {
		this.determineBMICategory = determineBMICategory;
	}

	/**
	 * @return the chosenPackage
	 */
	public String getChosenPackage() {
		return chosenPackage;
	}

	/**
	 * @param chosenPackage
	 *            the chosenPackage to set
	 */
	public void setChosenPackage(String chosenPackage) {
		this.chosenPackage = chosenPackage;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	public void setAssessments(HashMap<Date, Assessment> assessments, HashMap<java.sql.Date, Object> Assessment) {
		// TODO Auto-generated method stub
		this.Assessment = Assessment;
	}

}
