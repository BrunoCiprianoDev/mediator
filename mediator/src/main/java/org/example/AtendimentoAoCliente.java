package org.example;

public class AtendimentoAoCliente implements Departamento {

    private static AtendimentoAoCliente instancia = new AtendimentoAoCliente();

    private AtendimentoAoCliente() {}

    public static AtendimentoAoCliente getInstancia() {
        return instancia;
    }

    @Override
    public String receberSolicitacao(String mensagem) {
        return "Atendimento ao Cliente recebeu sua solicitação: " + mensagem;
    }
}
