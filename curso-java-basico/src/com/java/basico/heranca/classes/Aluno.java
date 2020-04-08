package com.java.basico.heranca.classes;

import java.util.Arrays;
import java.util.Objects;

public class Aluno extends Pessoa{ // extends diz que Aluno herda atributos da classe pai Pessoa
    private String curso;
    private double[] notas;

    public Aluno() {

    }
    public Aluno(String curso, double[] notas) {
        this.curso = curso;
        this.notas = notas;
    }
    public Aluno(String nome, String endereco, String telefone, String curso){
        super(nome, endereco, telefone); // faz referência a superclasse, no caso ao construtor da superclasse
        this.curso = curso;
    }

    public void setCPF(String CPF){
        super.setCpf(CPF); // acessa método da superclasse
        this.setCpf(CPF);// ou pode ser feito dessa forma
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double...notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double cont = 0, somador = 0;
        for(double tempNotas: this.notas){
            somador += tempNotas;
            cont++;
        }
        somador = somador / cont;
        return somador;
    }

    public boolean verificarAprovado(){
        if(calcularMedia() >= 7)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /*
        Esse implementação de equals permite comparar o nome do curso ignorando letras maiúsculas e minúsculas
         */
        Aluno other = (Aluno) o; // faz o casting do "o" do tipo Object para Aluno
        if(curso.equalsIgnoreCase(other.getCurso())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(curso);
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }
}
