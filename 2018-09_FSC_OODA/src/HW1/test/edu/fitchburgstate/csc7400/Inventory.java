package HW1.test.edu.fitchburgstate.csc7400;

/**
 * JUnit Test cases for Inventory class  
 * @author saran
 * @version 1.0
 */

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.Inventory;

public class InventTest {
	
	Inventory inventory;
	
	private LinkedList<Guitar> guitars = new LinkedList<Guitar>();

	@Before
	public void setUp() throws Exception {
		this.inventory = new Inventory();
		inventory.addGuitar(
				"1092", 
				12995.95, 
				"Olson", 
				"SJ", 
				"acoustic",
                "Indian Rosewood", 
                "Cedar"
				);
		{
			
			Guitar guitar=new Guitar("1092", 
					12995.95, 
					"Olson", 
					"SJ", 
					"acoustic",
	                "Indian Rosewood", 
	                "Cedar");
			guitars.add(guitar);
			
		}
	
	}

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
	