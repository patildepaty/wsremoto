package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class implementarAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setCpf(JOptionPane.showInputDialog("CPF"));
		aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("CPF.: " + aluno.getCpf());
		System.out.println("RM..: " + aluno.getRm());
		

		
		
		
		
		
	}

}
