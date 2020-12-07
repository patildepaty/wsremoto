package br.com.bankofoz.beans;

public class Poupanca extends Conta{

	private float rendimento;

	//metodos especificos
	
	
	public float verificarSaldo() {
		return super.getSaldo();
	}
	
	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo() + rendimento);
		rendimento=0;
	}
	
	//metodos normais	
	public void setAll(short numero, float digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "," + super.toString();
	}

	public Poupanca() {
		super();
	}

	public Poupanca(short numero, float digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	
}
