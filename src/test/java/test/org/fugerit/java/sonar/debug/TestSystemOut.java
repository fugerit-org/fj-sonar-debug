package test.org.fugerit.java.sonar.debug;

import org.fugerit.java.sonar.debug.SystemOut;
import org.junit.Assert;
import org.junit.Test;

public class TestSystemOut {

	@Test
	public void testBase() {
		boolean ok = false;
		SystemOut inst = new SystemOut();
		inst.myMethod();
		ok = true;
		Assert.assertTrue( ok );
	}
	
	
}
