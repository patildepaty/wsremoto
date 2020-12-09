package br.com.votacao.util;

import javax.swing.JOptionPane;

public class Magic {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toLowerCase();
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static boolean b(String msg) {
		if (JOptionPane.showConfirmDialog(null,  msg, "Titulo",JOptionPane.YES_NO_OPTION)==0) {
			return true;
		}
		return false;
	}
	
	
	

}


//static não tem nenhum vínculo com atributo. Por isso, posso chamar direto sem instanciar. 