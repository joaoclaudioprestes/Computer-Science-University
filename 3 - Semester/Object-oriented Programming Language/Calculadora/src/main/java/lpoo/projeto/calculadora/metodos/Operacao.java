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

    public Integer number1;
    public Integer number2;
    public Integer resposta;
    public String operador;

    public void calcular() {

        if (this.operador.equals("+")) {
            this.resposta = this.number1 + this.number2;
        } else if (this.operador.equals("-")) {
            this.resposta = this.number1 - this.number2;
        } else if (this.operador.equals("x")) {
            this.resposta = this.number1 * this.number2;
        } else if (this.operador.equals("/")) {
            this.resposta = this.number1 / this.number2;
        }

    }
}
