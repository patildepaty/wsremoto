package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Curso;

public class implementarCurso {
	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setAll(
				JOptionPane.showInputDialog("Descricao"), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor")), 
				Short.parseShort(JOptionPane.showInputDialog("Carga Horaria")), 
				JOptionPane.showInputDialog("Sigla"), 
				Integer.parseInt(JOptionPane.showInputDialog("ID")), 
				Integer.parseInt(JOptionPane.showInputDialog("Duração"))
				);
		System.out.println(curso.getAll());

		
		//EXTRA
		System.out.println("Valor com 10% de desconto: " + curso.getPromocao());
		System.out.println(curso.getValor());
		float porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Qual é o desconto?"));
		System.out.println("Valor Promocao: " + curso.getPromocao(porcentagem));
		System.out.println(curso.getValor());
		curso.ajustarValor(20);
		
		
		
		
		
	}
}
