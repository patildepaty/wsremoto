package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * Game: adivinha��o
		 * Jogador1: vai digitar um n�mero inteiro
		 * Jogador2: vai ter que adivinhar o n�mero
		 * Quando o jogador 2 acertar, tem que mostrar parab�ns.
		 * 
		 * Plus:
		 * - Implemente uma ajuda da sua aplica��o. Se o jogador 2 estiver chutando alto, avise que o n�mero � mais baixo e vice-versa.
		 * - Quando o jogador 2 acertar, apresente a quantidade de vezes que ele utilizou.
		 */
		
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Qual foi o numero do jogador 1?"));
		byte qtde = 1;
		if (jogador1==jogador2) {
			JOptionPane.showMessageDialog(null,"Parab�ns, voc� acertou com de primeira!");
		} else {
			do {
			qtde = 1 + 1;
			if (jogador1>jogador2) {
			JOptionPane.showMessageDialog(null,"Est� muito baixo, tente mais alto");
			} else {
			JOptionPane.showMessageDialog(null,"Est� muito alto, tente mais baixo");
			}
			}while (JOptionPane.showConfirmDialog(
					null, //referencia para a pergunta => centraliza em rela��o ao monitor se deixar como null
					"Deseja tentar de novo?",
					"Pergunta",
					JOptionPane.YES_NO_OPTION)==0);
				}
		
		

		
	}

}
