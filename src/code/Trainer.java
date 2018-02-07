package code;

/*
 * The Trainer class is a is where you determine the trainers ability.
 * 
 *  @author Micheal Dunne.
 *  @version 02/05/2017
 */
public class Trainer extends Person {

	private String ability;

	/**
	 * @return the ability
	 */
	public String getAbility() {
		return ability;
	}

	/**
	 * @param ability
	 *            the ability to set
	 */
	public void setAbility(String ability) {
		this.ability = ability;
	}

	public Trainer(String author, String address, String email, String gender, String ability) {
		super(author, address, email, gender);
	}

	public String toString() {
		String output = "Trainer Information /n" + "Name" + getName() + "/n" + "Email" + getInternet() + "/n"
				+ "Address" + getLocation() + "/n" + "Gender" + getGen() + "/n" + "Speciality" + getAbility();
		return output;
	}
}
