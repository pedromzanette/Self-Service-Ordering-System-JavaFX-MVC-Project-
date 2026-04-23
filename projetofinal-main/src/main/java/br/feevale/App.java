package br.feevale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    public static Estabelecimento estabelecimento = new Estabelecimento();

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("TelaInicial"), 430, 800);
        stage.setScene(scene);
        stage.setTitle("Campus Brew Café");
        stage.show();
        stage.setResizable(false);
        stage.setMinWidth(430);
        stage.setMinHeight(800);
        stage.setMaxWidth(430);
        stage.setMaxHeight(800);
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static javafx.scene.Parent loadFXML(String fxml) throws IOException {
        
        return FXMLLoader.load(App.class.getResource("view/" + fxml + ".fxml"));
    }

    public static void main(String[] args) {
        launch();
    }
}
