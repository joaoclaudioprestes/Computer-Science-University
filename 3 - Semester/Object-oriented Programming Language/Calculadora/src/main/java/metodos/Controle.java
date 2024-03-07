/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author joaop
 */
public class Controle
{

    public String numberS1;
    public String numberS2;
    public Integer number1;
    public Integer number2;
    public String resultado;
    public String operador;

    public void Executar()
    {
        Validacao validacao = new Validacao();
        validacao.numberS1 = this.numberS1;
        validacao.numberS2 = this.numberS2;
        validacao.Validar();

        if (validacao.mensagem.equals(""))
        {
            Operacao operacao = new Operacao();
            operacao.number1 = validacao.number1;
            operacao.number2 = validacao.number2;

            if (this.operador.equals("+"))
            {
                operacao.Somar();
            } else if (this.operador.equals("-"))
            {
                operacao.Subtrair();
            } else if (this.operador.equals("x"))
            {
                operacao.Multiplicar();
            } else if (this.operador.equals("/"))
            {
                operacao.Dividir();
            }

            this.resultado = operacao.resposta.toString();
        } else
        {
            this.resultado = validacao.mensagem;
        }
    }
}
