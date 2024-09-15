/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joaop
 */
public class Conexao {

    public Connection con;
    public String stringConexao = "jdbc:sqlserver://localhost\\localhost:1433;databaseName=crudUsuario;encrypt=false";
    public String mensagem;

    public Connection conectar() {
        this.mensagem = "";
        try {

            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(stringConexao, "sa", "#sa123456");
            }
        } catch (SQLException e) {
            this.mensagem = "Erro ao efetuar a conexão!";
        }

        return con;
    }

    public void desconectar() {
        this.mensagem = "";

        try {
            if (!con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            this.mensagem = "Erro ao encerrar conexão com o banco de dados!";
        }
    }

}
