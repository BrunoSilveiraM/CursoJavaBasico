package com.java.basico.heranca.test;

import com.java.basico.heranca.classes.Aluno;

public class PessoaTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        a1.setNotas(7,5,2);
        a2.setNotas(8,8,8);
        a1.setCurso("Ciência da Computação");
        a2.setCurso("Ciência da Computação");
        System.out.println(a1.equals(a2));
    }
}
