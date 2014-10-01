import static org.junit.Assert.*;

import org.junit.Test;


public class PersonTest {

	
	
	@Test
	public void testConstructor(){
		
		Person a = new Person("jan");
		
		assertEquals("jan",a.getName());
		
	}
	
	
	@Test
	public void testAdd(){
		
		Person a = new Person("jan");
				
		Date datum1 = new Date("08/08/1991");		
		a.add(datum1);
		
		
		assertEquals(datum1, a.getDateSet().inhoud.get(0));
		
	}
	
	
	
	@Test
	public void testToString(){
		Person b = new Person("piet");
		
		Date datum1 = new Date("03/03/3333");
	
		b.add(datum1);
		
		assertEquals("piet:" + "\n" + "<Dateset:"  + "03/03/3333" + " " + ">",b.toString());
		
		
	}
	
	@Test
	public void testEquals(){
		
		Person a = new Person("jan");
		Person b = new Person("piet");
		Person c = new Person("klaas");
		Date datum1 = new Date("03/03/3333");
		Date datum2 = new Date("01/01/1999");
		Date datum3 = new Date("08/08/1991");
		a.add(datum1);
		a.add(datum2);
		b.add(datum3);
		c.add(datum3);
		
		assertFalse(a.equals(b));
		assertTrue(b.equals(c));
		
	}

}
