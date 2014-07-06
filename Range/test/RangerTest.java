package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Ranger;
import src.ValidaResultadoException;

public class RangerTest {

	@Test
	public void test() throws ValidaResultadoException {
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("[0,2]");
		assertEquals("012", retorno);
	}
	
	@Test
	public void testCase2() throws ValidaResultadoException {
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("[0,5]");
		assertEquals("012345", retorno);
	}
	
	@Test
	public void testCase3() throws ValidaResultadoException {
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("[0,1]");
		assertEquals("01", retorno);
	}
	
	@Test
	public void testCaseParenteses1() throws ValidaResultadoException {
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("(0,5)");
		assertEquals("1234", retorno);
	}
	
	@Test
	public void testParentesesEConchetes() throws ValidaResultadoException{
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("[0,6)");
		assertEquals("012345", retorno);
	}
	
	@Test
	public void testCochetesEparentese() throws ValidaResultadoException{
		Ranger ranger = new Ranger();
		String retorno = ranger.getIntervalo("(0,6]");
		assertEquals("123456", retorno);
	}
	
	
	@Test
	public void testValidacao() throws ValidaResultadoException {
		Ranger ranger = new Ranger();
		
		try{
			String retorno = ranger.getIntervalo("{0,6]");
			fail("ERROO");
		
		}catch(ValidaResultadoException e){
			//Nada a fazer
		}	
		
	}
	
	@Test
	public void testValidacao2() throws ValidaResultadoException {
		Ranger ranger = new Ranger();
		
		try{
			String retorno = ranger.getIntervalo("{%,78");
			fail("ERROO");
			
		}catch(ValidaResultadoException e){
			//Nada a fazer
		}	
		
	}
	
	@Test
	public void testValidacao3() throws ValidaResultadoException {
		Ranger ranger = new Ranger();
		
		try{
			String retorno = ranger.getIntervalo("[][]$#378sd45sdjkgu05");
			fail("ERROO");
		}catch(ValidaResultadoException e){
			//Nada a fazer
		}	
		
	}
}