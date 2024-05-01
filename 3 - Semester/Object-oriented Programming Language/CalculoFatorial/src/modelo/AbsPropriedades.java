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
    
    // IMetodos obriga as classes filhas a utilziarem seus métodos....

    protected String numero;
    protected Integer num;

    public AbsPropriedades(String numero) {
        this.numero = numero;

    }

    public AbsPropriedades(Integer num) {
        this.num = num;

    }

}
