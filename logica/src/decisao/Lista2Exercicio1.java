package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Qtde de diárias"));
		float taxa = (float) 5.5;
		if (diarias==15) {
			taxa = 6;
		} else if (diarias < 15){
			taxa = 8;
		} 
		System.out.println("Sua conta é de R$ " + ((80+taxa) * diarias));
		
		
		
		
		
		
	}

}
