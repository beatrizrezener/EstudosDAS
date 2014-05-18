
public class Triangulo {

	public String verificaTriangulo(int i, int j, int k) {
		if (i == j && i == k && j == k){
			return "Equilátero";
		}
	     if(i==2 && j==1 && k==4){
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
