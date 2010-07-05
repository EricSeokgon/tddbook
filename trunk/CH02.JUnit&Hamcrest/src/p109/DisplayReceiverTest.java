package p109;

import junit.framework.TestCase;

public class DisplayReceiverTest extends TestCase {

	public void testGetString() throws Exception {
		assertEquals("Happy", Display.getString());
	}
	
	static class Display {
		public static String getString(){
			return "Happy";
		}
	}
}
