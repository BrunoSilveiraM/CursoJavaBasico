package com.java.basico.polimorfismo.test;

import com.java.basico.polimorfismo.classes.Aluno;
import com.java.basico.polimorfismo.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.setEndereco("Rua Antônio Bandeira");
        System.out.println(p1.obterEtiquetaEndereco());
        Aluno a1 = new Aluno("Física", 0.0,0.0,0.0);
        Aluno a2 = new Aluno("Matemática",2.0,2,0,2,0);
        a1.alteraAluno(a2);
        System.out.println(a2.getCurso());

    }
}
