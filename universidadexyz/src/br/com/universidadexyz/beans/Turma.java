package br.com.universidadexyz.beans;

public class Turma {

	private int numero;
	private Aluno aluno;
	private Professor professor;
	private Curso curso;
	private int periodo;
	private int sala;
	
		public Turma() {
		super();
	}

		public Turma(int numero, Aluno aluno, Professor professor, Curso curso, int periodo, int sala) {
			super();
			this.numero = numero;
			this.aluno = aluno;
			this.professor = professor;
			this.curso = curso;
			this.periodo = periodo;
			this.sala = sala;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public Aluno getAluno() {
			return aluno;
		}

		public void setAluno(Aluno aluno) {
			this.aluno = aluno;
		}

		public Professor getProfessor() {
			return professor;
		}

		public void setProfessor(Professor professor) {
			this.professor = professor;
		}

		public Curso getCurso() {
			return curso;
		}

		public void setCurso(Curso curso) {
			this.curso = curso;
		}

		public int getPeriodo() {
			return periodo;
		}

		public void setPeriodo(int periodo) {
			this.periodo = periodo;
		}

		public int getSala() {
			return sala;
		}

		public void setSala(int sala) {
			this.sala = sala;
		}

		public void setAll(int numero, Aluno aluno, Professor professor, Curso curso, int periodo, int sala) {
			this.numero = numero;
			this.aluno = aluno;
			this.professor = professor;
			this.curso = curso;
			this.periodo = periodo;
			this.sala = sala;
		}

		public String toString() {
			return "Turma [numero=" + numero + ", aluno=" + aluno + ", professor=" + professor + ", curso=" + curso
					+ ", periodo=" + periodo + ", sala=" + sala + "]";
		}
		
		
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
