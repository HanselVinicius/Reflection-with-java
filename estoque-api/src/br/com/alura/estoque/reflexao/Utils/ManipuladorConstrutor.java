package br.com.alura.estoque.reflexao.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManipuladorConstrutor {
    private final Constructor<?> constructor;

    public ManipuladorConstrutor(Constructor<?> constructor) {
        this.constructor = constructor;
    }


    public Object invoca() {
        try {
            return constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException  e) {
            throw new RuntimeException(e);
        } catch ( InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro no construtor", e.getTargetException());
        }
    }
}
