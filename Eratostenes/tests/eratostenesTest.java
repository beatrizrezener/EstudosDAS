package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import src.Eratostenes;

public class eratostenesTest {
	Eratostenes e = new Eratostenes();
	ArrayList<Integer> result = new ArrayList<>();
	ArrayList<Integer> esperado = new ArrayList<>();
	
	
	public void setaArray(int n){
		result =  e.achaPrimo(n);
		esperado = new ArrayList<Integer>();
	}
	
	@Test
	public void testTwo() {
	 setaArray(2);
     esperado.add(2);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testFour() {
     setaArray(4);
     esperado.add(2);
     esperado.add(3);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testFive() {
	 setaArray(5);
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testSix() {
	 setaArray(6);
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testSeven() {
	 setaArray(7);
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
     esperado.add(7);
	 assertEquals(esperado, result);
	}

	@Test
	public void testNine() {
	 setaArray(9);
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
     esperado.add(7);
	 assertEquals(esperado, result);
	}

	@Test
	public void testEleven() {
	 setaArray(11);
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
     esperado.add(7);
     esperado.add(11);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void testFifty() {
	 setaArray(15);
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
     esperado.add(7);
     esperado.add(11);
     esperado.add(13);
	 assertEquals(esperado, result);
	}
	
	@Test
	public void test30() {
	 setaArray(30);
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
     esperado.add(7);
     esperado.add(11);
     esperado.add(13);
     esperado.add(17);
     esperado.add(19);
     esperado.add(23);
     esperado.add(29);
	 assertEquals(esperado, result);
	}
	
	
	@Test
	public void test40() {
	 setaArray(40);
     esperado.add(2);
     esperado.add(3);
     esperado.add(5);
     esperado.add(7);
     esperado.add(11);
     esperado.add(13);
     esperado.add(17);
     esperado.add(19);
     esperado.add(23);
     esperado.add(29);
     esperado.add(31);
     esperado.add(37);
	 assertEquals(esperado, result);
	}
	
}

