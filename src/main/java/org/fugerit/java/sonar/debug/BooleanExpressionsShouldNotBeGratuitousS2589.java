package org.fugerit.java.sonar.debug;

public class BooleanExpressionsShouldNotBeGratuitousS2589 {

	private void doAdditionalWork() {
		int count = 100;
		while ( count > 0 ) {
			count--;
		}
	}
	
	private void doMiddleWork() {
		int count = 0;
		while ( count < 100 ) {
			count++;
		}
	}
	
	public void myMethod() {
		boolean myCondition = "true".equalsIgnoreCase( System.getProperty( "my-prop" ) );
		if ( !myCondition ) {
			doAdditionalWork();
		}
		doMiddleWork();
		if ( !myCondition ) {
			doAdditionalWork();
		}
	}
	
}
