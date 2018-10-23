
package HW1.test.edu.fitchburgstate.csc7400;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

/* 
 * 
 * Inventory test class contain test to test the methods of inventory class 
**
* 
* @author orlando
* @version 2.0
* 01392300 Aditya
* @01392295 Nikhil
* @01390645 Raghunandan
*/

class InventoryTest {
	Inventory inventory;
	private List<Guitar> guitars = new LinkedList<Guitar>();
	
	/*we set up by adding guitar to a inventory before each test case run*/
	@BeforeEach
	
	void setUp() throws Exception 
	{
		
		this.inventory=new Inventory();
				
				
				
	Guitar guiter=new Guitar("V95693",
			1499.95,
			"Fender",
			"Stratocastor",
			"electric",
			"Alder",
			"Alder");
	guitars.add(guiter);
	
	inventory.addGuitar(guiter.getSerialNumber(), guiter.getPrice(), guiter.getManufacturer(),guiter.getModel() , guiter.getType(), guiter.getBackWood(), guiter.getTopWood());
				
	Guitar test=new Guitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic",
            "Cocobolo", "Cedar");
	inventory.addGuitar(test.getSerialNumber(),test.getPrice() , test.getManufacturer(), test.getModel(), test.getType(),test.getBackWood(), test.getTopWood());
		}
	@Test
	void testGetManufacturer() //this test fail  due to the case sensitivity problem
	{
		String expected="fender";
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getManufacturer().toString();//here we get "Fender" in result but we have not converted to lower case
		      
		}
		assertEquals(expected, result);
		
		
	}
	@Test
	void testGetManufacturercasesensitivity()
	{
		String expected="fender";
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getManufacturer().toString().toLowerCase();//here we get "fender" in result but we have  converted to lower case
			
		
			
			
		      
		}
		assertEquals(expected, result);
	}
	@Test
	void testGetModel()
	{
		String expected="stratocastor".toLowerCase();
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getModel().toString().toLowerCase();//dealing with case sensitivity for model
		      
		}
		assertEquals(expected, result);
	}
	@Test
	void testGetType()//to compare type in  the inventory to given type with case sentivity
	{
		String expected="electric".toLowerCase();
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getType().toString().toLowerCase();
		      
		}
		assertEquals(expected, result);
	}
	@Test
	void testbackWood()
	{
		String expected="Alder".toLowerCase();//converting "Alder" to lower case as we are converting comparing element to lower case
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getBackWood().toString().toLowerCase();
		      
		}
		assertEquals(expected, result);
	}
	@Test
	void testTopwood()
	{
		String expected="Alder".toLowerCase();//converting "Alder" to lower case as we are converting comparing element to lower case
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getBackWood().toString().toLowerCase();
		      
		}
		assertEquals(expected, result);
		
	}
	/*when backwood is passed*/
	@Test
	void getBackwood()
	
	{
		Guitar test=new Guitar("", 0, "", null, null, "MyBackwood","");
		Guitar res=inventory.search(test);
		assertEquals(test.getBackWood(),res.getBackWood());
		
	}
	/*when search Topwood is passed is passed*/
	@Test
	void getTopwood()
	
	{
		Guitar test=new Guitar("", 0, "", null, null, "","MyTopwood");
		Guitar res=inventory.search(test);
		assertEquals(test.getTopWood(),res.getTopWood());
		
	}
	/*when search backwood is passed*/
	@Test
	void getBackWood()
	
	{
		Guitar test=new Guitar("", 0, "", null, null, "MyBackwood","");
		Guitar res=inventory.search(test);
		assertEquals(test.getBackWood(),res.getBackWood());
		
	}
	/*when search manufacturer  is passed*/
	@Test
	void getManufacturer()
	
	{
		Guitar test=new Guitar("", 0, "Mymanufacturer", null, null, "","");
		Guitar res=inventory.search(test);
		assertEquals(test.getManufacturer(),res.getManufacturer());
		
	}
	
	/*when search type is passed*/
	@Test
	void getType()
	
	{
		Guitar test=new Guitar("", 0, "", null, "type","","");
		Guitar res=inventory.search(test);
		assertEquals(test.getType(),res.getType());
		
	}
	/*when search seral no is passed*/
	@Test
	void getSeralno()
	
	{
		Guitar test=new Guitar("V11223", 0, "", null, null, "","");
		Guitar res=inventory.search(test);
		assertEquals(test.getSerialNumber(),res.getSerialNumber());
		
	}
	/* search by type which is not listed */
	@Test
	void SearchType()
	{
		Guitar test=new Guitar(null, 0, null, null," Mytype", null,null);
		Guitar res=inventory.search(test);
		assertEquals(null,res);
	}
	/* search by Mnaufacturer which is not listed */
	@Test
	void SearchManufacturer()
	{
		Guitar test=new Guitar(null, 0, null, "mymanufacturer", null, null,null);
		Guitar res=inventory.search(test);
		assertEquals(null,res);
	}
	/* search by topwood which is not listed */
	@Test
	void SearchTopwood()
	{
		Guitar test=new Guitar(null, 0, null, null, null, null,"MyTopWood");
		Guitar res=inventory.search(test);
		assertEquals(null,res);
	}
	/* search by backwood which is not listed */
	@Test
	void SearchBackwood()
	{
		Guitar test=new Guitar(null, 0, null, null, null, "Mybackwood",null);
		Guitar res=inventory.search(test);
		assertEquals(null,res);
	}
	/* search by model which is not listed */
	@Test
	void model()
	{
		Guitar test=new Guitar(null, 0, null, "model", null, null,null);
		Guitar res=inventory.search(test);
		assertEquals(null,res);
	}
	
}
