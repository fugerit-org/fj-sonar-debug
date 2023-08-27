package test.org.fugerit.java.sonar.debug;

import org.fugerit.java.sonar.debug.CoverageHelper;
import org.junit.Assert;
import org.junit.Test;

public class TestCoverageHelper {

	private static final CoverageHelper HELPER = new CoverageHelper();
	
	@Test
	public void testGreaterThan10() {
		boolean result = HELPER.testGreaterThan10( 15 );
		Assert.assertTrue( result );
	}
	
	@Test
	public void testLesserThan10() {
		boolean result = HELPER.testGreaterThan10( 8 );
		Assert.assertFalse( result );
	}
	
}
