package br.com.alura.estoque;

import java.lang.reflect.InvocationTargetException;

public class Alurator {

	private String pacoteBase;

	public Alurator(String pacoteBase){
		this.pacoteBase = pacoteBase;
	}
	
	public Object executa(String url) {
		// TODO - processa a requisicao executando o metodo
		// da classe em questao

		String[] partesUrl = url.replaceFirst("/", "")
				.split("/");
		String nomeControle = Character.toUpperCase(partesUrl[0].charAt(0)) +
				partesUrl[0].substring(1) + "Controller";
		try {
			Class <?> classeControle = Class.forName(pacoteBase + nomeControle);
			Object instanciaControle = classeControle.getDeclaredConstructor().newInstance();

			System.out.println(instanciaControle);

		} catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
