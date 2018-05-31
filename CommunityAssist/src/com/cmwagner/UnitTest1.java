package com.cmwagner;

import junit.framework.TestCase;

public class UnitTest1 extends TestCase {
	public void testCheckCredentials1() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials("admin", "admin");
		
		assertEquals(true, result);
		
	}
	
	public void testCheckCredentials2() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials("admin", "abc");
		
		assertEquals(false, result);
		
	}
	
	public void testCheckCredentials3() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials("abc", "admin");
		
		assertEquals(false, result);
		
	}
	
	public void testCheckCredentials4() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials(null, "admin");
		
		assertEquals(false, result);
		
	}
	
	public void testCheckCredentials5() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials("admin", null);
		
		assertEquals(false, result);
		
	}
	
	public void testCheckCredentials6() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials(null, null);
		
		assertEquals(false, result);
		
	}
	
	public void testCheckCredentials7() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials("123", "admin");
		
		assertEquals(false, result);
		
	}
	
	public void testCheckCredentials8() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials("admin", "123");
		
		assertEquals(false, result);
		
	}
	
	public void testCheckCredentials9() {
		Login l = new Login("admin", "admin");
		
		boolean result = l.checkCredentials("123", "123");
		
		assertEquals(false, result);
		
	}
	
	public void testSetAmount1() {
		Donation d = new Donation();
		
		d.setAmount(100);
		
		float result = d.getAmount();
		
		assertEquals(100, result);
	}
	
	public void testSetAmount2() {
		Donation d = new Donation();
		
		d.setAmount(0);
		
		float result = d.getAmount();
		
		assertEquals(0, result);
	}
	
	public void testSetAmount3() {
		Donation d = new Donation();
		
		d.setAmount(null);
		
		float result = d.getAmount();
		
		assertEquals(null, result);
	}
	
	public void testSetAmount4() {
		Donation d = new Donation();
		
		d.setAmount(-50);
		
		float result = d.getAmount();
		
		assertEquals(-50, result);
	}
	
	public void testSetAmount5() {
		Donation d = new Donation();
		
		d.setAmount(10.5);
		
		float result = d.getAmount();
		
		assertEquals(10.5, result);
	}
	
	public void testSetAmount6() {
		Donation d = new Donation();
		
		d.setAmount("abc");
		
		float result = d.getAmount();
		
		assertEquals("abc", result);
	}
	
	public void testSetAmount7() {
		Donation d = new Donation();
		
		d.setAmount(a);
		
		float result = d.getAmount();
		
		assertEquals(a, result);
	}
	
	public void testSetAmount8() {
		Donation d = new Donation();
		
		d.setAmount('50');
		
		float result = d.getAmount();
		
		assertEquals('50', result);
	}
}
