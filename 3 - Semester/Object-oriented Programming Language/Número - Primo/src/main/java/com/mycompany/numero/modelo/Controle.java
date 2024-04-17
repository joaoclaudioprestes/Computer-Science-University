package com.mycompany.numero.modelo;

public class Controle {

    private String numero;
    private String mensagem;
    private String resposta;

    public Controle(String numero) {
        this.numero = numero;
        Executar();
    }

    private void Executar() {
        this.mensagem = "";
        this.resposta = "";

        Validacao validar = new Validacao(this.numero);

        if (validar.getMensagem().equals("")) {
            Primo isPrimo = new Primo(validar.getNum());
            this.resposta = isPrimo.getResposta();
        } else {
            this.mensagem = validar.getMensagem();
        }
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getResposta() {
        return resposta;
    }
}
