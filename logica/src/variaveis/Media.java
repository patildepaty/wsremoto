package variaveis;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina: ");
		double primeiro = Double.parseDouble(JOptionPane.showInputDialog("Nota do primeiro semestre:"));
		double segundo = Double.parseDouble(JOptionPane.showInputDialog("Nota do segundo semestre:"));
		double media = (primeiro + segundo) / 2;
		System.out.println("Disciplina: " + disciplina + "\n" + "M�dia: " + media);
		

	}

}
 