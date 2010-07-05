package junit3Asserstions;

import java.util.*;

import junit.framework.TestCase;

public class AssertionsTest extends TestCase {

	public void testAssertEquals() throws Exception {
		assertEquals("두 숫자 비교", 1, 10/10);
		assertEquals("오차보정", 0.3333, 1/3d, 0.0001);
	}
	
	public void testAssertSame() throws Exception {
		IPTable myHomeIp = new IPTable("192.168.0.1");
		
		HashMap<String, IPTable> cache = new HashMap<String, IPTable>();
		cache.put("myHomeIp", myHomeIp);
		
		assertSame("캐시처리 실패", myHomeIp, cache.get("myHomeIp"));
	}
	
	public void testAssertNull() throws Exception {
		String name = null;
		assertNull(name);
	}

	private class IPTable {
		private String ip;
		public IPTable(String ip){
			this.ip = ip;
		}
	}
	
	
}


