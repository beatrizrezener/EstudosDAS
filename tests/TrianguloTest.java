import static org.junit.Assert.*;

import org.junit.Test;


public class TrianguloTest {
	
	Triangulo t = new Triangulo();
	
	
	@Test
	public void testEquilatero() {
		String tipoEquilatero = t.retornaTipoTriangulo(3,3,3);
		assertEquals(tipoEquilatero, "Equilátero");
	    tipoEquilatero = t.retornaTipoTriangulo(4,4,4);
		assertEquals(tipoEquilatero, "Equilátero");
	}
	
	@Test
	public void testIsoseles() {
		String tipoIsoceles = t.retornaTipoTriangulo(2,3,3);
		assertEquals(tipoIsoceles, "Isoceles");
		
		tipoIsoceles = t.retornaTipoTriangulo(4,4,10);
		assertEquals(tipoIsoceles, "Isoceles");
		
		
		tipoIsoceles = t.retornaTipoTriangulo(5,8,5);
		assertEquals(tipoIsoceles, "Isoceles");
	}
	
	@Test
	public void testScaleno() {
		
		
		String tipoScaleno = t.retornaTipoTriangulo(2, 1, 4);
		assertEquals("Scaleno", tipoScaleno);
		
	}
	
	

}
