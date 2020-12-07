package br.com.concessionariarubinho.modelo;

public class CarroFormula1 {

	private String cor;
	private float valor;
	private String escuderia;
	private float velocidade;
	private boolean status;
	
	// Sintaxe método:
	// <modificador> <tipo do retorno> <nome do metodo> (<tipoParametro> <NomeParametro>) {
	
	public float retornarVelocidade() {
		return velocidade;
	}
	
	public void brecar () {
		if (status==true) {
			velocidade=0;
		}
	}
	
	public void acelerar(float param) {
		if (param>0 && status==true) {
			velocidade+=param;
		}
	}
	
	public String desligar() {
		if (status==false) {
			return "Carro já estava desligado!";
			}
		status=false;
		velocidade=0;
		return "Carro desligado!";
	}
		
	public String ligar() {
		if (status==true) {
			return "Carro já estava ligado!";
		}
		status=true;
				return "Carro ligado agora";
	}
	
	public float retornarValor() {
		return valor;
	}
	public String retornarCor() {
		return cor;
	}
	public String retornarEscuderia() {
		return escuderia;
	}
	
	public void preencherEscuderia(String param) {
		escuderia = param.toUpperCase();
	}
	public void preencherCor(String param) {
		cor = param.toUpperCase();
	}
	public void preencherValor(float param) {
		if (param>0) {
			valor = param;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
