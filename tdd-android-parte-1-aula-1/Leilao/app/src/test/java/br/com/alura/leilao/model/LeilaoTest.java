package br.com.alura.leilao.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeilaoTest {

    //01. Implementando primeiras features
    @Test
    public void getDescricao() {
        // criar o cenário de teste
        Leilao console = new Leilao("Console");
        //executar a ação esperada
        String descricaoDevolvida = console.getDescricao();

        //testar resultado esperado
        assertEquals("Console", descricaoDevolvida);
    }

    //02. Introdução aos testes automatizados
    @Test
    public void getMaiorLance(){
        Leilao lance = new Leilao("lance");
        lance.propoe(new Lance(new Usuario("Alex"), 200.0));

        double maiorLanceDevolvido = lance.getMaiorLance();

        assertEquals(200.0, maiorLanceDevolvido, 0.0001);

    }
}