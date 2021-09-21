package no.hvl.dat100.lab5.tabeller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabellerEnhetsTester {

	private static int[] tabell1 = { 1, 4, 6 };
	private static int[] tabell2 = { 1 };
	private static int[] tabell3 = {};
	
	@Test
	void testSkrivUt() {
		
		Tabeller.skrivUt(tabell1);
		Tabeller.skrivUt(tabell2);
		Tabeller.skrivUt(tabell3);
	}

	@Test
	void testtilStreng() {

		assertEquals("[1,4,6]", Tabeller.tilStreng(tabell1));
		assertEquals("[1]", Tabeller.tilStreng(tabell2));
		assertEquals("[]", Tabeller.tilStreng(tabell3));
	}
	
	@Test
	void testSummer() {
		assertEquals(11,Tabeller.summer(tabell1));
		assertEquals(1,Tabeller.summer(tabell2));
		assertEquals(0,Tabeller.summer(tabell3));
	}

	@Test
	void testfinnesTall () {
		assertTrue(Tabeller.finnesTall(tabell1,1));
		assertTrue(Tabeller.finnesTall(tabell1,4));
		assertTrue(Tabeller.finnesTall(tabell1,6));
		
		assertFalse(Tabeller.finnesTall(tabell1,7));
		assertFalse(Tabeller.finnesTall(tabell3,7));
	}
	
	@Test
	void testposisjonTall () {
		
		assertEquals(0,Tabeller.posisjonTall(tabell1,1));
		assertEquals(1,Tabeller.posisjonTall(tabell1,4));
		assertEquals(2,Tabeller.posisjonTall(tabell1,6));
		
		assertEquals(-1,Tabeller.posisjonTall(tabell1,7));
		assertEquals(-1,Tabeller.posisjonTall(tabell3,7));
		
	}
	
	@Test
	void testreverser () {
		
		 int[] tabell = { 6, 4, 1 };
			
		 assertArrayEquals(tabell,Tabeller.reverser(tabell1));
		 assertArrayEquals(tabell2,Tabeller.reverser(tabell2));
		 assertArrayEquals(tabell3,Tabeller.reverser(tabell3));
	}
	
	@Test
	void erSortert () {
		
		int[] tabell = { 6, 4, 1 };
		
		assertTrue(Tabeller.erSortert(tabell1));
		assertTrue(Tabeller.erSortert(tabell2));
		assertTrue(Tabeller.erSortert(tabell3));
		
		assertFalse(Tabeller.erSortert(tabell));
	}
	
	@Test 
	void testsettSammen () {
		
		int[] tabell = { 1, 1, 4, 6 };
		
		assertArrayEquals(tabell,Tabeller.settSammen(tabell2,tabell1));
		assertArrayEquals(tabell1,Tabeller.settSammen(tabell3,tabell1));
		assertArrayEquals(tabell1,Tabeller.settSammen(tabell1,tabell3));
	}
}
