package org.example;

public class Funcionario {

    public String solicitarOperacoes(String mensagem) {
        return CentralDeOperacoes.getInstancia().enviarSolicitacaoOperacoes(mensagem);
    }

    public String solicitarManutencao(String mensagem) {
        return CentralDeOperacoes.getInstancia().enviarSolicitacaoManutencao(mensagem);
    }

    public String solicitarAtendimentoAoCliente(String mensagem) {
        return CentralDeOperacoes.getInstancia().enviarSolicitacaoAtendimentoAoCliente(mensagem);
    }
}