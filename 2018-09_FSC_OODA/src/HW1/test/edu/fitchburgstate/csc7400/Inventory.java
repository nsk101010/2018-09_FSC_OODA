package HW1.test.edu.fitchburgstate.csc7400;

/**
 * JUnit Test cases for Inventory class  
 * Professor Name : Orlando Montalvo
 * Date : 09-18-2018
 * Assignment : HW1
 * Participants : snemani(01400045)
 * @version 2.0
 */

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.Inventory;

public class InventoryTest {
	
	Inventory inventoryClass;
	Guitar guitarClass;
	GuitarSpec guitarSpec;

/**
 * Test data and add guitar data to inventory
 */	
	@Before
	public void setUp() throws Exception {
		inventoryClass = new Inventory();
	}

/**
 * This function is to test getGuitar() method that takes serial number.
 */	

	@Test
	public void testSerialNumber() {
		String expected = "1092";
		String returned = "";
		@SuppressWarnings("rawtypes")
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			returned=guitar.getSerialNumber().toString();
		}
		assertEquals(expected, returned, String.format("Model %s != %s", expected, returned));
	}

	@Test
	public void testgetManufacturer() {
		String expected = "Olson";
		String returned = "";
		@SuppressWarnings("rawtypes")
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			returned=guitar.getManufacturer().toString();
		}
		assertEquals(expected, returned, String.format("Model %s != %s", expected, returned));
	}
	
	@Test
	public void testgetType() {
		String expected = "acoustic";
		String returned = "";
		@SuppressWarnings("rawtypes")
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			returned=guitar.getType().toString();
		}
		assertEquals(expected, returned, String.format("Model %s != %s", expected, returned));
	}
}
	
