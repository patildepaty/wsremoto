package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("PMO");
		lista.add("DEV");
		lista.add("DBA");
		System.out.println(lista);
		//System.out.println(lista.get(0)); // n�o existe porque n�o possui um �ndice
		
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
			
		}
		
		
		
		
		
		
		
	}
}
