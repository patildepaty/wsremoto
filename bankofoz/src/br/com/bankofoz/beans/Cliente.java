package br.com.bankofoz.beans;

public class Cliente {

	private int cliente;
	private String nome;
	private String email;
	private boolean especial;
	
	
	public Cliente(int cliente, String nome, String email, boolean especial) {
		super();
		this.cliente = cliente;
		this.nome = nome;
		this.email = email;
		this.especial = especial;
	}

	public Cliente() {
		super();
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public void setAll(int cliente, String nome, String email, boolean especial) {
		this.cliente = cliente;
		this.nome = nome;
		this.email = email;
		this.especial = especial;
	}

	public String toString() {
		return "Cliente [cliente=" + cliente + ", nome=" + nome + ", email=" + email + ", especial=" + especial + "]";
	}
	
	public String getUsuario() {
		if (email.contains("@")==true) {
		return email.substring(0,email.indexOf("@"));			
		}
		return email;
				
	}
	public String getPrimeiroNome() {
		if (nome.contains(" ")==true) {
		return nome.substring(0,nome.indexOf(" "));
		}
		return nome;
	}


	
	
	
	
	
	
}
