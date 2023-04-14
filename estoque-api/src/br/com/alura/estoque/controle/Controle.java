package br.com.alura.estoque.controle;

import java.io.IOException;
import java.util.List;

public class Controle {

	public Controle(){}

	public Controle(String s) {

	}

	private  Controle (String s , String t){
	}

	private List<String> lista = List.of("item 1", "item 2", "item 3");
	
	public List<String> getLista() {
		return lista;
	}


	private void metodoControle1(){}

}
