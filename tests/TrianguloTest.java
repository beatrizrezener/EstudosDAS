import static org.junit.Assert.*;

import org.junit.Test;


public class TrianguloTest {

	@Test
	public void test() {
		Triangulo t = new Triangulo();
		String tipoTriangulo = t.verificaTriangulo(3,3,3);
		assertEquals(tipoTriangulo, "Equilátero");
	}

}
