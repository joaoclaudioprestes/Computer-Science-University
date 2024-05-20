/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joaop
 */
public abstract class AbsPropriedades implements IMetodos {

    public String temperatura;
    public Double valor;
    public String resultado;

    public AbsPropriedades(String temperatura) {
        this.temperatura = temperatura;
        this.Executar();
    }

    public AbsPropriedades(Double valor) {
        this.valor = valor;
        this.Executar();
    }

    @Override
    public String toString() {
        return this.resultado;
    }

}
