package code;

/*
 * The GymApi class is a is where you link the all the the stuff
 * at the back to the stuff mainly the MenuController
 * 
 *  @author Micheal Dunne.
 *  @version 02/05/2017
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GymApi {
	private StudentMember member;
	private Person person;
	private Member allmember;
	private int weight;
	private Assessment asset;

	ArrayList<Member> members;
	ArrayList<Trainer> trainers;

	/*
	 * Arraylist of members and trainers.
	 */
	public GymApi() {
		members = new ArrayList<Member>();
		trainers = new ArrayList<Trainer>();
	}

	/*
	 * Adds a member
	 */
	public void addMember(Member member) {
		members.add(member);
	}

	/*
	 * Adds a trainer
	 */
	public void addTrainer(Trainer trainer) {
		trainers.add(trainer);
	}

	/*
	 * Counts the number of members
	 */
	public int numberOfMembers() {
		return members.size();
	}

	/*
	 * Counts the number of trainers
	 */
	public int numberOfTrainers() {
		return trainers.size();

	}

	/*
	 * gets all the members
	 */
	public ArrayList<Member> getMembers() {
		return members;
	}

	/*
	 * Gets all the trainers
	 */
	public ArrayList<Trainer> getTrainers() {
		return trainers;
	}

	/*
	 * This finds if there is people signed up.
	 */
	public boolean isValidMemberIndex(int index) {

		if (members.size() >= 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValidTrainerIndex(int index) {
		if (trainers.size() <= 1) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * This finds members/trainers by email.
	 */
	public Member searchMembersByEmail(String emailEntered) {
		if (members.size() < 0) {
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getInternet() == emailEntered) {
					return members.get(i);
				}
			}
		}
		return null;

	}

	public Trainer searchTrainersByEmail(String emailEntered) {
		if (trainers.size() < 0) {
			for (int i = 0; i < trainers.size(); i++) {
				if (trainers.get(i).getInternet() == emailEntered) {
					return trainers.get(i);
				}
			}
		}
		return null;

	}

	/*
	 * This lists all members
	 */
	public String listMembers() {
		{
			if (members.size() <= 0) {
				return "No members.";
			} else {
				String listmembers = "";
				for (int i = 0; i < members.size(); i++) {
					listmembers = listmembers + (i + ":" + members.get(i)) + "\n";
				}
				return listmembers;
			}
		}
	}

	/*
	 * This finds people with ideal body weight.
	 */
	public Member listMembersWithIdealWeight() {
		if (members.size() >= 0) {
			System.out.println("No Members in Gym");
		}
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getWeight() >= 15 && members.get(i).getWeight() < 16)
				System.out.println(members.get(i).getName() + members.get(i).getWeight());
			return members.get(i);
		}
		return null;
	}

	/*
	 * This finds memebers with a specfic bmi category.
	 */
	public Member listMembersBySpecificBMICategory(Member category) {
		if (members.size() <= 0) {
			System.out.println("No Members in Gym");
		}
		/*
		 * for (int i = 0; i < members.size(); i++) { if
		 * (members.get(i).detBMI(bmiValue));
		 * System.out.println(members.get(i).getName()); return members.get(i);
		 * }
		 */
		return category;
	}

	/*
	 * Lists all people and there weight and height
	 */
	public void listMemberDetailsImperialAndMetric() {
		System.out.println(
				allmember.getName() + ":" + "    " + allmember.getWeight() + "kg" + "     " + asset.getHeight());
	}

	/*
	 * Loads data
	 */
	@SuppressWarnings("unchecked")
	public void load() throws Exception {
		{
			XStream xstream = new XStream(new DomDriver());
			ObjectInputStream is = xstream.createObjectInputStream(new FileReader("products.xml"));
			members = (ArrayList<Member>) is.readObject();
			is.close();
		}
	}

	/*
	 * Saves data
	 */
	public void store() throws Exception {
		{
			XStream xstream = new XStream(new DomDriver());
			ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("products.xml"));
			out.writeObject(members);
			out.close();
		}
	}
}
