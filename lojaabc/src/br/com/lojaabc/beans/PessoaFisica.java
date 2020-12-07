package br.com.lojaabc.beans;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private String rg;
	private String nascimento;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public PessoaFisica(int cliente, String nome, String email, boolean especial, String cpf, String rg,
			String nascimento) {
		super(cliente, nome, email, especial);
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	public PessoaFisica() {
		super();
	}
	

	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", nascimento=" + nascimento + super.toString();
		}
	
	
	public void SetAll(int cliente, String nome, String email, boolean especial, String cpf, String rg,
			String nascimento) {
		super.setAll(cliente, nome, email, especial);
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	
	

	

	
	
	
	
	
	
	
	
	
}
