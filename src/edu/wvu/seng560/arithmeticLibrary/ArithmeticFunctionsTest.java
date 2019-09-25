package edu.wvu.seng560.arithmeticLibrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticFunctionsTest {
	
	ArithmeticFunctions af = new ArithmeticFunctions();

	@Test
	void testAdd() {
		assertEquals("5", af.add("2", "3"));
		assertEquals("6.0", af.add("2.3", "3.7"));
	}

	@Test
	void testAddBin() {
		assertEquals("101", af.addBin("10", "11"));
	}

	@Test
	void testAddOct() {
		assertEquals("764", af.addOct("757", "5"));
	}

	@Test
	void testAddHex() {
		assertEquals("181", af.addHex("C8", "B9"));
	}

	@Test
	void testSubtract() {
		assertEquals("2", af.subtract("5", "3"));
		assertEquals("2.3", af.subtract("5.4", "3.1"));
	}

	@Test
	void testSubtractBin() {
		assertEquals("111", af.subtractBin("1001", "10"));
	}

	@Test
	void testSubtractOct() {
		assertEquals("25", af.subtractOct("53", "26"));
	}

	@Test
	void testSubtractHex() {
		assertEquals("aa", af.subtractHex("C7", "1D"));
	}

	@Test
	void testMultiply() {
		assertEquals("6", af.multiply("2", "3"));
		assertEquals("7.36", af.multiply("2.3", "3.2"));
	}

	@Test
	void testMultiplyBin() {
		assertEquals("10101", af.multiplyBin("111", "11"));
	}

	@Test
	void testMultiplyOct() {
		assertEquals("1662", af.multiplyOct("53", "26"));
	}

	@Test
	void testMultiplyHex() {
		assertEquals("168b", af.multiplyHex("C7", "1D"));
	}

	@Test
	void testDivide() {
		assertEquals("0.33333", af.divide("1", "3"));
		assertEquals("4", af.divide("8", "2"));
		assertEquals("3.4", af.divide("4.25", "1.25"));
	}

	@Test
	void testDivideBin() {
		assertEquals("10", af.divideBin("1000", "100"));
	}

	@Test
	void testDivideOct() {
		assertEquals("53", af.divideOct("1662", "26"));
	}

	@Test
	void testDivideHex() {
		assertEquals("c7", af.divideHex("168B", "1D"));
	}

	@Test
	void testSquareRoot() {
		assertEquals("8", af.squareRoot("64"));
		assertEquals("5.8", af.squareRoot("33.64"));
	}

	@Test
	void testSquareRootBin() {
		assertEquals("1000", af.squareRootBin("1000000"));
	}

	@Test
	void testSquareRootOct() {
		assertEquals("10", af.squareRootOct("100"));
	}

	@Test
	void testSquareRootHex() {
		assertEquals("c", af.squareRootHex("90"));
	}

	@Test
	void testPower() {
		assertEquals("64", af.power("8", "2"));
	}

	@Test
	void testPowerBin() {
		assertEquals("1000", af.powerBin("10", "11"));
	}

	@Test
	void testPowerOct() {
		assertEquals("1000", af.powerOct("10", "3"));
	}

	@Test
	void testPowerHex() {
		assertEquals("3e8", af.powerHex("A", "3"));
	}

	@Test
	void testBinToInt() {
		assertEquals("79", af.binToInt("1001111"));
	}

	@Test
	void testOctToInt() {
		assertEquals("79", af.octToInt("117"));
	}

	@Test
	void testHexToInt() {
		assertEquals("79", af.hexToInt("4F"));
	}
	
	@Test
	void testIntToBin() {
		assertEquals("1001111", af.intToBin("79"));
	}
	
	@Test
	void testOctToBin() {
		assertEquals("1001111", af.octToBin("117"));
	}
	
	@Test
	void testHexToBin() {
		assertEquals("1001111", af.hexToBin("4F"));
	}
	
	@Test
	void testBinToOct() {
		assertEquals("10", af.binToOct("1000"));
	}
	
	@Test
	void testIntToOct() {
		assertEquals("10", af.intToOct("8"));
	}
	
	@Test
	void testHexToOct() {
		assertEquals("17", af.hexToOct("F"));
	}
	
	@Test
	void testBinToHex() {
		assertEquals("b", af.binToHex("1011"));
	}
	
	@Test
	void testOctToHex() {
		assertEquals("c", af.octToHex("14"));
	}
	
	@Test
	void testIntToHex() {
		assertEquals("f", af.intToHex("15"));
	}

}
