package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Ranger;

public class RangerTest {

	@Test
	public void test() {
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("[0,2]");
		assertEquals("012", retorno);
	}
	
	@Test
	public void testCase2() {
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("[0,5]");
		assertEquals("012345", retorno);
	}
	
	@Test
	public void testCase3() {
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("[0,1]");
		assertEquals("01", retorno);
	}


}