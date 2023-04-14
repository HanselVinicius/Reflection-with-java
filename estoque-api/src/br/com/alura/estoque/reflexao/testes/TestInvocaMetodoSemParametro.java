package br.com.alura.estoque.reflexao.testes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestInvocaMetodoSemParametro {


    public static void main(String[] args) throws Exception {
        Class<?> subControleClasse = Class.forName("br.com.alura.estoque.controle.SubControle");

        Constructor<?> constructorPadrao = subControleClasse.getDeclaredConstructor();
        constructorPadrao.setAccessible(true);

        Object subControle = constructorPadrao.newInstance();

          for (Method m : subControleClasse.getMethods()){
              System.out.println(m);
          }

        System.out.println("\n");


        for (Method m : subControleClasse.getDeclaredMethods()){
            System.out.println(m);
        }


        Method m = subControleClasse.getDeclaredMethod("metodoSubControle2");
        m.setAccessible(true);
        Object retorno = m.invoke(subControle);

        System.out.println(retorno);

    }




}
