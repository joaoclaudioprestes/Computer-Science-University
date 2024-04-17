/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joaop
 */
public class Validacao extends absPropriedades {

    public Validacao(String lado1, String lado2, String lado3) {
        this.Executar();
    }

    public void Executar() {
        this.mensagem = "";

        try {
            this.l1 = Integer.getInteger(this.lado1);
            this.l2 = Integer.getInteger(this.lado2);
            this.l3 = Integer.getInteger(this.lado3);

        } catch (Exception e) {
            this.mensagem = "Erro de conversão!";
        }
    }

}
