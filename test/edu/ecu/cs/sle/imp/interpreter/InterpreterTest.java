package edu.ecu.cs.sle.imp.interpreter;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class InterpreterTest {

	private static Interpreter interpreter;
	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}
	
	@Test
	public void testMultiply() {
		IntegerValue iv = interpreter.interpret("1*2");
		assertEquals("1*2", 2, iv.getIntValue().intValue());
	}	

@Test
public void testDiv() {
	IntegerValue iv = interpreter.interpret("6/3");
	assertEquals("6/3", 2, iv.getIntValue().intValue());
}	


@Test
public void testPlus() {
	IntegerValue iv = interpreter.interpret("1+2");
	assertEquals("1+2", 3, iv.getIntValue().intValue());
}	



@Test
public void testMinus() {
	IntegerValue iv = interpreter.interpret("6-4");
	assertEquals("6-4", 2, iv.getIntValue().intValue());
}	


@Test
public void unaryminus() {
	IntegerValue iv = interpreter.interpret("1*-1");
	assertEquals("1*-1", -1, iv.getIntValue().intValue());
}}	

