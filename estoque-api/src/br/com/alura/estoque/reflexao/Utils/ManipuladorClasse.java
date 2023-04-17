package br.com.alura.estoque.reflexao.Utils;

import java.lang.reflect.Constructor;

public class ManipuladorClasse {

    private final Class<?> classe;

    public ManipuladorClasse(Class<?> classe) {
    this.classe = classe;
    }

    public ManipuladorConstrutor getConstrutorPadrao() {
        try {
            Constructor<?> declaredConstructor = classe.getDeclaredConstructor();
            return new ManipuladorConstrutor(declaredConstructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }

    public ManipuladorObjeto criaInstancia() {
        Object instancia = getConstrutorPadrao().invoca();
        return new ManipuladorObjeto(instancia);
    }
}
