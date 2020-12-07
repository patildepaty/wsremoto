package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {
		/*
	Monte um programa que solicite a idade e o nome das pessoas. Ao terminar, o programa deverá exibir a pessoa mais velha, a pessoa mais nova, a quantidade de pessoas maiores de idade e a média entre as idades que foram digitadas.
=> laço que vai solicitar os dados (nome e idade) 
=> conta quantas pessoas são maiores de idade
=> Média das idades que foram digitadas
=> Exibir o nome e a idade da pessoa mais experiente
=> Exibir o nome e a idade da pessoa mais jovem
		 */
		
		String nome = "";
		short idadeAnterior=0;
		short idadeExperiente = 0;
		short idadeJovem = 0;
		short idade = 0;
		int qtdeDePessoas = 0;
		String experiente = "";
		String jovem = "";
		int maiores=0;
		int somaidade=0;
			
		do {
			nome = JOptionPane.showInputDialog("Informe o nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade"));
			somaidade = idade+somaidade; //somaidade+=idade
			qtdeDePessoas++;
			if (idade>=18) {
				maiores++;
			}
			if (idade>idadeExperiente) {
				experiente=nome;
				idadeExperiente=idade;						
			}
			if (idade<idadeJovem || qtdeDePessoas==1) {
				jovem=nome;
				idadeJovem=idade;						
			}
		} while (JOptionPane.showConfirmDialog(null,"Deseja inserir mais um nome?","Pergunta",JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Maiores de idade: " + maiores);
		System.out.println("Média das Idades: " + (somaidade/qtdeDePessoas));
		System.out.println("Soma das Idades: " + somaidade);
		System.out.println("Mais experiente: " + experiente + " com " + idadeExperiente + " anos");
		System.out.println("Mais jovem: " + jovem + " com " + idadeJovem + " anos");

		/*
		 * float media = somaidade/qtdeDePessoas;
		 * System.out.printf("Média: %.2f\n", media); // f significa numeros reais e .2 é qtde de casas decimais
		 */

		
		
		
		
		
		
		
		
	}

}
