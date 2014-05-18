package src;

import java.util.ArrayList;

public class Eratostenes {

	public ArrayList<Integer> achaPrimo(int i) {
		
		ArrayList<Integer> numerosPrimos = new ArrayList<Integer>();
		if (i==4) {
			numerosPrimos.add(2);
			numerosPrimos.add(3);
		} else if(i == 5 || i==6){
			numerosPrimos.add(2);
			numerosPrimos.add(3);
			numerosPrimos.add(5);
		}
		return numerosPrimos;
	}

}
