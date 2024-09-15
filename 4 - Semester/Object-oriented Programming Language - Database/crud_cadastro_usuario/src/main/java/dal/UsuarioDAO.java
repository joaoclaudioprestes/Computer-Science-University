/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Usuario;

/**
 *
 * @author joaop
 */
public class UsuarioDAO {

    Conexao conex = new Conexao();
    public String mensagem;

    public void cadastrarUsuario(Usuario usuario) {
        this.mensagem = "";
        try {
            Connection con = conex.conectar();

            String instrucaoSQL = "INSERT INTO usuario (nome, rg, cpf) VALUES (?,?,?)";

            PreparedStatement stmt = con.prepareStatement(instrucaoSQL);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getRg());
            stmt.setString(3, usuario.getCpf());

            stmt.execute();

            conex.desconectar();

            this.mensagem = "Usuário cadastrado com sucesso!!";
        } catch (Exception e) {
            this.mensagem = "Erro ao cadastrar usuário!" + e;
        }
    }
}
