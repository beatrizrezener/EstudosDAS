package src;

import java.util.ArrayList;

public class Eratostenes {

	public ArrayList<Integer> achaPrimo(int i) {

		ArrayList<Integer> numerosRecebidos = new ArrayList<Integer>();

		for (int cont = 2; cont <= i; cont++) {
			numerosRecebidos.add(cont);
		}
		
		for(int j = 0; j < numerosRecebidos.size(); j++){
			numerosRecebidos = adicionaNumerosNaoMultiplos(numerosRecebidos.get(j), numerosRecebidos);
		}
		return numerosRecebidos;
	}

	public ArrayList<Integer> adicionaNumerosNaoMultiplos(int n, ArrayList<Integer> num_recb) {

		ArrayList<Integer> numerosNaoMultiplosDeN = num_recb;
		for(int i = 0; i < num_recb.size(); i++) {
			if(numerosNaoMultiplosDeN.get(i) % n == 0 && numerosNaoMultiplosDeN.get(i) != n) {
				numerosNaoMultiplosDeN.remove(numerosNaoMultiplosDeN.get(i));
			}
		}
		return numerosNaoMultiplosDeN;
	}
	
}