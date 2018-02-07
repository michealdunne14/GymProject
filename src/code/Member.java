package code;

import java.sql.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * The Member class is a is where you determine the bmi and store your assessments
 * and gets the weight and height 
 * 
 *  @author Micheal Dunne.
 *  @version 02/05/2017
 */
public class Member<Assessment> extends Person {
	private int weight;
	private double height;

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	protected HashMap<Date, Assessment> Assessment;

	public Member(String author, String address, String email, String gender, double height, double weight) {
		super(author, address, email, gender);
	}

	/*
	 * Determines what bmi you are
	 */
	public <less> void detBMI(int bmiValue) {
		System.out.println("BMI VALUES");
		if (bmiValue > 15) {
			System.out.println("Underweight: Under 15 is VERY SEVERELY UNDERWEIGHT");
		} else if ((bmiValue > 15) && (bmiValue < 16)) {
			System.out.println("Normal: 15-16: SEVERELY UNDERWEIGHT");
		} else if ((bmiValue > 16) && (bmiValue < 18.5)) {
			System.out.println("Overweight: 16-18.5: UNDERWEIGHT");
		} else if ((bmiValue > 18.5) && (bmiValue < 25)) {
			System.out.println("Overweight: 18.5-25: NORMAL");
		} else if ((bmiValue > 25) && (bmiValue < 30)) {
			System.out.println("Overweight: 25-30: OVERWEIGHT");
		} else if ((bmiValue > 30) && (bmiValue < 35)) {
			System.out.println("Overweight: 30-35: MODERATELY OBESE");
		} else if ((bmiValue > 35) && (bmiValue < 40)) {
			System.out.println("Overweight: 35-40: SEVERELY OBESE");
		} else if (bmiValue < 40) {
			System.out.println("Overweight: Over 40: Very SEVERELY OBESE");
		}
	}

	/*
	 * Gets assessments
	 */
	public Assessment latestAssessment() {
		// Returns the latest assessment based on last entry (by calendar date).
		return getAssessments().get(sortedAssessmentDates().last());
	}

	public HashMap<Date, Assessment> getAssessments() {
		return this.Assessment;
	}

	public SortedSet<Date> sortedAssessmentDates() {
		// Returns the assessment dates sorted in date order.
		return new TreeSet<Date>(getAssessments().keySet());
	}

	public double getWeight() {
		return weight;
	}

	/*
	 * This finds all people with the ideal weight
	 */
	public boolean isIdealBodyWeight(double weight) {
		double fiveFeet = 60.0;
		double idealBodyWeight = 0;
		double centimeters = 1;
		double inches = centimeters * 2.54;
		if (inches <= fiveFeet) {
			if (gen.equals("M")) {
				idealBodyWeight = 50;
			} else {
				if (gen.equals("M")) {
					idealBodyWeight = 50 + ((inches - fiveFeet) * 2.3);
				} else {
					idealBodyWeight = 45.5 + ((inches - fiveFeet) * 2.3);
				}
			}
		}
		return ((idealBodyWeight <= (weight + 2.0)) && (idealBodyWeight <= (weight - 2.0)));
	}
}
