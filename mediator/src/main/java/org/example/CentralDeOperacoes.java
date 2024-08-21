package org.example;

public class CentralDeOperacoes {

    private static CentralDeOperacoes instancia = new CentralDeOperacoes();

    private CentralDeOperacoes() {}

    public static CentralDeOperacoes getInstancia() {
        return instancia;
    }

    public String enviarSolicitacaoOperacoes(String mensagem) {
        return "Central de Operações encaminhou sua solicitação para o Departamento de Operações.\n" +
                "Resposta: " + Operacao.getInstancia().receberSolicitacao(mensagem);
    }

    public String enviarSolicitacaoManutencao(String mensagem) {
        return "Central de Operações encaminhou sua solicitação para o Departamento de Manutenção.\n" +
                "Resposta: " + Manutencao.getInstancia().receberSolicitacao(mensagem);
    }

    public String enviarSolicitacaoAtendimentoAoCliente(String mensagem) {
        return "Central de Operações encaminhou sua solicitação para o Departamento de Atendimento ao Cliente.\n" +
                "Resposta: " + AtendimentoAoCliente.getInstancia().receberSolicitacao(mensagem);
    }
}
