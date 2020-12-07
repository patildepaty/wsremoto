package br.com.colecoes.beans;

public class Cargo implements Comparable<Cargo>{ //quando da um add metodo, gera o metodo que est� por ultimo

	private String nome;
	private String nivel;
	private float salario;
	
	
	
	public void setAll(String nome, String nivel, float salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	public Cargo() {
		super();
	}
	public Cargo(String nome, String nivel, float salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Cargo [nome=" + nome + ", nivel=" + nivel + ", salario=" + salario + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public int compareTo(Cargo outro) {           //retorna 0, 1 ou -1
		if (salario<outro.salario) {
			return -1;
		} else if (salario>outro.salario) {
			return 1;
		}
		return 0;
	}
	
	
	
}