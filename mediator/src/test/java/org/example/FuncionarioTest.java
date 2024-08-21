package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveSolicitarOperacoes() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Central de Operações encaminhou sua solicitação para o Departamento de Operações.\n" +
                        "Resposta: Operações estão processando a solicitação: Verificar horário de funcionamento",
                funcionario.solicitarOperacoes("Verificar horário de funcionamento"));
    }

    @Test
    void deveSolicitarManutencao() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Central de Operações encaminhou sua solicitação para o Departamento de Manutenção.\n" +
                        "Resposta: Manutenção está verificando a solicitação: Consertar porta do ônibus",
                funcionario.solicitarManutencao("Consertar porta do ônibus"));
    }

    @Test
    void deveSolicitarAtendimentoAoCliente() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Central de Operações encaminhou sua solicitação para o Departamento de Atendimento ao Cliente.\n" +
                        "Resposta: Atendimento ao Cliente recebeu sua solicitação: Informar sobre atrasos",
                funcionario.solicitarAtendimentoAoCliente("Informar sobre atrasos"));
    }

}