package br.com.padaria.bakerysystem.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button vendasButton;

    @FXML
    private Button estoqueButton;

    @FXML
    private Button produtosButton;

    @FXML
    private Button sairButton;

    @FXML
    public void initialize() {
        // Ex: vendasButton.setDisable(true); // Desabilitaria o botão
        System.out.println("MainController inicializado.");
    }

    // --- MÉTODOS DE AÇÃO DOS BOTÕES ---

    @FXML
    private void handleVendasButton(ActionEvent event) {
        System.out.println("Botão Vendas clicado! (Lógica futura aqui)");
        // TODO: Abrir a tela de Vendas
    }

    @FXML
    private void handleEstoqueButton(ActionEvent event) {
        System.out.println("Botão Estoque clicado! (Lógica futura aqui)");
        // TODO: Abrir a tela de Estoque
    }

    @FXML
    private void handleProdutosButton(ActionEvent event) {
        System.out.println("Botão Produtos clicado! (Lógica futura aqui)");
        // TODO: Abrir a tela de Produtos
    }

    @FXML
    private void handleSairButton(ActionEvent event) {
        System.out.println("Fechando a aplicação...");
        Platform.exit();
    }
}
