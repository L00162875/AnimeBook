/**
 * 
 */
package testpkg;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import animepkg.AnimeChar;

/**
 * @author Ruth Lennon
 *
 */
public class AnimeCharTest2 {
	AnimeChar ac; 

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ac = new AnimeChar("Monkey", 19, "Eats Berries", "one Piece");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ac = null;
	}

	/**
	 * Test method for {@link animepkg.AnimeChar#getSpecialAbility()}.
	 */
	@Test
	public void testGetSpecialAbility() {
		assertEquals(ac.getSpecialAbility(), "Eats Berries");
	}

	/**
	 * Test method for {@link animepkg.AnimeChar#setSpecialAbility(java.lang.String)}.
	 */
	@Ignore @Test
	public void testSetSpecialAbility() {
		fail("Not yet implemented"); // TODO
	}

}
