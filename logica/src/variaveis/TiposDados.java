package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		//Criar uma variável: <tipo de dado> <nome da variável> - <valor>
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		/*Tipos numéridos = tipos primitivos
		 *Classes Wrappers: são as classes que apoiam os tipos primitivos.
		 * Exemplos:
		 * Integer => int
		 * Double => double
		 * Float => float
		 */
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
		System.out.println("Nome  : " + nome);
		System.out.println("Altura: " + altura);
		System.out.println("Peso  : " + peso);
		System.out.println("Idade : " + idade);
		double imc = peso / (altura * altura);
		System.out.println("IMC   : " + imc);
		
		
		
		
		
		
		
		
		
		
	}

}
