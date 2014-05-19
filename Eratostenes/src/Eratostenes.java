package src;

import java.util.ArrayList;

public class Eratostenes {

	public ArrayList<Integer> achaPrimo(int i) {

		ArrayList<Integer> numerosRecebidos = new ArrayList<Integer>();

		for (int cont = 2; cont <= i; cont++) {
			numerosRecebidos.add(cont);
		}

		int n =2;


		
		ArrayList<Integer> numerosNaoMultiplosDeDois = adicionaNumerosMultiplos(n, numerosRecebidos);
	
		ArrayList<Integer> numerosNaoMultiplosDeTres = adicionaNumerosMultiplos((n+1), numerosNaoMultiplosDeDois);		
	
		return numerosNaoMultiplosDeTres;
	}



public ArrayList<Integer> adicionaNumerosMultiplos(int n, ArrayList<Integer> numerosRecebidos){
	
	
	ArrayList<Integer> numerosNaoMultiplosDeDois = new ArrayList<Integer>();

	for (int valorCorrente : numerosRecebidos) {
		if (valorCorrente == n) {
			numerosNaoMultiplosDeDois.add(n);
		}
		if (valorCorrente % n != 0) {
			numerosNaoMultiplosDeDois.add(valorCorrente);
		}
	}
	return numerosNaoMultiplosDeDois;
}

}