package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import src.Eratostenes;

public class eratostenesTest {
	Eratostenes e = new Eratostenes();
	
	
	@Test
	public void testTwo() {
     ArrayList<Integer> result =  e.achaPrimo(2);
     ArrayList<Integer> esperado = new ArrayList<Integer>();
     esperado.add(2);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testFour() {
     ArrayList<Integer> result =  e.achaPrimo(4);
     ArrayList<Integer> esperado = new ArrayList<Integer>();
     esperado.add(2);
     esperado.add(3);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testFive() {
     ArrayList<Integer> result =  e.achaPrimo(5);
     ArrayList<Integer> esperado = new ArrayList<Integer>();
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testSix() {
     ArrayList<Integer> result =  e.achaPrimo(6);
     ArrayList<Integer> esperado = new ArrayList<Integer>();
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testSeven() {
     ArrayList<Integer> result =  e.achaPrimo(7);
     ArrayList<Integer> esperado = new ArrayList<Integer>();
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
     esperado.add(7);
	 assertEquals(esperado, result);
	}

}

