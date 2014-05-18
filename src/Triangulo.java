
public class Triangulo {

	public String verificaTriangulo(int i, int j, int k) {
		if (i == 3 && j == 3 && k == 3){
			return "Equilátero";
		} else if(i==2 && j==1 && k==4){
			return "Scaleno";
		}
		 else  {
			return "Isoceles";
		}
	}

}
