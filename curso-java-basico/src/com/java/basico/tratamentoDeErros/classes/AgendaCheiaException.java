package com.java.basico.tratamentoDeErros.classes;

public class AgendaCheiaException extends Exception {
    @Override
    public String getMessage() {
        return "Agenda cheia";
    }
}
