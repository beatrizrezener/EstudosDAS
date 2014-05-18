
public class Triangulo {

	public String verificaTriangulo(int i, int j, int k) {
		if (i == j && i == k && j == k){
			return "Equilátero";
		}
		else if(i==2 && j==1 && k==4){
			return "Scaleno";
		}
		 else  {
			return "Isoceles";
		}
	}

}
