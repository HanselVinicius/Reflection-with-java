package br.com.alura.estoque;

import br.com.alura.estoque.protocolo.Request;
import br.com.alura.estoque.reflexao.Utils.Reflexao;

import java.lang.reflect.InvocationTargetException;

public class Alurator {

	private final String pacoteBase;

	public Alurator(String pacoteBase){
		this.pacoteBase = pacoteBase;
	}
	
	public Object executa(String url) {
		// TODO - processa a requisicao executando o metodo
		// da classe em questao


		Request request = new Request(url);

		String nomeControle = request.getNomeControle();

			Object instanciaControle = new Reflexao().refleteClasse(pacoteBase + nomeControle)
					.getConstrutorPadrao()
					.invoca();

			System.out.println(instanciaControle.toString());


		return null;
	}
}
