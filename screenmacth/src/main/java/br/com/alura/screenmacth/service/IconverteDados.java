package br.com.alura.screenmacth.service;

import javax.sound.sampled.BooleanControl;

public interface IconverteDados {
     <T> T obterDados(String json, Class<T> classe);
}
