
public class Triangulo {

	public String retornaTipoTriangulo(int i, int j, int k) {
		if (i == j && i == k && j == k){
			return "Equilátero";
		}
	     if(i != j && j != k  && k !=i){
			return "Scaleno";
		} 
	     
	     if(i == j && k != j){
			return "Isoceles";
		 }
	     
	      else if(i == k && k != j){
				return "Isoceles";
	     }
	     
	      else if(j == k &&  i != k){
			return "Isoceles"; 
		}
		return "erro";
	}

}
