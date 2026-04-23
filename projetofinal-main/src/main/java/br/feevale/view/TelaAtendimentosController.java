package br.feevale.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import br.feevale.App;
import br.feevale.Atendimento;

public class TelaAtendimentosController {

    @FXML
    private ListView<String> listaAtendimentos;

    @FXML
    private Button btnNovo;

    @FXML
    private Button btnAlterar;

    @FXML
    public void initialize() {
        carregarLista();
    }

    private void carregarLista() {
        listaAtendimentos.getItems().clear();

        for (Atendimento a : App.estabelecimento.getAtendimentos()) {
            String texto = "Atendimento #" + a.getNumeroAtendimento()
                    + " | Cliente: " + (a.getCliente() != null ? a.getCliente().getNome() : "Sem nome")
                    + " | Status: " + a.getPedido().getStatus();
            listaAtendimentos.getItems().add(texto);
        }
    }

    @FXML
    private void novoAtendimento() {
        try {
            App.setRoot("TelaAtendimento");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void abrirTelaStatus() {
        try {
            App.setRoot("TelaAlterarStatus");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
