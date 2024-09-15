/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author joaop
 */
public class Validacao {

    public String mensagem;

    public void validar(List<String> listUsuario) {
        this.mensagem = "";

        // Verifica se o nome é válido
        if (listUsuario.get(0).isEmpty()) {
            this.mensagem = "Digite o nome do usuário!";
            return;
        }

        // Verifica se o RG tem menos de 9 caracteres (RGs geralmente têm 9 dígitos)
        if (listUsuario.get(1).length() < 9) {
            this.mensagem = "Digite um RG válido!";
            return;
        }

        // Verifica se o CPF tem exatamente 11 caracteres (CPF tem 11 dígitos)
        if (listUsuario.get(2).length() != 11) {
            this.mensagem = "Digite um CPF válido!";
        }

    }
}
