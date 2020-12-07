package br.com.lojaabc.beans;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	private String contato;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(int cliente, String nome, String email, boolean especial, String cnpj, String contato) {
		super(cliente, nome, email, especial);
		this.cnpj = cnpj;
		this.contato = contato;
	}
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", contato=" + contato + super.getNome(); //super. significa que está pegando da classe pai. Não é necessario caso o metodo nao exista na classe filha, pois pega automaticamente da classe pai
	}
	
	
	public void setAll(int cliente, String nome, String email, boolean especial, String cnpj, String contato) {
		super.setAll(cliente, nome, email, especial);
		this.cnpj = cnpj;
		this.contato = contato;
	}
	
	
	
	
	
	
	
	
	

}
