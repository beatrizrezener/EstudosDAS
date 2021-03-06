package src;

public class Ranger {

	String caractesValido = "0987654321[]()";

	public void validaDados(String ranger) throws ValidaResultadoException {
		int valido = 1;
		
		for (int cont = 0; cont < ranger.length(); cont++) {
			for (int aux = 0; aux < caractesValido.length(); aux++) {
				if (ranger.charAt(cont) == caractesValido.charAt(aux)) {
					valido++;
				}
			}
		}

		System.out.println(ranger.length());
		System.out.println(valido);
		
		if (ranger.length() != valido) {
			throw new ValidaResultadoException("Caracter invalido!!");
		} 
	}

	public String getIntervalo(String range) throws ValidaResultadoException {

		validaDados(range);
		
		Integer inicio = Integer.parseInt(range.substring(1, 2));
		Integer fim = Integer.parseInt(range.substring(3, 4));

		String primeiraPosicao = range.substring(0, 1);
		String ultimaPosicao = range.substring((range.length() - 1),
				range.length());

		if (primeiraPosicao.equals("(") && ultimaPosicao.equals(")")) {

			String result = "";
			for (Integer cont = inicio + 1; cont < fim; cont++) {
				result += cont.toString();
			}
			return result;

		} else if (primeiraPosicao.equals("[") && ultimaPosicao.equals("]")) {

			String result = "";
			for (Integer cont = inicio; cont <= fim; cont++) {
				result += cont.toString();
			}

			return result;
		} else if (primeiraPosicao.equals("[") && ultimaPosicao.equals(")")) {

			String result = "";
			for (Integer cont = inicio; cont < fim; cont++) {
				result += cont.toString();
			}

			return result;
		} else if (primeiraPosicao.equals("(") && ultimaPosicao.equals("]")) {
			String result = "";
			for (Integer cont = inicio + 1; cont <= fim; cont++) {
				result += cont.toString();
			}

			return result;

		}

		return null;
	}
}
