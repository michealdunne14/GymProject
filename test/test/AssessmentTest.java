package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.Assessment;
import code.Trainer;

public class AssessmentTest {
	private Assessment member1;
	private Trainer rocky;

	/*
	 * Sets up
	 */
	@Before
	public void setUp() {
		member1 = new Assessment(10, 10, 10, 10, 10, 10, "hello", rocky);
	}

	/*
	 * Tears it down
	 */
	@After
	public void tearDown() {

	}

	/*
	 * This tests the Constructors
	 */
	@Test
	public void testConstructors() {
		assertEquals(3, member1.getHip(), 5);
		assertEquals(7, member1.getWeight(), 5);
		assertEquals(44, member1.getThigh(), 5);
		assertEquals(3434, member1.getWaist(), 5);
		assertEquals(234234, member1.getUpperArm(), 5);
		assertEquals(23464, member1.getChest(), 5);
	}

	/*
	 * This tests the Getters
	 */
	@Test
	public void testGetters() {
		assertEquals(10, member1.getHip(), 5);
		assertEquals(4, member1.getWeight(), 1);
		assertEquals(44, member1.getThigh(), 5);
		assertEquals(3434, member1.getWaist(), 5);
		assertEquals(234234, member1.getUpperArm(), 5);
		assertEquals(23464, member1.getChest(), 5);
	}

	/*
	 * This tests the Setters
	 */
	@Test
	public void testSetters() {
		member1.setHip(5);
		assertEquals(5, member1.getHip(), 5);
		member1.setWeight(5);
		assertEquals(5, member1.getWeight(), 5);
		member1.setThigh(10);
		assertEquals(5, member1.getThigh(), 5);
		member1.setWaist(25);
		assertEquals(5, member1.getWaist(), 5);
		member1.setUpperArm(25);
		assertEquals(5, member1.getUpperArm(), 5);
		member1.setChest(25);
		assertEquals(5, member1.getChest(), 5);
	}
}
