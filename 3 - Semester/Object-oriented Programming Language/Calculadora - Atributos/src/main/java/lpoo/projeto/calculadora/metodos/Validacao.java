/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo.projeto.calculadora.metodos;

/**
 *
 * @author joaop
 */
public class Validacao {

    public String numberS1;
    public String numberS2;
    public Integer number1;
    public Integer number2;
    public String mensagem;
    public String operacao;

    public void validar() {
        this.mensagem = "";
        try {
            this.number1 = Integer.parseInt(this.numberS1);
            this.number2 = Integer.parseInt(this.numberS2);

            if (operacao.equals("/") && number2 == 0) {
                this.mensagem = "Divisão por zero!";
            }
        } catch (Exception e) {
            this.mensagem = "Números inválidos!";
        }
    }
}
