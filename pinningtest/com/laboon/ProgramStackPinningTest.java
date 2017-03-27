package com.laboon;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Test the toString() method in ProgramStack class
 */

public class ProgramStackPinningTest {
	// An empty ProgramStack should be represented by the String "[]".
    @Test
    public void testToStringEmpty() {
	ProgramStack stack = new ProgramStack();
	assertTrue(stack.toString().equals("[]"));
    }
    
    // A ProgramStack with one element should be represented by that one
    // element surrounded by brackets, e.g. "[5]".
    @Test
    public void testToStringOne() {
	ProgramStack stack = new ProgramStack();
	stack.push(5);
	assertTrue(stack.toString().equals("[5]"));

    }
    
    // A ProgramStack with multiple elements should consist of the elements
    // in the stack in order, separated by commas and spaces.
    @Test
    public void testToStringMultiple() {
	ProgramStack stack = new ProgramStack();
	stack.push(5);
	stack.push(7);
	stack.push(8);
	assertTrue(stack.toString().equals("[5, 7, 8]"));
    }
}