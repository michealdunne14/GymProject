package code;

import java.util.Scanner;

public class PremiumMember extends Member {
	private String packchoice;

	public PremiumMember(String author, String address, String email, String gender, int calculateBMI,
			String determineBMICategory,String chosenPackage) 
	{
		super(author, address, email, gender, calculateBMI, determineBMICategory, calculateBMI, calculateBMI);
		packchoice = chosenPackage;
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		String output = "Your chosen package is " + packchoice;
		return output;
		
	}
}
