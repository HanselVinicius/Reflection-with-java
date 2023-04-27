package br.com.alura.estoque.reflexao.testes;

import br.com.alura.estoque.controle.anotacao.NomeTagXml;
import br.com.alura.estoque.modelo.Produto;

public class TesteManiupulaAnotacao {
    public static void main(String[] args) {
        Produto produto= new Produto("Produto 1",20.0,"Marca 1");
        Class<?> classe = produto.getClass();


        System.out.println(classe.getDeclaredAnnotation(NomeTagXml.class).value());





    }
}
