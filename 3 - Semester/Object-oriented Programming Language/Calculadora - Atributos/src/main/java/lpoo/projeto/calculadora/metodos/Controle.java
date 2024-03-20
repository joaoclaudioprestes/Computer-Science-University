/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo.projeto.calculadora.metodos;

/**
 *
 * @author joaop
 */
public class Controle {

    public String numberS1;
    public String numberS2;
    public Integer number1;
    public Integer number2;
    public String resultado;
    public String operador;

    public void executar() {
        Validacao validacao = new Validacao();
        validacao.numberS1 = this.numberS1;
        validacao.numberS2 = this.numberS2;
        validacao.operacao = this.operador;
        validacao.validar();

        if (validacao.mensagem.equals("")) {
            Operacao operacao = new Operacao();
            operacao.number1 = validacao.number1;
            operacao.number2 = validacao.number2;
            operacao.operador = this.operador;

            operacao.calcular();

            this.resultado = operacao.resposta.toString();
        } else {
            this.resultado = validacao.mensagem;
        }
    }
}
