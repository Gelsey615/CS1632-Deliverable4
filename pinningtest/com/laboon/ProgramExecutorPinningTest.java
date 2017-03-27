package com.laboon;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Test the modulo() method in ProgramExecutor class
 */
public class ProgramExecutorPinningTest {
    
    // %  Modulo: Pop two values a and b, then push the remainder of the integer division of b/a.
    //test that modulo() returns 0 when b/a is exact division 
    @Test
    public void testModuloEdgeCase1() {
    	ProgramStack ps = new ProgramStack();
    	ps.push(2);
    	ps.push(2); 
    	ProgramArea pa = new ProgramArea("123++@");
    	MainPanel mp = new MainPanel();
    	ProgramExecutor _e = new ProgramExecutor(mp, ps, pa);
	_e.modulo();
	assertEquals(0, _e._ps.peek());
    }
    
    //test that modulo() won't perform when a = 0
    @Test
    public void testModuloEdgeCase2() {
    	boolean pass = false;
    	ProgramStack ps = new ProgramStack();
    	ps.push(2);
    	ps.push(0); 
    	ProgramArea pa = new ProgramArea("123++@");
    	MainPanel mp = new MainPanel();
    	ProgramExecutor _e = new ProgramExecutor(mp, ps, pa);
	try{
	    _e.modulo();
	}catch(ArithmeticException ae){
	    pass = true;
	} 
	assertTrue(pass);
    }
    
  //test that normal modulo() case returns correct result
    @Test
    public void testModuloNormalCase() {
    	ProgramStack ps = new ProgramStack();
    	ps.push(3);
    	ps.push(4); 
    	ProgramArea pa = new ProgramArea("123++@");
    	MainPanel mp = new MainPanel();
    	ProgramExecutor _e = new ProgramExecutor(mp, ps, pa);
	_e.modulo();
	assertEquals(3, _e._ps.peek());
    }
}
