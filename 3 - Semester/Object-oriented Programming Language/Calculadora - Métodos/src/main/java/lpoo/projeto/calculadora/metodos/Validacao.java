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

    private String mensagem;
    private int n1;
    private int n2;

    public void Validar(String num1, String num2, String op) {

        this.mensagem = "";
        try {
            this.n1 = Integer.parseInt(num1);
            this.n2 = Integer.parseInt(num2);

            if (op.equals("/") && n2 == 0) {
                this.mensagem = "Divisão por zero!";
            }
        } catch (Exception e) {
            this.mensagem = "Números inválidos!";
        }

    }

    public String getMensagem() {
        return mensagem;
    }    

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }
    
    

}
