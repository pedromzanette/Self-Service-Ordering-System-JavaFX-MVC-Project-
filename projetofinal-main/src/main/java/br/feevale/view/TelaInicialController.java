package br.feevale.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import br.feevale.App;

public class TelaInicialController {

    @FXML
    private Button btnPedido;

    @FXML
    public void initialize() {
        btnPedido.setOnAction(event -> irParaTelaAtendimento());
    }

    private void irParaTelaAtendimento() {
        try {
            App.setRoot("TelaAtendimento"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
