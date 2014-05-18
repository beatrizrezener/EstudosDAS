import static org.junit.Assert.*;

import org.junit.Test;


public class TrianguloTest {
	Triangulo t = new Triangulo();
	
	@Test
	public void testEquilatero() {
		String tipoEquilatero = t.verificaTriangulo(3,3,3);
		assertEquals(tipoEquilatero, "Equil�tero");
	    tipoEquilatero = t.verificaTriangulo(4,4,4);
		assertEquals(tipoEquilatero, "Equil�tero");
	
	}
	
	@Test
	public void testIsoseles() {
		String tipoIsoceles = t.verificaTriangulo(2,3,3);
		assertEquals(tipoIsoceles, "Isoceles");
	}
	
	@Test
	public void testScaleno() {
		
		String tipoScaleno = t.verificaTriangulo(2, 1, 4);
		assertEquals("Scaleno", tipoScaleno);
	}
	
	

}
