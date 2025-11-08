package br.com.padaria.bakerysystem.model;

import javafx.beans.property.*;

public class Produto {

    // Usamos Properties do JavaFX para fácil vinculação (binding) com a TableView
    private final IntegerProperty id;
    private final StringProperty nome;
    private final DoubleProperty preco;
    private final IntegerProperty quantidade;

    /**
     * Construtor Padrão
     */
    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = new SimpleIntegerProperty(id);
        this.nome = new SimpleStringProperty(nome);
        this.preco = new SimpleDoubleProperty(preco);
        this.quantidade = new SimpleIntegerProperty(quantidade);
    }

    /**
     * Construtor sem ID (para novos produtos a serem inseridos)
     */
    public Produto(String nome, double preco, int quantidade) {
        this.id = new SimpleIntegerProperty(); // ID será 0 ou nulo por padrão
        this.nome = new SimpleStringProperty(nome);
        this.preco = new SimpleDoubleProperty(preco);
        this.quantidade = new SimpleIntegerProperty(quantidade);
    }

    // --- Getters e Setters (padrão Java) ---

    public int getId() { return id.get(); }
    public void setId(int id) { this.id.set(id); }
    public IntegerProperty idProperty() { return id; }

    public String getNome() { return nome.get(); }
    public void setNome(String nome) { this.nome.set(nome); }
    public StringProperty nomeProperty() { return nome; }

    public double getPreco() { return preco.get(); }
    public void setPreco(double preco) { this.preco.set(preco); }
    public DoubleProperty precoProperty() { return preco; }

    public int getQuantidade() { return quantidade.get(); }
    public void setQuantidade(int quantidade) { this.quantidade.set(quantidade); }
    public IntegerProperty quantidadeProperty() { return quantidade; }
}