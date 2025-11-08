package br.com.padaria.bakerysystem.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        // Mensagem no console (opcional, mas bom para debug)
        System.out.println("Carregando tela principal...");

        String fxmlPath = "/br/com/padaria/bakerysystem/view/MainView.fxml";

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlPath));

        // O fxmlLoader.load() constrói a interface (VBox, botões, etc.)
        Scene scene = new Scene(fxmlLoader.load(), 400, 450); // Largura 400, Altura 450

        // 4. Configura a Janela (Stage)
        primaryStage.setTitle("BakerySystem - Tela Principal");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false); // Impede o usuário de redimensionar
        primaryStage.show(); // Mostra a janela

        System.out.println("Aplicação iniciada com sucesso.");
    }
}