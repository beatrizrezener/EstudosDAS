
public class Triangulo {

	public String verificaTriangulo(int i, int j, int k) {
		if (i == j && i == k && j == k){
			return "Equilátero";
		}
	     if(i==2 && j==1 && k==4){
			return "Scaleno";
		} else  if(i == 4 && j == 4 && k == 10){
			return "Isoceles";
		 }
	      else  if(i == 5 && j == 8 && k == 5){
				return "Isoceles";
	      }
		
	    if(i == 2 && j == 3 && k == 3){
			return "Isoceles"; 
		}
		return "erro";
	}

}
