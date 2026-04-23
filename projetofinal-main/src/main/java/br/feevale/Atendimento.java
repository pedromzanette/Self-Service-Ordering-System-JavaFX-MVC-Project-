package br.feevale;

import java.time.LocalDateTime;

public class Atendimento {

    private int numeroAtendimento;
    private Cliente cliente;
    private Pedido pedido;
    private LocalDateTime dataHora;

    public Atendimento(int numeroAtendimento, Cliente cliente, Pedido pedido) {
        this.numeroAtendimento = numeroAtendimento;
        this.cliente = cliente;
        this.pedido = pedido;
        this.dataHora = LocalDateTime.now();
    }

    public int getNumeroAtendimento() { return numeroAtendimento; }
    public Cliente getCliente() { return cliente; }
    public Pedido getPedido() { return pedido; }
    public LocalDateTime getDataHora() { return dataHora; }
}
