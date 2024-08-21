package org.example;

public class Operacao implements Departamento {

    private static Operacao instancia = new Operacao();

    private Operacao() {}

    public static Operacao getInstancia() {
        return instancia;
    }

    @Override
    public String receberSolicitacao(String mensagem) {
        return "Operações estão processando a solicitação: " + mensagem;
    }
}