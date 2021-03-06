package br.com.elevadorjava.modelo;

public class Elevador {

	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private byte capacidadePessoas;
	private byte qtdeAtual;
	private short andarAtual;
	
	public void definirValores (String pNome, short pAndarMax, short pAndarMin, byte pCapacidade) {
		nome = pNome.toUpperCase();
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapacidade;
	}
	
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	
	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			}
	}
	
	public String exibirDados() {
		return
				"Elevador: " + nome + "\n" +
				"Andar Atual: " + andarAtual + "\n" +
				"Qtde de pessoas: " + qtdeAtual;
		
	}
	
	public void entrar(byte pQtde) {
		byte total = (byte) (qtdeAtual + pQtde);
		if (total<=capacidadePessoas) {
			qtdeAtual+=pQtde;
		}
	}
	
	public void sair(byte pQtde) {
		byte resultado = (byte) (qtdeAtual - pQtde);
		if (resultado >=0) {
			qtdeAtual+=pQtde;
		}
	}
	
	public void descer(short andar) {
		if (andar>=andarMinimo) {
			andarAtual=andar;
		}
	}
	
	public void subir(short andar) {
		if (andar<=andarMaximo) {
			andarAtual=andar;
		}
	}
	
	
	
	
	
	
	
	
	
}
	
