/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joaop
 */
public class Validacao extends AbsPropriedades {

    public Validacao(String numero) {
        super(numero);
    }

    @Override
    public void Executar() {

        Estaticos.MENSAGEM = "";

        try {
            this.num = Integer.valueOf(this.numero);
        } catch (Exception e) {
            Estaticos.MENSAGEM = "Digite número validos!";
        }

    }

}
