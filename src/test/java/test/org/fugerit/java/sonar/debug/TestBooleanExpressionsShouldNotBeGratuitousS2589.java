package test.org.fugerit.java.sonar.debug;

import org.fugerit.java.sonar.debug.BooleanExpressionsShouldNotBeGratuitousS2589;
import org.junit.Assert;
import org.junit.Test;

public class TestBooleanExpressionsShouldNotBeGratuitousS2589 {

	@Test
	public void testBase() {
		boolean ok = false;
		System.setProperty( "my-prop" , "false" );
		BooleanExpressionsShouldNotBeGratuitousS2589 inst = new BooleanExpressionsShouldNotBeGratuitousS2589();
		inst.myMethod();
		ok = true;
		Assert.assertTrue( ok );
	}

	@Test
	public void testBaseProp() {
		boolean ok = false;
		System.setProperty( "my-prop" , "true" );
		BooleanExpressionsShouldNotBeGratuitousS2589 inst = new BooleanExpressionsShouldNotBeGratuitousS2589();
		inst.myMethod();
		ok = true;
		Assert.assertTrue( ok );
	}
	
}
