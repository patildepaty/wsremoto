package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
	/*
	 * Sua aplicação irá pedir ano, mes e dia em variaveis inteiras separadamente
	 * 
	 * Ano => deve ser maior que 1900
	 * dia => deve estar entre 1 e 31
	 * mes => deve estar entre 1 e 12
	 * 
	 * No final, exibe data dia/mes/ano
	 */

		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));
		while (ano<=1900) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Ano deve ser > que 1900"));
		}
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Mes deve estar entre 1 e 12"));
		}
		
		if (mes==2) {
			while (dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Fevereiro possui apenas 29 dias. Digite o dia"));
			}
		} else if (mes==4 || mes==6 || mes ==9 || mes==11) {
			while (dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Este mês possui apenas 30 dias. Digite o dia"));
			}
		} else {
			while (dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Este mês possui apenas 31 dias. Digite o dia"));
		}
		}
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		
	}

}
