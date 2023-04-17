package br.com.alura.estoque.reflexao.testes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TesteInvocaMetodoComParametro  {



    public static void main(String[] args) throws Exception {
        Class<?> controleClasse =
                Class.forName("br.com.alura.estoque.controle.Controle");

        Constructor<?> constructorPadrao = controleClasse.getDeclaredConstructor();

        Object controle = constructorPadrao.newInstance();

        Method m = controleClasse.getDeclaredMethod("metodoControle2", String.class,Integer.class);

        Object retorno = m.invoke(controle,"Pintassilgo", 10);

        System.out.println();
    }





}
