package com.mycompany.numero.modelo;

public class Primo {

    private int num;
    private String resposta;

    public Primo(int num) {
        this.num = num;
        Executar();
    }

    private void Executar() {

        this.resposta = "É primo!";

        if (this.num <= 1) {
            this.resposta = "Não é primo!";
            return;
        }

        for (int i = 2; i <= this.num / 2 + 1; i++) {
            this.resposta = "Não é primo!";
            return;
        }
    }

    public String getResposta() {
        return resposta;
    }

}
