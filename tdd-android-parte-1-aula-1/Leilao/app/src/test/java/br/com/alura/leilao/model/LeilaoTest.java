package br.com.alura.leilao.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeilaoTest {
    //template para o nome do teste
    // [nome do método] [Estado de teste] [resultado esperado]

    //01. Implementando primeiras features
    @Test
    public void getDescricao_QuandoRecebeDescricao_DevolveDescricao() {
        // criar o cenário de teste
        Leilao console = new Leilao("Console");
        //executar a ação esperada
        String descricaoDevolvida = console.getDescricao();

        //testar resultado esperado
        assertEquals("Console", descricaoDevolvida);
    }

    //02. Introdução aos testes automatizados
    @Test
    public void getMaiorLance_QuandoRecebeApenasUmLance_DevolveMaiorLance() {
        Leilao lance = new Leilao("lance");
        lance.propoe(new Lance(new Usuario("Alex"), 200.0));

        double maiorLanceDevolvidoDoConsole = lance.getMaiorLance();
        assertEquals(200.0, maiorLanceDevolvidoDoConsole, 0.0001);
    }

    @Test
    public void getMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemCrescente_DevolveMaiorLance() {
        //Maior Lance devolvido para o Computador
        Leilao computador = new Leilao("Computador");

        computador.propoe(new Lance(new Usuario("Alex"), 100.0));
        computador.propoe(new Lance(new Usuario("Fran"), 200.0));

        double maiorLanceDevolvidoDoComputador = computador.getMaiorLance();
        assertEquals(200.0, maiorLanceDevolvidoDoComputador, 0.0001);

    }

    @Test
    public void getMaiorLance_QuandoRecebeMaisDeUmLanceEmOrdemDecrescente_DevolveMaiorLance() {
        //Maior Lance devolvido para o Carro
        Leilao carro = new Leilao("Carro");

        carro.propoe(new Lance(new Usuario("Alex"), 10000.0));
        carro.propoe(new Lance(new Usuario("Fran"), 9000.0));

        double maiorLanceDevolvidoCarro = carro.getMaiorLance();
        assertEquals(10000.0, maiorLanceDevolvidoCarro, 0.0001);

    }
}