package br.com.alura.estoque;

import br.com.alura.estoque.conversor.ConversorXML;
import br.com.alura.estoque.protocolo.Request;
import br.com.alura.estoque.reflexao.Utils.Reflexao;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

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
		String nomeMetodo = request.getNomeMetodo();
		Map<String, Object> queryParams = request.getQueryParams();


		Object retorna = new Reflexao()
					.refleteClasse(pacoteBase + nomeControle)
							.criaInstancia()
									.getMetodo(nomeMetodo,queryParams)
				.comTratamentoDeExecao((metodo, ex ) ->{
					System.out.println("Erro no Método " +metodo.getName() + " da classe "
							+ metodo.getDeclaringClass() + "\n\n");
					throw new RuntimeException("erro no método");
				})
											.invoca();


		retorna = new ConversorXML().converte(retorna);

		return retorna;
	}
}
