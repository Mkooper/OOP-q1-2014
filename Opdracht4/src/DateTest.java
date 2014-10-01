import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {

	
	@Test
	public void testConstructor(){
		
		Date deet = new Date("08/08/1991");
		
		assertNotNull(deet);
	}
	@Test
	public void testToString() {
		Date datum1 = new Date("08/08/1991");
		
		
		
		assertEquals("08/08/1991", datum1.toString());
	}

	@Test
	public void testEquals(){
		Date datum1 = new Date("08/08/1991");
		Date datum2 = new Date("01/01/1999");
		Date datum3 = new Date("08/08/1991");

		
		assertFalse(datum1.equals(datum2));
		assertTrue(datum1.equals(datum3));
		assertFalse(datum1.equals(datum1));
		
	}
}
