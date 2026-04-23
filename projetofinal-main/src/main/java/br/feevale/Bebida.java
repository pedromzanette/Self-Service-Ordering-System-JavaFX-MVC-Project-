package br.feevale;

public class Bebida extends Item {

    private String sabor;
    private String tamanho;

    public Bebida(String nome, double preco, String sabor, String tamanho){
        super(nome, preco);
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public String getSabor() { return sabor; }
    public String getTamanho() { return tamanho; }

    public void setTamanho(String tamanho) { this.tamanho = tamanho; }
    public void setSabor(String sabor) { this.sabor = sabor; }
}
