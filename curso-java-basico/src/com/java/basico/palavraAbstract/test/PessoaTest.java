package com.java.basico.palavraAbstract.test;

import com.java.basico.palavraAbstract.classes.Aluno;
import com.java.basico.palavraAbstract.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); // não pode ser instanciada, por isso gera erro
        Pessoa aluno = new Aluno(); // a classe pode ser instanciado
    }
}
