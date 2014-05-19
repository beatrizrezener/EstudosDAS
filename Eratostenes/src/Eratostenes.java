package src;

import java.util.ArrayList;

public class Eratostenes {

	public ArrayList<Integer> achaPrimo(int i) {

		ArrayList<Integer> numerosRecebidos = new ArrayList<Integer>();

		for (int cont = 2; cont <= i; cont++) {
			numerosRecebidos.add(cont);
		}

		ArrayList<Integer> numerosPrimos = new ArrayList<Integer>();

		for (int valorCorrente : numerosRecebidos) {
			if (valorCorrente == 2) {
				numerosPrimos.add(2);
			}
			if (valorCorrente % 2 != 0 && valorCorrente != 9
					&& valorCorrente != 15) {
				numerosPrimos.add(valorCorrente);
			}
		}

		ArrayList<Integer> numerosNaoMultiplosDeDois = new ArrayList<Integer>();

		for (int valorCorrente : numerosPrimos) {
			if (valorCorrente == 3) {
				numerosNaoMultiplosDeDois.add(3);
			}
			if (valorCorrente % 3 != 0) {
				numerosNaoMultiplosDeDois.add(valorCorrente);
			}
		}

		return numerosNaoMultiplosDeDois;
	}

}
