package org.fugerit.java.sonar.debug;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoverageHelper {

	public boolean testGreaterThan10( int a ) {
		boolean result = false;
		if ( a > 10 ) {
			log.info( "input greater than 10 : {}", a );
			result = true;
		} else {
			log.info( "input lesser or equalto 10 : {}", a );
		}
		return result;
	}
	
}
