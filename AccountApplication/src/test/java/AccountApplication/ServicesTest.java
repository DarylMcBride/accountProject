package AccountApplication;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import accountApplication.Account;
import accountApplication.Services;

public class ServicesTest {

	Services service;
	Map<Integer, String> map;
	Account ac, ac2, ac3, ac4;
	
	


	@Before
	public void setup() {
		ac = new Account("testFName", "testLName", 12345678);

		service = new Services();

		map = new HashMap<Integer, String>();
		map.put(ac.getAccountNumber(), ac.getfName());

	}

	@Test
	public void testGetCountFirstName() {
		assertEquals(1, service.getCountFirstName(ac.getfName(), map));
	}

	@Test
	public void testGetCountFirstName2() {
		ac2 = new Account("testFName", "testLName", 12345);
		ac3 = new Account("testFName", "testLName", 1234588);
		ac4 = new Account("test", "test", 123);

		service.addAccount(ac2, map);
		service.addAccount(ac3, map);
		service.addAccount(ac4, map);

		assertEquals(3, service.getCountFirstName(ac.getfName(), map));
	}

}
