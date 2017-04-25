package code;
import java.sql.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Member<Assessment> extends Person{
		private double calBMI;
		private String detBMI;
		protected HashMap<Date, Assessment> Assessment;
		
		public Member(String author, String address, String email, String gender, double calculateBMI,String determineBMICategory,int weight,double height) {
		super(author, address, email, gender);
		calBMI = calculateBMI;
		detBMI = determineBMICategory;
		// TODO Auto-generated constructor stub
	}
		void calBMI(){
			Scanner input = new Scanner (System.in);
	         
	        double weight;
	        double height;
	        double bMI;
	        
	        
	        System.out.print ("Enter Your Weight in Pounds: ");
	        weight = input.nextInt();
	        System.out.print ("Enter Your Height in Inches: ");
	        height = input.nextInt();
	        bMI = (weight * 703) / (height * height);
	        System.out.printf ("Your Body Mass Index (BMI) is %d\n\n", bMI);
		}
		public <less> void detBMI(double bmiValue){
	

	        System.out.println("BMI VALUES");
	        System.out.println("Underweight: Under 15 is VERY SEVERELY UNDERWEIGHT");
	        System.out.println("Normal: 15-16: SEVERELY UNDERWEIGHT");
	        System.out.println("Overweight: 16-18.5: UNDERWEIGHT");
	        System.out.println("Overweight: 18.5-25: NORMAL");
	        System.out.println("Overweight: 25-30: OVERWEIGHT");
	        System.out.println("Overweight: 30-35: MODERATELY OBESE");
	        System.out.println("Overweight: 35-40: SEVERELY OBESE");
	        System.out.println("Overweight: Over 40: Very SEVERELY OBESE");
		}
		public Assessment latestAssessment() {
			//Returns the latest assessment based on last entry (by calendar date).
			return getAssessments().get(sortedAssessmentDates().last());
		}
		public HashMap<Date,Assessment> getAssessments() {
			return this.Assessment;
		}
		public SortedSet<Date> sortedAssessmentDates() {
			//Returns the assessment dates sorted in date order.
			 return new TreeSet<Date>(getAssessments().keySet());
			 }
	}
