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
        AbsPropriedades validacao = new Validacao(this.temperatura);
        
        if (Estaticos.MENSAGEM.equals("")) {
            AbsPropriedades calcular = new Kelvin(validacao.valor);
            this.resultado = calcular.resultado;
        }
        
    }
    
}
