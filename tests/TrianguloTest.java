import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {

	Triangulo t;
	
	@Before
	public void setUp(){
	  t = new Triangulo();
	}
	
	@Test
	public void testEquilatero() {
		String tipoEquilatero = t.retornaTipoTriangulo(3, 3, 3);
		assertEquals(tipoEquilatero, "Equilátero");
		tipoEquilatero = t.retornaTipoTriangulo(4, 4, 4);
		assertEquals(tipoEquilatero, "Equilátero");
	}

	@Test
	public void testIsoseles() {
		String tipoIsoceles = t.retornaTipoTriangulo(2, 3, 3);
		assertEquals(tipoIsoceles, "Isoceles");

		tipoIsoceles = t.retornaTipoTriangulo(4, 4, 10);
		assertEquals(tipoIsoceles, "Isoceles");

		tipoIsoceles = t.retornaTipoTriangulo(5, 8, 5);
		assertEquals(tipoIsoceles, "Isoceles");
	}

	@Test
	public void testScaleno() {

		String tipoScaleno = t.retornaTipoTriangulo(2, 1, 4);
		assertEquals("Scaleno", tipoScaleno);

	}

	@Test
	public void testVerificaTriangulo() throws TrianguloException {

		boolean valido = t.verificaTriangulo(3, 3, 3);
		assertTrue(valido);

		valido = t.verificaTriangulo(5, 6, 10);
		assertTrue(valido);

	}

	@Test
	public void veficarTrianguloInvalido() {
		try {
			t.verificaTriangulo(1, 2, 5);
			fail("ERRROO");
		} catch (TrianguloException e) {

		}
	}

}
