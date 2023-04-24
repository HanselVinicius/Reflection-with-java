package br.com.alura.estoque.modelo;

import br.com.alura.estoque.controle.anotacao.NomeTagXml;

@NomeTagXml(value = "product")
public class Produto {

    @NomeTagXml(value = "name")

    private String nome;
    @NomeTagXml(value = "value")

    private double valor;
    @NomeTagXml(value = "brand")

    private String marca;

    public Produto(String nome, double valor, String marca) {
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + valor + ", marca=" + marca + "]";
    }
}
