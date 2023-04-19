package br.com.alura.estoque.reflexao.testes;

import br.com.alura.estoque.modelo.Produto;

import java.lang.reflect.Field;

public class TesteManipulaAtributos {

    public static void main(String[] args) throws  Exception{
        Object produto = new Produto("Produto 1",20,"Marca 1");
        Class<?> classe = produto.getClass();


        for (Field atributo : classe.getDeclaredFields()){
            atributo.setAccessible(true);
            System.out.println(atributo.getName() + ": " +atributo.get(produto));
        }

    }

}
