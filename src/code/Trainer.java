package code;

public class Trainer extends Person{

	private String ability;
	public Trainer(String author, String address, String email, String gender,String ability) {
		super(author, address, email, gender);
	}
	private void setAbility(String ability) {
		this.ability = ability;	
}
	public String getAbility(){
		return ability; 
	}
	public String toString(){
		String output = "Trainer Information /n"
						+ "Name" + getName() + "/n"
						+ "Email" + getEmail() + "/n"
						+ "Address" + getAddress() + "/n"
						+ "Gender" + getGender() + "/n" 
						+ "Speciality" + getAbility();
		return output;			
	}
}
