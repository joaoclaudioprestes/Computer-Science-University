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

        if (this.num < 2) {
            this.resposta = "Não é primo!";
        }

        for (int i = 2; i < this.num; i++) {
            if (this.num % i == 0) {
                this.resposta = "Não é primo!";
                break;
            }
        }
    }

    public String getResposta() {
        return resposta;
    }

}
