import static org.junit.Assert.*;

import org.junit.Test;


public class DateSetTest {


	@Test
	public void testAdd(){
		
		DateSet set = new DateSet();
		
		Date datum3 = new Date("08/08/1991");
		
		set.add(datum3);
		
		assertEquals(datum3, set.inhoud.get(0));
		
	}
	
	@Test
	public void testContains(){
		
		DateSet set = new DateSet();
		
		Date datum2 = new Date("01/01/1999");
		
		
		assertFalse(set.contains(datum2));
		
		set.add(datum2);
		
		assertTrue(set.contains(datum2));
	}
	
	@Test
	public void testIntersection(){
		
		DateSet set1 = new DateSet();
		
		Date datum1 = new Date("03/03/3333");
		Date datum2 = new Date("01/01/1999");
		Date datum3 = new Date("08/08/1991");
		
		set1.add(datum1);
		set1.add(datum2);
		set1.add(datum3);
		
		DateSet set2 = new DateSet();
		
		Date datum4 = new Date("03/03/3333");
		Date datum5 = new Date("02/02/2222");
		
		
		set2.add(datum4);
		set2.add(datum5);
		
		
		
		assertEquals("<Dateset:" +  "03/03/3333 >", set1.intersection(set2).toString());
		
	}
	@Test
	public void testToString(){
		DateSet set1 = new DateSet();
		
		Date datum1 = new Date("03/03/3333");
		Date datum2 = new Date("01/01/1999");
		Date datum3 = new Date("08/08/1991");
		
		set1.add(datum1);
		set1.add(datum2);
		set1.add(datum3);
		
		assertEquals("<Dateset:"  + "03/03/3333" + " " + "01/01/1999" + " "+ "08/08/1991"+ " " + ">",set1.toString());
		
	}
}
