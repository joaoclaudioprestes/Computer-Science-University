/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author joaop
 */
public class Operacao
{

    public Integer number1;
    public Integer number2;
    public Integer resposta;

    public void Somar()
    {
        this.resposta = this.number1 + this.number2;
    }

    public void Subtrair()
    {
        this.resposta = this.number1 - this.number2;
    }

    public void Multiplicar()
    {
        this.resposta = this.number1 * this.number2;
    }

    public void Dividir()
    {
        this.resposta = this.number1 / this.number2;
    }
}
