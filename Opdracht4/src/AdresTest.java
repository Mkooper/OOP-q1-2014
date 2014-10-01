import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Baksteen
 *
 */
public class AdresTest {

	/**
	 * Test method for {@link Adres#Adres(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAdres() {
		
		Adres A = new Adres("jo","hier","woon", "ik");
		assertNotNull(A);
		
		
	}

	/**
	 * Test method for {@link Adres#toString()}.
	 */
	@Test
	public void testToString() {
		Adres A = new Adres("jo","hier","woon", "ik");
		
		assertEquals("johierwoonik",A.toString());
	}

	/**
	 * Test method for {toString() method}.
	 */
	@Test
	public void testEqualsObject() {
		Adres A = new Adres("jo","hier","woon", "ik");
		Adres B = new Adres("aap","noot","noot","mies");
		Adres C = new Adres("jo","hier","woon", "ik");
		
		assertTrue(A.equals(C));
		
		assertFalse(B.equals(A));
	}

}
