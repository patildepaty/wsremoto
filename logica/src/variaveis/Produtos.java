package variaveis;

import javax.swing.JOptionPane;

public class Produtos {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto");
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Qtde"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		// Cast � uma convers�o entre dados do mesmo tipo, MAS com tamanhos diferentes
		int numero = 10;
		qtde = (short) numero;
		
	}

}
