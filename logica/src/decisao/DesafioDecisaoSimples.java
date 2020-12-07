package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Solicita o nome e a idade de uma pessoa.
		 * Sua aplicação deve informar se:
		 * ela é obrigada a votar
		 * ela é impossibilitada de votar
		 * o voto para ela é facultativo
		 */
		
		String eleitor = JOptionPane.showInputDialog("Eleitor");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		if (idade>=18 && idade<=70) {
			System.out.println(eleitor + ": Voto obrigatório");
		}
			else if (idade<16) {
				System.out.println(eleitor + ": Não vota");
			}
				else {
					System.out.println(eleitor + ": Voto facultativo");
				}
		
		
		
		
		
		
		
		
		
	}
	
}
