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

    public Validacao(String temperatura) {
        super(temperatura);
    }

    @Override
    public void Executar() {
        Estaticos.MENSAGEM = "";
        try {
            this.valor = Double.valueOf(this.temperatura);
        } catch (Exception e) {
            Estaticos.MENSAGEM = "Número Inválido!";
        }
    }

}
