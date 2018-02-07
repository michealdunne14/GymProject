package code;

/*
/ * The PremiumMember class is a is where you determine the chosen package. 
 * 
 *  @author Micheal Dunne.
 *  @version 02/05/2017
 */

public class PremiumMember extends Member {

	public PremiumMember(String author, String address, String email, String gender, double weight, double height,
			int chosenPackage) {
		super(author, address, email, gender, weight, height);
	}

	int chosenPackage;

	public String toString() {
		String output = "Your chosen package is " + chosenPackage;
		return output;

	}
}
