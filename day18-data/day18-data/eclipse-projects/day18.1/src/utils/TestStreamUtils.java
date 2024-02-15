package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestStreamUtils {
	private static StreamUtils ref;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("in setup");
		ref=new StreamUtils();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("in clean up");
		ref=null;
	}

	@Test
	void testCountStrings() {
		long countStrings = ref.countStrings("abc","45246","dfgsdfg","57356756","sdf");
		assertEquals(3, countStrings);
		
	}
	@Test
	void testFindMax()
	{
		String findMax = ref.findMax("abc","aad","def","xyz","yes","dfghfsh");
		assertEquals("yes", findMax);
	}

}
