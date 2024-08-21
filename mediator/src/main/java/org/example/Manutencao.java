package org.example;

public class Manutencao implements Departamento {

    private static Manutencao instancia = new Manutencao();

    private Manutencao() {}

    public static Manutencao getInstancia() {
        return instancia;
    }

    @Override
    public String receberSolicitacao(String mensagem) {
        return "Manutenção está verificando a solicitação: " + mensagem;
    }
}
