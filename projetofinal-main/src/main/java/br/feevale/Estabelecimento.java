package br.feevale;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {

    private List<Atendimento> atendimentos = new ArrayList<>();
    private int contador = 1;

    public int gerarNumero() {
        return contador++;
    }

    public Atendimento registrarAtendimento(Cliente cliente, Pedido pedido) {
        int numero = gerarNumero();
        Atendimento atendimento = new Atendimento(numero, cliente, pedido);
        atendimentos.add(atendimento);
        return atendimento;
    }

    public boolean atualizarStatus(int numeroAtendimento, StatusPedido novo) {
        for (Atendimento atendimento : atendimentos) {
            if (atendimento.getNumeroAtendimento() == numeroAtendimento) {
                atendimento.getPedido().setStatus(novo);
                return true;
            }
        }
        return false;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}
