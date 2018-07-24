package com.idotrick.gssb.user.test;

import com.idotrick.gssb.user.dao.UserDaoImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class UserDaoTest {
	
	UserDaoImpl dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dao = new UserDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}

/*	@Test
	public void getUserByString_TestCase001() {
		System.out.println("[Start] getUserByString_TestCase001");
		
		Set<User> rs = dao.getByString("Tuck");
		
		rs.forEach(p -> System.out.println(p));
		
		assertEquals(2, rs.size());
	
		System.out.println("[Finish] getUserByString_TestCase001");	
	}
	
	@Test
	public void getUserByString_TestCase002() {
		System.out.println("[Start] getUserByString_TestCase002");
		
		Set<User> rs = dao.getByString("tuck");
		
		rs.forEach(p -> System.out.println(p));
		
		assertEquals(2, rs.size());
	
		System.out.println("[Finish] getUserByString_TestCase002");	
	}	
	
	@Test
	public void getUserByString_TestCase003() {
		System.out.println("[Start] getUserByString_TestCase003");
		
		Set<User> rs = dao.getByString("uck");
		
		rs.forEach(p -> System.out.println(p));
		
		assertEquals(0, rs.size());
	
		System.out.println("[Finish] getUserByString_TestCase003");	
	}	
	
	@Test
	public void getUserByString_TestCase004() {
		System.out.println("[Start] getUserByString_TestCase004");
		
		Set<User> rs = dao.getByString("LN1 Tuck");
		
		rs.forEach(p -> System.out.println(p));
		
		assertEquals(2, rs.size());
	
		System.out.println("[Finish] getUserByString_TestCase004");	
	}
	
	@Test
	public void getUserByString_TestCase005() {
		System.out.println("[Start] getUserByString_TestCase005");
		
		Set<User> rs = dao.getByString("user1");
		
		rs.forEach(p -> System.out.println(p));
		
		assertEquals(1, rs.size());
	
		System.out.println("[Finish] getUserByString_TestCase005");	
	}	
*/
}
