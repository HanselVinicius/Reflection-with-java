package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class TestInstanciaObjeto {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

       // url -> /controle/lista ou /produti/lista
        Class<Controle> controleClasse1 = Controle.class;


        Controle controle = new Controle();
        Class<? extends Controle> controleClass2 = controle.getClass();


        Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");

        Object objetoControle = controleClasse1.newInstance();

        Object outroObjControle = controleClasse3.newInstance();

        System.out.println(outroObjControle instanceof Controle);

        System.out.println(objetoControle instanceof Controle);

    }
}
