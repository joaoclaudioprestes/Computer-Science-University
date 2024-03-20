/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo.projeto.calculadora.metodos;

/**
 *
 * @author joaop
 */
public class Operacao {

    public Integer Calcular(int n1, int n2, String op) {
        if (op.equals("+")) {
            return n1 + n2;
        }
        if (op.equals("-")) {
            return n1 - n2;
        }
        if (op.equals("x")) {
            return n1 * n2;
        }
        if (op.equals("/")) {
            return n1 / n2;
        }

        return 0;
    }
}
