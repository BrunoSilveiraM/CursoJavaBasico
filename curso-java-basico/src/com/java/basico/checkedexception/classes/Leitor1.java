package com.java.basico.checkedexception.classes;

public class Leitor1 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Fechando Leitor1...");
    }
}
