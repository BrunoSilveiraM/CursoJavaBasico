package com.java.basico.tratamentoDeErros.classes;

public class ContatoNaoExisteException extends Exception {
    public String nome;

    public ContatoNaoExisteException(String nome){
        this.nome = nome;
    }
    @Override
    public String getMessage() {
        return "Contato '"+ nome +"' inexistente.";
    }
}
