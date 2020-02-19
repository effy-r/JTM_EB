package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {

		sc = new SimpleCalc();
		// TODO initialize SimpleCalc object
	}

	@Test
	public void testAddInRange() {

		Integer expected = 5;
		Integer actual = sc.add(2, 3);
		assertEquals(expected, actual);
		// TODO test addition for case where both numbers and result is in allowed range
	}

	@Test
	public void testAddOutOfRange() {

		String expected = null;
		Integer actual = sc.add(-11, 12);
		assertEquals(expected, actual);

		// TODO test addition for cases where both numbers and result is out of allowed
		// range
	}

	@Test
	public void testSubtractInRange() {
		// TODO
		int expected = 3;

		int actual = sc.subtract(5, 2);

		assertEquals(expected, actual);

	}

	@Test
	public void testSubtractOutOfRange() {
		// TODO

		String expected = null;
		Integer actual = sc.subtract(-11, 12);
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiplyInRange() {
		// TODO
		int expected = 1;

		int actual = sc.multiply(1, 1);

		assertEquals(expected, actual);

	}

	@Test
	public void testMultiplyOutOfRange() {
		// TODO

		String expected = null;
		Integer actual = sc.multiply(-11, 12);
		assertEquals(expected, actual);

	}

	@Test
	public void testDivideInRange() {
		// TODO
		int expected = 1;

		int actual = sc.divide(1, 1);

		assertEquals(expected, actual);
	}

	@Test
	public void testDivideOutOfRange() {
		// TODO
		String expected = null;
		Integer actual = sc.divide(-11, 12);
		assertEquals(expected, actual);
	}

}
