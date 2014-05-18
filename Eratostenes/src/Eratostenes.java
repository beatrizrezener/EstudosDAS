package src;

import java.util.ArrayList;

public class Eratostenes {

	public ArrayList<Integer> achaPrimo(int i) {
		
		ArrayList<Integer> numerosRecebidos = new ArrayList<Integer>();
		
		for(int cont : numerosRecebidos){
		   numerosRecebidos.add(cont);
		}
		
		ArrayList numerosPrimos = new ArrayList();
		numerosPrimos.add(2);
		for(int valorCorrente : numerosRecebidos ){
			  if(valorCorrente%2 != 0 ){
				  numerosPrimos.add(valorCorrente);
			  }
		}
		
		
	/*	if(i==2){
			numerosRecebidos.add(2);
		}
		else if (i==4) {
			numerosRecebidos.add(2);
			numerosRecebidos.add(3);
		} else if(i == 5 || i==6){
			numerosRecebidos.add(2);
			numerosRecebidos.add(3);
			numerosRecebidos.add(5);
		} else if(i == 7){
			numerosRecebidos.add(2);
			numerosRecebidos.add(3);
			numerosRecebidos.add(5);
			numerosRecebidos.add(7);
		}
		*/
		return numerosPrimos;
	}

}
