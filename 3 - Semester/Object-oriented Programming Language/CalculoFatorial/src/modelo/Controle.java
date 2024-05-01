/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joaop
 */
public class Controle extends AbsPropriedades {

    public Controle(String numero) {
        super(numero);
    }

    @Override
    public void Executar() {

        Estaticos.MENSAGEM = "";

        Validacao validacao = new Validacao(this.numero);

        if (Estaticos.MENSAGEM.equals("")) {
            Calculo calculo = new Calculo(validacao.num);
            this.numero = calculo.toString();
        }

    }

    @Override
    public String toString() {
        return this.numero;
    }

}
