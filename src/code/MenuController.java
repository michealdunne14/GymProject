package code;

import java.awt.List;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * The MenuController class is a text based sign up for Gym and the user can sign up
 * and enter there weight,height and there details. you can login/signup as a trainer 
 * or a member. 
 * 
 *  @author Micheal Dunne.
 *  @version 02/05/2017
 */
public class MenuController {
	private Scanner sc = new Scanner(System.in);
	private Scanner input = new Scanner(System.in);
	private GymApi Gym = new GymApi();
	private Person person;
	private Member member;
	private String packchoice;
	private String emailEntered;
	private String weight;
	private double studentId;

	/*
	 * Constructor for objects of class MenuController
	 */
	public static void main(String[] args) {
		MenuController app = new MenuController();
		app.load();
	}

	/*
	 * Loads the given data
	 */
	public void load() {
		try {
			Gym.load();
		} catch (Exception e) {
			System.out.println("Error");
		}
		this.begin();
	}

	/*
	 * This is the option to login or register
	 */
	public int login() {
		System.out.println("1)Login");
		System.out.println("2)Register");
		System.out.println("0) Exit");
		int option = sc.nextInt();
		return option;
	}

	/*
	 * This corresponds with the login() and takes in the input that you enter.
	 * 1) This is if you are logging in it will go to the login area 2) This is
	 * if you a registering as a new user it will go to the menu to register
	 */
	public void begin() {
		int chose = login();

		switch (chose) {
		case 1:
			this.runnext();
		case 2:
			this.runningReg();
		case 0:
			System.exit(0);
		}
	}

	/*
	 * This is the next step when you need to enter if you are a member or are
	 * you a trainer.
	 */
	private int next() {
		System.out.println("1) Member");
		System.out.println("2) Trainer");
		int option = sc.nextInt();
		return option;
	}

	/*
	 * This corresponds with the next() and takes in the input that you enter.
	 * 1) This is the login for a member. 2) This is the login for a trainer.
	 * 
	 */
	public void runnext() {
		{
			System.out.println("Login");
			int chose = next();
			while (chose != 0) {

				switch (chose) {
				case 1:
					loginMember();
					break;
				case 2:
					loginTrainer();
					break;
				}
			}
		}
	}

	/*
	 * This is the login for members it asks you to enter your email and if it
	 * is in the database that it will grant access otherwise it will kick you
	 * out
	 * 
	 */
	public void loginMember() {
		boolean enter = false;
		while (!enter) {
			names();
			String name = "";
			System.out.println("Please enter your email");
			name = names();
			Member member = (Member) Gym.searchMembersByEmail(name);
			String in = input.next();
			while (member == null) {
				System.out.println("Access Denied");
				System.exit(0);
			}
			this.runMember(member);
		}
	}

	/*
	 * This is the login for trainers it asks you to enter your email and if it
	 * is in the database that it will grant access otherwise it will kick you
	 * out.
	 * 
	 */
	public void loginTrainer() {
		boolean enter = false;
		while (!enter) {
			names();
			String name = "";
			System.out.println("Please enter your email");
			name = names();
			Trainer trainer = (Trainer) Gym.searchTrainersByEmail(name);
			String in = input.next();
			while (member == null) {
				System.out.println("Access Denied");
				System.exit(0);
			}
			this.runTrainer(trainer);
		}
	}

	/*
	 * This is the registration for a Member/Trainer 1) This gives you
	 * registration for a member 2) this gives you registration for a trainer.
	 * 
	 */
	public int register() {
		{
			System.out.println("1) Register as a Member");
			System.out.println("2) Register as a Trainer");
			System.out.println("0) Exit");
			System.out.print("==>>");
			int option = sc.nextInt();
			return option;
		}
	}

	/*
	 * This is the running of registration. 1) This gives you registration for a
	 * member 2) this gives you registration for a trainer. anything else will
	 * give you an error
	 */
	public void runningReg() {
		int chose = this.register();

		switch (chose) {
		case 1:
			registerMember();
			break;
		case 2:
			registerTrainer();
			break;
		default:
			this.error();
		}
	}

	/*
	 * The registration of the member asks you for your
	 * name/address/gender/height and your starting weight and if you are a
	 * student or not.
	 */
	public void registerMember() {
		System.out.println("Please enter your email");
		names();
		String email = "";
		boolean rightemail = false;
		while (!rightemail) {
			email = names();
			if (Gym.searchMembersByEmail(email) == null) {
				rightemail = true;
			}
		}
		System.out.println("Please enter your Name");
		String name = names();
		System.out.println("Please enter your Address");
		String address = names();
		System.out.println("Please enter your Gender");
		int genderChose;
		System.out.println("1) Male");
		System.out.println("2) Female");
		System.out.println("3) Unspecified");
		genderChose = 0;
		String gender = "Unspecified";
		while (genderChose < 1 || genderChose > 3) {
			genderChose = numbers();
			if (genderChose > 1 || genderChose < 3) {
				if (genderChose == 1) {
					gender = "Male";
				}
				if (genderChose == 2) {
					gender = "Female";
				}
				if (genderChose == 3) {
					gender = "Unspecified";
				}
			}
		}

		System.out.println("Please enter your height");
		double height = newOption();

		System.out.println("Please enter your Starting Weight");
		double weight = newOption();

		int stOption = 0;
		System.out.println("1)Are you a Student ");
		System.out.println("2)Or not a Student ");
		while (stOption < 1 || stOption > 2)
			stOption = numbers();
		if (stOption > 1 || stOption < 2) {
			if (stOption == 1) {
				names();
				System.out.println("Please enter Student ID");
				String studentId = names();
				System.out.println("College Name");
				String college = names();
				Gym.addMember(new StudentMember(email, name, address, gender, height, weight, studentId, college));
			} else if (stOption == 2) {
				int chosenPackage = dealOption();
				Gym.addMember(new PremiumMember(name, email, address, gender, height, weight, chosenPackage));
			}
		}
		try {
			Gym.store();
		} catch (Exception e) {
			e.printStackTrace();
		}
		names();
		return;
	}

	/*
	 * The registration of the Trainer asks you for your name/address/gender and
	 * your ability and offers you a deal of premium or normal
	 */
	public void registerTrainer() {
		System.out.println("Please enter your email");
		names();
		String email = "";
		boolean rightemail = false;
		while (!rightemail) {
			email = names();
			if (Gym.searchMembersByEmail(email) == null) {
				rightemail = true;
			}
		}
		System.out.println("Please enter your Name");
		String name = names();
		System.out.println("Please enter your Address");
		String address = names();
		System.out.println("Please enter your Gender");
		int genderChose;
		System.out.println("1) Male");
		System.out.println("2) Female");
		System.out.println("3) Unspecified");
		genderChose = 0;
		String gender = "Unspecified";
		if (genderChose == 1) {
			gender = "M";
		}
		if (genderChose == 2) {
			gender = "F";
		}
		if (genderChose == 3) {
			gender = "Unspecified";
		}
		names();
		System.out.println("Please enter your Ability");
		String ability = names();
		Gym.addTrainer(new Trainer(email, name, address, gender, ability));
		try {
			Gym.store();
		} catch (Exception e) {
			System.out.println("Error");
		}
		names();
	}

	/*
	 * Chose of different deals
	 */
	public int dealOption() {
		System.out.println("1) Premium");
		System.out.println("2) Normal");
		System.out.println("3) Default");
		int chose = sc.nextInt();
		return chose;
	}

	public String runDeal() {
		int chose = dealOption();
		switch (chose) {
		case 1:
			return "Premuim Package";
		case 2:
			return "Normal Package";
		case 3:
			return "Default";
		default:
			this.error();
			return "";
		}
	}

	/*
	 * This is the menu for the member where you can view/update and also view
	 * your progress.
	 */
	public int menuMember() {
		System.out.println("1)View Profile");
		System.out.println("2)Update their profile");
		System.out.println("3)View their progress");
		int member = sc.nextInt();
		return member;
	}

	/*
	 * This is the running of the menu for the member
	 * 
	 */
	public void runMember(Member member) {
		System.out.println("Member menu");
		int membe = menuMember();
		while (membe != 0)
			switch (membe) {
			case 1:
				System.out.println(member.toString());
				names();
				runMember(member);
				break;
			case 2:
				update(member);
				names();
				runMember(member);
				break;
			case 3:
				member.latestAssessment();
				runMember(member);
				break;
			}
		membe = menuMember();
	}

	/*
	 * This is the menu for the trainer and provides you with ability to use
	 * change and adjust the areas.
	 */
	public int trainer() {
		System.out.println("1) Add a new member");
		System.out.println("2)List all Memebers");
		System.out.println("3)List members with ideal body weight");
		System.out.println("4)List members with a specific BMI category");
		System.out.println("5)Search for a member by email");
		System.out.println("6)Add an assessment for a member");
		System.out.println("7)View assessments for a member (sorted by date)");
		int trainer = sc.nextInt();
		return trainer;
	}

	/*
	 * This is the running of the trainer.
	 */
	public void runTrainer(Trainer trainer) {
		System.out.println("Trainer menu");
		int option = trainer();
		while (option != 0) {
			switch (option) {
			case 1:
				registerMember();
				runTrainer(trainer);
				break;
			case 2:
				System.out.println(Gym.listMembers());
				runTrainer(trainer);
				break;
			case 3:
				System.out.println(Gym.listMembersWithIdealWeight());
				runTrainer(trainer);
				break;
			case 4:
				Gym.listMembersBySpecificBMICategory(member);
				runTrainer(trainer);
				break;
			case 5:
				Gym.searchMembersByEmail(emailEntered);
				runTrainer(trainer);
				break;
			case 6:
				weight(trainer);
				runTrainer(trainer);
				break;
			case 7:
				System.out.println(member.getAssessments());
				runTrainer(trainer);
				break;
			case 8:
				System.exit(0);
				break;
			}
			option = trainer();
		}
	}

	/*
	 * This gets everyone with ideal weight.
	 */
	public String idealWeight() {
		System.out.println("Please enter your Email");
		String email = names();
		System.out.println("Please enter your Weight");
		int weight = numbers();
		System.out.println("Please enter your Height");
		int height = numbers();
		Member member = Gym.searchMembersByEmail(email);
		while (member.isIdealBodyWeight(weight)) {
			return "ideal body weight";
		}
		return "Not ideal body weight";
	}

	/*
	 * This gets your weight for your chest/upper arm/thigh/hip/waste and a
	 * comment at the end
	 */
	private void weight(Trainer trainer) {
		System.out.println("Your total Weight is: ");
		System.out.println("Please enter chest measurement");
		int chest = input.nextInt();
		System.out.println("Please enter upperArm measurement");
		int upperArm = input.nextInt();
		System.out.println("Please enter thigh measurement");
		int thigh = input.nextInt();
		System.out.println("Please enter hip measurement");
		int hip = input.nextInt();
		System.out.println("Please enter waste measurement");
		int waste = input.nextInt();
		System.out.println("Please enter a Comment");
		String comment = input.nextLine();
		new Assessment(chest, upperArm, thigh, hip, waste, waste, comment, trainer);
	}

	/*
	 * this cal your bmi.
	 */
	private int calBMI() {
		Scanner input = new Scanner(System.in);

		int weight;
		int height;
		int bMI;

		System.out.print("Enter Your Weight in Pounds: ");
		weight = input.nextInt();
		System.out.print("Enter Your Height in Inches: ");
		height = input.nextInt();
		bMI = (weight * 703) / (height * height);
		System.out.printf("Your Body Mass Index (BMI) is %d\n\n", bMI);
		return bMI;
	}

	/*
	 * This is if you want to chane your details
	 */
	public void update(Member member) {
		names();
		System.out.println("Set your new Name");
		member.setName(names());
		System.out.println("Set your new Email");
		member.setInternet(names());
		System.out.println("Set your new Address");
		member.setLocation(names());
		int genderChose;
		System.out.println("1)Male");
		System.out.println("2)Female");
		System.out.println("3)Other");
		String gender = "Unspecified";
		genderChose = 0;
		while (genderChose < 1 || genderChose > 3) {
			genderChose = numbers();
			if (genderChose > 1 || genderChose < 3) {
				if (genderChose == 1) {
					gender = "M";
				} else if (genderChose == 2) {
					gender = "F";
				} else if (genderChose == 3) {
					gender = "U";
				}
				member.setGen(gender);
			}
		}
		System.out.println("Enter your new Height");
		member.setHeight(newOption());
		try {
			Gym.store();
		} catch (Exception e) {
			System.out.println("Error");
		}
		runnext();
	}

	/*
	 * This is what input takes in and prints out what you put in
	 */
	private String names() {
		System.out.println("=> ");
		String text = input.nextLine();
		return text;
	}

	private double newOption() {
		System.out.println("=> ");
		double chose = input.nextDouble();
		return chose;
	}

	private int numbers() {
		System.out.println("=>");
		int chose = input.nextInt();
		return chose;
	}

	/*
	 * This is if there is a problem with loading or printing it will give an
	 * error.
	 */
	private void error() {
		System.out.println("Invalid Option");
	}
}