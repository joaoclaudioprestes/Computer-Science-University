/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joaop
 */
public class Calculo extends AbsPropriedades {

    public Calculo(Double valor) {
        super(valor);
    }

    @Override
    public void Executar() {
        this.resposta = String.valueOf(this.valor + 273.15);
    }

}
