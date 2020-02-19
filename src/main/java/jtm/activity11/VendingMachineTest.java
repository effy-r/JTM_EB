package jtm.activity11;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class VendingMachineTest {

	VendingMachine vending;

	@Before
	public void setUp() {
		
		vending = new VendingMachine();
		assertEquals("0.00$", vending.balance());
		// TODO initialize SimpleCalc object
	}

	//@Test
//	public void testAddProducts() {
//		
//		vending.addProducts("product", 10.00);
//		String expected = "10.00";
//		String actual = vending.balance();
//		assertEquals(expected,actual);
//		
////	    int expected = 5;
////	    int actual = sc.add(2, 3);
////	    assertEquals("2 + 3 should be 5", expected, actual);
//		// TODO test addition for case where both numbers and result is in allowed range
//	}
	
	@Test
	public void testBalance() {
		vending.depositCoins(53);
		String expected = "53.00$";
		String actual = vending.balance();
		assertEquals("The numbers should be displayed with two digits", expected, actual);
		
	}
	@Test
	public void testDepositCoins() {
		
		vending.depositCoins(12.2);
		String expected = "12.20$";
		String actual = vending.balance();
		assertEquals(expected, actual);
		
	}
	@Test
	public void testDepositCoins2() {
		
		vending.depositCoins(12.2);
		vending.depositCoins(12.2);
		String expected = "24.40$";
		String actual = vending.balance();
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void testChooseExistingProduct() {
		
		vending.addProducts("Snickers", 2.00);
		vending.depositCoins(3.00);
		
		

		assertEquals("snickers", vending.chooseProduct("snickers") );
	}
	@Test
	public void testChooseExistingProduct2() {
		
		vending.addProducts("Snickers", 2.00);
		vending.depositCoins(2.00);
		
		

		assertEquals("snickers", vending.chooseProduct("snickers") );
	}
	@Test
	public void testChooseNonExistingProduct() {
		
		vending.addProducts("twix", 2.00);
		vending.depositCoins(3.00);
		
		

		assertEquals("Such product doesn't exist", vending.chooseProduct("Snickers") );
	}
	@Test
	public void testChooseExistingProductNotEnoughFunds() {
		
		vending.addProducts("Snickers", 2.00);
		vending.depositCoins(1.00);
		
		

		assertEquals("Balance not enough", vending.chooseProduct("snickers") );
	}
	
	@Test
	public void testEjectCoins() {
		vending.ejectCoinsBack();
		String expected = "0.00$";
		String actual = vending.balance();
		assertEquals(expected,actual);
	}
	
	

}
