package src;

public class Ranger {

	public String getIntervalo(String range) {
	
		Integer inicio = Integer.parseInt(range.substring(1,2));
		Integer fim = Integer.parseInt(range.substring(3,4));
		
		String primeiraPosicao = range.substring(0,1);
		String ultimaPosicao = range.substring( (range.length()-1), range.length());
		
		if(primeiraPosicao.equals("(") && ultimaPosicao.equals(")")){
			
			String result= "";
			for(Integer cont=inicio+1; cont < fim; cont++){
			  	result += cont.toString();
			}
			return result;
			
		} else if(primeiraPosicao.equals("[") && ultimaPosicao.equals("]")){
			
			String result= "";
			for(Integer cont=inicio; cont <= fim; cont++){
			  	result += cont.toString();
			}
			
			return result;
		} else if(primeiraPosicao.equals("[") && ultimaPosicao.equals(")")){
			
			String result= "";
			for(Integer cont=inicio; cont < fim; cont++){
				result += cont.toString();
			}
			
			return result;
		}
		
		return null;
	}
}
