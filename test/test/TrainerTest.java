package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.Trainer;

public class TrainerTest {

	private Trainer trainer1;

	/*
	 * Bulids it up
	 */
	@Before
	public void setUp() {
		trainer1 = new Trainer("micheal", "owning", "owning", "M", "speed");
	}

	/*
	 * Tears it down
	 */
	@After
	public void tearDown() {

	}

	@Test
	public void testConstructors() {
		assertEquals("micheal", trainer1.getName(), "da");
		assertEquals("micheal", trainer1.getInternet(), "da");
		assertEquals("micheal", trainer1.getLocation(), "da");
		assertEquals("micheal", trainer1.getGen(), "da");
		assertEquals("micheal", trainer1.getAbility(), "da");

	}

	/*
	 * This tests the Getters
	 */
	@Test
	public void testGetters() {
		assertEquals("micheal", trainer1.getName(), "da");
		assertEquals("micheal", trainer1.getInternet(), "da");
		assertEquals("micheal", trainer1.getLocation(), "da");
		assertEquals("micheal", trainer1.getGen(), "da");
		assertEquals("micheal", trainer1.getAbility(), "da");

	}

	/*
	 * This tests the Setters
	 */
	@Test
	public void testSetters() {
		trainer1.setName("hello");
		assertEquals("here", trainer1.getName(), "hello");
		trainer1.setInternet("hello");
		assertEquals("hello", trainer1.getInternet(), "hello");
		trainer1.setLocation("hello");
		assertEquals("hello", trainer1.getLocation(), "hello");
		trainer1.setGen("Male");
		assertEquals("hello", trainer1.getGen(), "hello");
		trainer1.setAbility("Speed");
		assertEquals("speed", trainer1.getAbility(), "speed");
	}
}
