package p109;

import p108.DisplayTest;
import junit.framework.*;

public class DisplaySuiteTest {

	public static Test suite() {
		TestSuite suite = new TestSuite(DisplaySuiteTest.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(DisplayTest.class);
		suite.addTestSuite(DisplayReceiverTest.class);
		//$JUnit-END$
		return suite;
	}

}
