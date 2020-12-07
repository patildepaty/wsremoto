package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class implementarProfessor {

	public static void main(String[] args) {

		Professor p = new Professor();
		p.setApelido("1berto");
		p.setId(709);
		p.setFormacao("Ms");
		p.setValorHora(10);
		
		Endereco e = new Endereco(); //Endereço é um objeto, por isso preciso instanciar
		p.setEndereco(e);
		e.setLogradouro("RUA LAGO DE PEDRA");
		e.setNumero("44");
		e.setBairro("PIMENTAS");
		e.setCidade("GUARULHOS");
		e.setUf("SP");
		e.setCep("12345-123");
		
		System.out.println(p.getApelido());
		System.out.println(p.getFormacao());
		System.out.println(p.getEndereco().getBairro());
		
		
		
		
		
		
		
		
		
		

	}

}
