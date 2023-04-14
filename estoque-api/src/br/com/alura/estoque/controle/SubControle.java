package br.com.alura.estoque.controle;

import java.io.IOException;

public class SubControle  extends Controle{


    private SubControle() {
    }


    private SubControle(String s) {

    }


    public void metodoSubControle1(){
        System.out.println("Executando o metodoSubcontrole!");
    }


    private String metodoSubControle2(){
        System.out.println("executando o metodoSubcontrole2");

        return "retorno do método Subcontrole2";
    }



}
