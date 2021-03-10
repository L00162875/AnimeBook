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
public class AnimeCharTest {
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
		ac = new AnimeChar("Monkey", 19, "RBody", "One Piece");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCharName() {
		assertTrue(true);
	}

	@Ignore @Test
	public void testSetCharName() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetAge() {
		int num = ac.getAge();//should return 19
		assertEquals(num, 19);
	} 
	
	@Ignore @Test
	public void testSetAge() {
		fail("Not yet implemented");
	}
	
}
