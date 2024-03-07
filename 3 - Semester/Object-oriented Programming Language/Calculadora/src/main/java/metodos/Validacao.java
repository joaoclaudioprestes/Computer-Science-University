/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author joaop
 */
public class Validacao
{

    public String numberS1;
    public String numberS2;
    public Integer number1;
    public Integer number2;
    public String mensagem;

    public void Validar()
    {
        this.mensagem = "";
        try
        {
            this.number1 = Integer.parseInt(this.numberS1);
            this.number2 = Integer.parseInt(this.numberS2);
        } catch (Exception e)
        {
            this.mensagem = "Números inválidos!";
        }
    }
}
