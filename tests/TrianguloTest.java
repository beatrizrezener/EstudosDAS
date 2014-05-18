import static org.junit.Assert.*;

import org.junit.Test;


public class TrianguloTest {

	@Test
	public void test() {
		Triangulo t = new Triangulo();
		String tipoEquilatero = t.verificaTriangulo(3,3,3);
		assertEquals(tipoEquilatero, "Equilátero");
		
		String tipoIsoceles = t.verificaTriangulo(2,3,3);
		assertEquals(tipoIsoceles, "Isoceles");
		
		String tipoScaleno = t.verificaTriangulo(2, 1, 4);
		assertEquals("Scaleno", tipoScaleno);
	}

}
