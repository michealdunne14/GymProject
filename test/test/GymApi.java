package test;

/*
 * The GymApi test class does a test on the GymApi class.
 * 
 *  @author Micheal Dunne.
 *  @version 02/05/2017
 */

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.Member;
import code.Trainer;

public class GymApi {
	private GymApi member, trainer;
	ArrayList<Member> members;

	/*
	 * Sets up the GymApi
	 */
	@Before
	public void setUp() {
		member = new GymApi();
	}

	/*
	 * Tears down the GymApi
	 */
	@After
	public void tearDown() {

	}

	/*
	 * Add a member for a test
	 */
	@Test
	public void addMember(Trainer trainer) {
		assertEquals("rocky", trainer.getName(), "rocky");
	}

	/*
	 * Add a trainer for a test
	 */
	@Test
	public void addTrainer(Trainer trainer) {
		assertEquals("rocky", trainer.getName(), "rocky");
	}

	/*
	 * Finds the number of members
	 */
	@Test
	public int numberOfMembers(int[] list) {
		{
			int number1, max = 0;
			for (number1 = 0; number1 < list.length - 1; number1++) {
				if (list[number1] > max) {
					max = list[number1];
				}
			}
			return max;
		}
	}

	/*
	 * Finds the number of Trainers
	 */
	@Test
	public int numberOfTrainers(int[] list) {
		{
			int number1, max = 0;
			for (number1 = 0; number1 < list.length - 1; number1++) {
				if (list[number1] > max) {
					max = list[number1];
				}
			}
			return max;
		}
	}

	/*
	 * Finds if there is a valid member index
	 */
	@Test
	public boolean isValidMemeberIndex(int[] index) {
		if (index.length - 1 >= 1) {
			return true;
		}
		return false;
	}

	/*
	 * Finds if there is a valid trainer index
	 */
	@Test
	public boolean isValidTrainerIndex(int[] index) {
		if (index.length - 1 >= 1) {
			return true;
		}
		return false;
	}

	/*
	 * Finds Members by email
	 */
	@Test
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
}
