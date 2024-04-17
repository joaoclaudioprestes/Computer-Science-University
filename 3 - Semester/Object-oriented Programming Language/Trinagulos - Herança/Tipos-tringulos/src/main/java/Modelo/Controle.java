/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joaop
 */
public class Controle extends absPropriedades {

    public Controle(String lado1, String lado2, String lado3) {
        this.Executar();
    }

    public void Executar() {
        Validacao validacao = new Validacao(this.lado1, this.lado2, this.lado3);

        if (validacao.mensagem.equals("")) {
            Triangulos tringulos = new Triangulos(validacao.l1, validacao.l2, validacao.l3);
        } else {
            this.resposta = validacao.mensagem;
        }
    }
}
