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

    public String mensagem;
    public String resultado;

    public void Executar(String num1, String num2, String op) {
        this.mensagem = "";
        this.resultado = "";
        Validacao validar = new Validacao();
        validar.Validar(num1, num2, op);
        
        if (validar.getMensagem().equals("")) {
            Operacao operacao = new Operacao();
            this.resultado = Integer.toString(operacao.Calcular(validar.getN1(), validar.getN2(), op));
        } else {
            this.mensagem = validar.getMensagem();
        }

    }
}
