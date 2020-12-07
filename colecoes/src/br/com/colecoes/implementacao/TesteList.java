package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List lista = new ArrayList();              //ctrl + shift + o -> java.util
		//lista.add("DBA");
		//lista.add(15000);
		//lista.add(true);
		
		
		// se eu quiser utilizar o generic -> generalizar todo o tipo de dado
		
		List<String> lista = new ArrayList<String>(); 
		lista.add("ANALISTA");
		//lista.add(12); //não aceita
		lista.add("ESTAGIARIO");
		lista.add("DBA JR");
		lista.add("DBA SR");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(1);
		System.out.println("Segundo elemento removido: " + lista);
		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo " + (cont+1) + " é " + lista.get(cont));
		}
		
		
		/*Exemplo:
		ArrayList<String> lista2 = new ArrayList<String>(); 
		lista = new LinkedList(); 
		lista2 = new LinkedList(); //arraylist é classe filha de lista, POR ISSO não dá certo.
		Portanto, sempre criar pela pai e instanciar pela filha
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
