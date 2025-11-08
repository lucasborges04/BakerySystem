package br.com.padaria.bakerysystem.app;

import javafx.application.Application;
import javafx.stage.Stage;

// A classe principal de uma aplicação JavaFX DEVE estender Application
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("------------------------------------");
        System.out.println("Sistema da Padaria iniciado!");
        System.out.println("Projeto configurado com sucesso.");
        System.out.println("------------------------------------");

        // Se quiséssemos mostrar uma janela (próximos passos):
        // FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/br/com/padaria/bakerysystem/view/Login.fxml"));
        // Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        // primaryStage.setTitle("BakerySystem - Login");
        // primaryStage.setScene(scene);
        // primaryStage.show();
    }
}