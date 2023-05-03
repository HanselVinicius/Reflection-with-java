package br.com.alura.estoque;

import br.com.alura.estoque.Ioc.ContainerIoC;
import br.com.alura.estoque.conversor.ConversorXML;
import br.com.alura.estoque.dao.ProdutoDao;
import br.com.alura.estoque.dao.ProdutoDaoMock;
import br.com.alura.estoque.protocolo.Request;
import br.com.alura.estoque.reflexao.Utils.ManipuladorObjeto;
import br.com.alura.estoque.reflexao.Utils.Reflexao;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class Alurator {

	private final String pacoteBase;
	private ContainerIoC container;

	public Alurator(String pacoteBase){
		this.pacoteBase = pacoteBase;
		this.container = new ContainerIoC();
	}
	
	public Object executa(String url) {
		// TODO - processa a requisicao executando o metodo
		// da classe em questao


		Request request = new Request(url);

		String nomeControle = request.getNomeControle();
		String nomeMetodo = request.getNomeMetodo();
		Map<String, Object> queryParams = request.getQueryParams();


		Class<?> classeControle = new Reflexao().getClasse(pacoteBase + nomeControle);
		Object instanciaControle = container.getInstancia(classeControle);
		Object retorna = new ManipuladorObjeto(instanciaControle)
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

	public <T, K extends T> void registra(Class<T> tipoFonte, Class<K> tipoDestino) {
		container.registra(tipoFonte,tipoDestino);
	}
}
