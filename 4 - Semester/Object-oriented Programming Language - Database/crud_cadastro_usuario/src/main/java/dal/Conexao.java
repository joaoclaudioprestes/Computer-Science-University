/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joaop
 */
public class Conexao {

    private Connection conn = null;

    // String de conexão SQL Server
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=crudPessoa;user=sa;password=#sa123456";

    // Método para conectar ao banco de dados
    public Connection conectar() {
        try {
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return conn;
    }

    // Método para desconectar do banco de dados
    public void desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexão com o banco de dados encerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao desconectar do banco de dados: " + e.getMessage());
        }
    }
}
