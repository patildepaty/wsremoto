package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Aluno;
import br.com.universidadexyz.beans.Curso;
import br.com.universidadexyz.beans.Professor;
import br.com.universidadexyz.beans.Turma;
import br.com.universidadexyz.util.Magic;

public class implementarTurmaCorrecao {

	public static void main(String[] args) {
		

	Turma turma = new Turma(
			Magic.i("Numero"),
			new Aluno(
					Magic.i("RM"),
					Magic.s("Nome"),
					Magic.s("CPF")
					),
			new Professor(
					
					),
			new Curso(
					
					),
			Magic.i("Periodo"),
			Magic.i("Sala")
			);
	
	
	System.out.println(turma.toString());
}
}
