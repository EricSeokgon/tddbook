package junit3Asserstions;

import java.util.*;

import junit.framework.TestCase;

public class AssertionsTest extends TestCase {

	public void testAssertEquals() throws Exception {
		assertEquals("�� ���� ��", 1, 10/10);
		assertEquals("��������", 0.3333, 1/3d, 0.0001);
	}
	
	public void testAssertSame() throws Exception {
		IPTable myHomeIp = new IPTable("192.168.0.1");
		
		HashMap<String, IPTable> cache = new HashMap<String, IPTable>();
		cache.put("myHomeIp", myHomeIp);
		
		assertSame("ĳ��ó�� ����", myHomeIp, cache.get("myHomeIp"));
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


