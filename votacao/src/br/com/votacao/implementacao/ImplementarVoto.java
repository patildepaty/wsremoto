package br.com.votacao.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;
import br.com.votacao.util.Magic;

public class ImplementarVoto {

	public static void main(String[] args) {
		
		List<Voto> lista = new ArrayList<Voto>();
		Urna urna = new Urna();
		urna.setCidade(Magic.s("Cidade"));
		urna.setSecao(Magic.i("Seção"));
		urna.setZona(Magic.i("Zona"));
		urna.setVotos(lista);
		
		
	do {
		lista.add(new Voto(
				new Candidato(
						Magic.s("Candidato"),
						Magic.i("Número do Candidato"),
						Magic.s("Cargo"),
						Magic.s("Partido")					
						),
				new Eleitor(
						Magic.s("Eleitor"),
						Magic.i("Título"),
						Magic.b("Ativo?")					
						),
				Magic.b("Primeiro Turno?")
				));
		
		
	} while (Magic.b("Continuar?")==true);
		
	
	//System.out.println(urna.toString());
	System.out.println("Cidade: " + urna.getCidade());
	System.out.println("Seção/Zona: " + urna.getSecao() + "/" + urna.getZona());
	System.out.println("Votos: ");
	for (Voto obj : urna.getVotos()) {
		System.out.println("===============================");
		System.out.println("Nome do candidato: " + obj.getCandidato().getNome());
		System.out.println("Nome do eleitor: " + obj.getEleitor().getNome());
		System.out.println("Primeiro Turno? " + obj.isPrimeiroTurno());
	}
		


	
	
	
	
	
	
	
	
	
	
	
	
	}
}
