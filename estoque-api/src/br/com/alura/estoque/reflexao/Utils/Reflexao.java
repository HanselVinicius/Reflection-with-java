package br.com.alura.estoque.reflexao.Utils;

public class Reflexao {
    public ManipuladorClasse refleteClasse(String fqn) {
        try {
            Class<?> classe = Class.forName(fqn);
            return new ManipuladorClasse(classe);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
