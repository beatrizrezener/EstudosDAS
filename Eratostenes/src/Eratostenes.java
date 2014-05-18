package src;

import java.util.ArrayList;

public class Eratostenes {

	public ArrayList<Integer> achaPrimo(int i) {
		
		ArrayList<Integer> numerosRecebidos = new ArrayList<Integer>();
		
		for(int cont = 2 ; cont <= i ; cont ++){
		   numerosRecebidos.add(cont);
		}
		
		ArrayList<Integer>  numerosPrimos = new ArrayList<Integer> ();
		numerosPrimos.add(2);
		for(int valorCorrente : numerosRecebidos ){
			  
			if(valorCorrente%2 != 0 && valorCorrente != 9){
				  numerosPrimos.add(valorCorrente);
			  }
			  
		}
		return numerosPrimos;
	}

}
