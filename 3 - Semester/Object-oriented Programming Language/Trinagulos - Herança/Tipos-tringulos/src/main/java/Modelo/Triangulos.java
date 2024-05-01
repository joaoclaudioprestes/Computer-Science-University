/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joaop
 */
public class Triangulos extends absPropriedades {

    public Triangulos(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.Executar();
    }

    public void Executar() {

        if (this.l1 == this.l2 && this.l1 == this.l3) {
            this.resposta = "Equilátero";
        } else if (this.l1 == this.l2 || this.l2 == this.l3 || this.l1 == this.l3) {
            this.resposta = "Isóceles";
        } else {
            this.resposta = "Escaleno";
        }
    }

}
