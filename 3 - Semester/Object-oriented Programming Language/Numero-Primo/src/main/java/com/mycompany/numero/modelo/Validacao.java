package com.mycompany.numero.modelo;

public class Validacao {

    private String numero;
    private int num;
    private String mensagem;

    public Validacao(String numero) {
        this.numero = numero;
        Executar();
    }

    private void Executar() {
        try {
            this.num = Integer.parseInt(this.numero);

        } catch (Exception e) {
            this.mensagem = "Número inválido!";
        }
    }

    public int getNum() {
        return num;
    }

    public String getMensagem() {
        return mensagem;
    }

}
