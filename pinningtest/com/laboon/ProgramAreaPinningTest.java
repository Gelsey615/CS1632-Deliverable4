package com.laboon;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Test getOpCode() method in ProgramArea class
 */

public class ProgramAreaPinningTest {
	// Test the getOpCode() method returns 0 if x < 0.
    @Test
    public void testGetOpCodeEdgeCase1() {
	ProgramArea pa = new ProgramArea("123++@");
	assertEquals(pa.getOpCode(-100, 0), (char) 0);
    }
    
    // Test the getOpCode() method returns 0 if y > default_ySize.
    @Test
    public void testGetOpCodeEdgeCase2() {
	ProgramArea pa = new ProgramArea("123++@");
	assertEquals(pa.getOpCode(1, 10000), (char) 0);
    }
 
    //Test the getOpCode() method returns correct character
    @Test
    public void testGetOpCode() {
    ProgramArea pa = new ProgramArea("123++@");
	assertEquals(pa.getOpCode(0,1), '2');
	}
}