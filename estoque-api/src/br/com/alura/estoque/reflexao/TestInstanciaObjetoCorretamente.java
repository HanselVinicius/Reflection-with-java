package br.com.alura.estoque.reflexao;

import br.com.alura.estoque.controle.SubControle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestInstanciaObjetoCorretamente {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SubControle> subControleClass1 = SubControle.class;


        Class<?> subControleClass2 = Class.forName("br.com.alura.estoque.controle.SubControle");


        Class<?> controleClass1 = Class.forName("br.com.alura.estoque.controle.Controle");

        controleClass1.getDeclaredConstructor().newInstance();



//        Constructor<SubControle> constructorSubControle =
//                subControleClass1.getDeclaredConstructor();
//
//
//        System.out.println(constructorSubControle);
//
//        constructorSubControle.setAccessible(true);
//        Object subControle = constructorSubControle.newInstance();
//
//        System.out.println(subControle);
    }

}
