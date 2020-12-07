package tratarexcecao;

public class MinhaExcecao {

	//método static pq não tem atributo
	
	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto nulo";
		} else if (e instanceof NumberFormatException) {
			return "Número inválido";
		} else if (e instanceof ArrayIndexOutOfBoundsException){
			return "Vetor estourou";			
		} else {
			e.printStackTrace();
			return "Exceção desconhecida";
		}
		
		
		
		
		
		
		
	} //fecha o metodo
	
	
	
} //fecha a classe
