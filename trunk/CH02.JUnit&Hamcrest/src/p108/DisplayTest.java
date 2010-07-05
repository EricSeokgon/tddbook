package p108;

import junit.framework.TestCase;

public class DisplayTest extends TestCase {

	public void testGetString() throws Exception {
		assertEquals("Happy", Display.getString());
	}
	
	static class Display {
		public static String getString(){
			return "Happy";
		}
	}
	
	public static void main(String[] args) {
		junit.swingui.TestRunner.run(DisplayTest.class);
		junit.textui.TestRunner.run(DisplayTest.class);
		junit.awtui.TestRunner.run(DisplayTest.class);
	}
}
