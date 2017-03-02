package edu.ncsu.csc316.ancestrytree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class AhnentafelEntryTest {

	@Test
	public void test() {
		AhnentafelEntry a = new AhnentafelEntry(1, "Truly", "Scrumptious");
		assertNotNull(a);
		assertEquals(1, a.getNumber());
		assertEquals("Truly Scrumptious", a.getName());
		assertEquals("Scrumptious, Truly", a.levelOrderName());
	}

}
