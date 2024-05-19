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

    public Controle(String temperatura) {
        super(temperatura);
    }

    @Override
    public void Executar() {
        AbsPropriedades val = new Validacao(this.temperatura);
        if (Estaticos.MENSAGEM.equals("")) {
            AbsPropriedades cal = new Calculo(val.valor);
            this.resposta = cal.toString();
        }
    }

}
