package br.com.padaria.bakerysystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

    // Nome do arquivo do banco de dados SQLite
    private static final String DB_FILE = "bakerysystem.db";
    // String de conexão JDBC para SQLite
    private static final String URL = "jdbc:sqlite:" + DB_FILE;

    // Bloco estático para criar a tabela na inicialização
    static {
        criarTabelaProdutos();
    }

    /**
     * Retorna uma nova conexão com o banco de dados SQLite.
     */
    public static Connection getConnection() {
        try {
            // O driver do SQLite já deve estar no pom.xml
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw new RuntimeException("Falha ao obter conexão com o banco de dados.", e);
        }
    }

    /**
     * Cria a tabela 'produtos' se ela ainda não existir.
     * Este é o comando SQL que você pediu.
     */
    private static void criarTabelaProdutos() {
        // Este é o SQL para criar a tabela
        String sql = "CREATE TABLE IF NOT EXISTS produtos ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " nome TEXT NOT_NULL," // TEXT é o VARCHAR do SQLite
                + " preco REAL NOT NULL,"   // REAL é o DECIMAL/Double do SQLite
                + " quantidade INTEGER NOT NULL"
                + ");";

        // Usamos try-with-resources para garantir que a conexão e o statement
        // sejam fechados automaticamente.
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            // Executa o comando SQL
            stmt.execute(sql);
            System.out.println("Tabela 'produtos' verificada/criada com sucesso.");

        } catch (SQLException e) {
            System.err.println("Erro ao criar a tabela 'produtos': " + e.getMessage());
        }
    }
}