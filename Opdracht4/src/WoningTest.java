import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Baksteen
 *
 */
public class WoningTest {

	
	/**
	 * Test method for constructor.
	 */
	@Test
	public void testWoning() {
		Adres A = new Adres("jo","hier","woon", "ik");
		
		Woning won = new Woning(1,2,A);
		
		assertNotNull(won);
	}

	/**
	 * Test method for {@link Woning#toString()}.
	 */
	@Test
	public void testToString() {
		Adres A = new Adres("jo","hier","woon", "ik");
		
		Woning won = new Woning(1,2,A);

		assertEquals("Deze woning heeft: "
			+ 1 + "kamers" + "\n"	
			+ "Deze woning kost:" + 2 + "\n"
			+ "Het adres is" + "\n" + "johierwoonik",won.toString());
	}

	/**
	 * Test method for equals.
	 */
	@Test
	public void testEqualsObject() {
		Adres A = new Adres("jo","hier","woon", "ik");
		Adres B = new Adres("aap","noot","noot","mies");
		Adres C = new Adres("jo","hier","woon", "ik");
		
		
		Woning wie = new Woning(3,4,B);
		Woning wat = new Woning(3,4,B);
		Woning won = new Woning(3,4,C);
		
		
		
		assertTrue(wie.equals(wat));
		assertFalse(wie.equals(won));
		
		
	}

	/**
	 * Test method for kosthooguit
	 */
	@Test
	public void testKostHooguit() {
		Adres A = new Adres("jo","hier","woon", "ik");
		Adres B = new Adres("aap","noot","noot","mies");
		Woning wat = new Woning(3,4,B);
		
		Woning won = new Woning(1,2,A);
		
		assertTrue(wat.kostHooguit(10));
		assertFalse(won.kostHooguit(1));
	}

}
