package br.feevale;

public class Lanche extends Item {
    private String tipo;
    private String tamanho;

    public Lanche(String nome, double preco, String tipo, String tamanho){
        super(nome, preco);
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public String getTipo() { return tipo; }
    public String getTamanho() { return tamanho; }

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setTamanho (String tamanho) { this.tamanho = tamanho; }
}
