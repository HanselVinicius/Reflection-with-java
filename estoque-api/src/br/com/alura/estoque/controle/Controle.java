package br.com.alura.estoque.controle;

import java.io.IOException;
import java.util.List;

public class Controle {

	public Controle(){}

	public Controle(String s) {

	}

	private  Controle (String s , String t){
	}


	public void metodoControle2(String p1){
		System.out.println("parametro obtido" + p1);
	}

	public void metodoControle2(String p1,String p2){
		System.out.println("parametros obtidos: " + p1 + "  " +p2);
	}

	public void metodoControle2(String p1,Integer p2){
		System.out.println("parametros obtidos: " + p1 + "  " +p2);
	}



	private List<String> lista = List.of("item 1", "item 2", "item 3");
	
	public List<String> getLista() {
		return lista;
	}


	private void metodoControle1(){}

}
