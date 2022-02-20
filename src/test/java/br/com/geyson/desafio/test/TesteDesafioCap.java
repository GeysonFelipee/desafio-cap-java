package br.com.geyson.desafio.test;

import br.com.geyson.desafio.principal.ratrefas.Anagrama;
import br.com.geyson.desafio.principal.ratrefas.Escada;
import br.com.geyson.desafio.principal.ratrefas.Senha;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteDesafioCap {
    @Test
    public void testAnagrama() {
        int qtda = new Anagrama().busrcarAnagrama("ifailuhkqq");
        assertEquals(qtda, 3);
    }

    @Test
    public void testSenha() {
        String sugestao = new Senha().validar("Ya3");
        assertEquals(sugestao.length(), 6);
    }

    @Test
    public void testEscada() {
        String[] escada = new Escada().fazer(6);
        assertEquals(escada.length, 6);
    }

}
