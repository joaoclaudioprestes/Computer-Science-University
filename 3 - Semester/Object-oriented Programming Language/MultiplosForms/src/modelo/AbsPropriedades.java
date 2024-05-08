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

    protected String numero;
    protected Integer num;
    protected String lado1;
    protected String ladp2;
    protected String lado3;
    protected Double l1;
    protected Double l2;
    protected Double l3;
    protected String resposta;

    public AbsPropriedades(String numero) {

    }

    public AbsPropriedades(int num) {

    }

    public AbsPropriedades(String lado1, String lado2, String lado3) {
        ValidacaoTringulo validacaoT = new ValidacaoTringulo();
    }

    public AbsPropriedades(Double l1, Double l2, Double l3) {

    }

    @Override
    public String toString() {
        return "AbsPropriedades{" + '}';
    }

}
