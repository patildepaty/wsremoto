package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Solicita o nome e a idade de uma pessoa.
		 * Sua aplica��o deve informar se:
		 * ela � obrigada a votar
		 * ela � impossibilitada de votar
		 * o voto para ela � facultativo
		 */
		
		String eleitor = JOptionPane.showInputDialog("Eleitor");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		if (idade>=18 && idade<=70) {
			System.out.println(eleitor + ": Voto obrigat�rio");
		}
			else if (idade<16) {
				System.out.println(eleitor + ": N�o vota");
			}
				else {
					System.out.println(eleitor + ": Voto facultativo");
				}
		
		
		
		
		
		
		
		
		
	}
	
}
