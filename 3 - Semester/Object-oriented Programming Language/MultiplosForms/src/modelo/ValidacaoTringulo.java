/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joaop
 */
public class ValidacaoTringulo extends AbsPropriedades {

    public ValidacaoTringulo() {
        super(null);
    }

    @Override
    public void Executar() {

        Estaticos.mensager = "";

        try {
            
        } catch (Exception e) {
            "Erro de conversão ou um não identificamos um triângulo!";
        }

        if (this.l1 + this.l2 > this.l3 || this.l2 + this.l3 > this.l1 || this.l3 + this.l1 > this.l2) {
           
        }

    }

}
