package br.com.lojaabc.implementacao;

import br.com.lojaabc.beans.Cliente;
import br.com.lojaabc.beans.Fabricante;
import br.com.lojaabc.beans.Produto;
import br.com.lojaabc.beans.Venda;
import br.com.lojaabc.util.Magic;

public class implementarVenda {

	public static void main(String[] args) {
		Venda venda = new Venda(
				Magic.i("Nota fiscal"),
				new Produto (
						Magic.i("C�digo"),
						Magic.s("Descri��o"),
						Magic.f("Valor Compra"),
						Magic.f("Valor Venda"),
						Magic.i("Qtde"),
						new Fabricante (
								Magic.s("CNPJ"),
								Magic.s("Raz�o Social"),
								Magic.s("Fone")								
								)
						
						),
				new Cliente (
						Magic.i("C�digo do Cliente"),
						Magic.s("Nome do Cliente"),
						Magic.s("Email"),
						Magic.b("� especial?")			
						
						),
				Magic.i("Qtde"),
				Magic.f("Total")
				
				
				
				);
		
		System.out.println(venda.toString());

	}

}
