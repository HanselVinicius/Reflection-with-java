package br.com.alura.estoque.reflexao.Utils;

public class Reflexao {
    public ManipuladorClasse refleteClasse(String fqn) {

            Class<?> classe = getClasse(fqn);
            return new ManipuladorClasse(classe);

    }

    public Class<?> getClasse(String caminho) {
        try {
            Class<?> classe = Class.forName(caminho);
            return classe;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
