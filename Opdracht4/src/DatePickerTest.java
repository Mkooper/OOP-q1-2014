import static org.junit.Assert.*;

import org.junit.Test;


public class DatePickerTest {

	@Test
	public void testAdd() {
		
		Person a = new Person("jan");
		DatePicker dp = new DatePicker();
		dp.add(a);
		
		assertEquals(a,dp.lijst.get(0));
	}

	@Test
	public void testCommonDates(){
		
		DatePicker dp = new DatePicker();
		
		Person a = new Person("jan");
		Person b = new Person("piet");
		
	
		Date datum1 = new Date("03/03/3333");
		Date datum2 = new Date("01/01/1999");
		Date datum3 = new Date("08/08/1991");
		
		dp.add(a);
		dp.add(b);
		
		a.add(datum1);
		a.add(datum2);
		b.add(datum2);
		b.add(datum3);
		
		DateSet ds =  new DateSet();
		ds.add(datum2);
		
		assertEquals(ds, dp.commonDates());
	}
	
	@Test
	public void testToString(){
		DatePicker dp = new DatePicker();
		
		Person a = new Person("jan");
		Person b = new Person("piet");
		
	
		Date datum1 = new Date("03/03/3333");
		Date datum2 = new Date("01/01/1999");
		Date datum3 = new Date("08/08/1991");
		
		dp.add(a);
		dp.add(b);
		
		a.add(datum1);
		a.add(datum2);
		b.add(datum2);
		b.add(datum3);
		
		
		
		assertEquals("A list of dates on which each person is available" + "\n" + "<Dateset:" + "01/01/1999"+ " >", dp.toString());
	}
}
