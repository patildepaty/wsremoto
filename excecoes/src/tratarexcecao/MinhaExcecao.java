package tratarexcecao;

public class MinhaExcecao {

	//m�todo static pq n�o tem atributo
	
	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto nulo";
		} else if (e instanceof NumberFormatException) {
			return "N�mero inv�lido";
		} else if (e instanceof ArrayIndexOutOfBoundsException){
			return "Vetor estourou";			
		} else {
			e.printStackTrace();
			return "Exce��o desconhecida";
		}
		
		
		
		
		
		
		
	} //fecha o metodo
	
	
	
} //fecha a classe
