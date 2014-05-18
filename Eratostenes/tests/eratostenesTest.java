package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import src.Eratostenes;

public class eratostenesTest {

	Eratostenes e = new Eratostenes();
	@Test
	public void test() {
     ArrayList result =  e.achaPrimo(4);
     ArrayList esperado = new ArrayList();
     esperado.add(2);
     esperado.add(3);
	 assertEquals(esperado, result);
	}

}
