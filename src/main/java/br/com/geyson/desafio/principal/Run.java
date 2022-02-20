package br.com.geyson.desafio.principal;

import br.com.geyson.desafio.principal.ratrefas.Anagrama;
import br.com.geyson.desafio.principal.ratrefas.Escada;
import br.com.geyson.desafio.principal.ratrefas.Senha;

public class Run {
    public static void main(String[] args) {
        new Anagrama().busrcarAnagrama("ifailuhkqq");
        new Senha().validar("Ya3");
        new Escada().fazer(6);
    }
}
