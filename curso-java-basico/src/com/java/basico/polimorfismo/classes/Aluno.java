package com.java.basico.polimorfismo.classes;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public Aluno(String curso, double... notas) {
        this.curso = curso;
        this.notas = notas;
    }
    public Aluno(String nome, String endereco, String telefone, String curso){
        super(nome, endereco, telefone);
        this.curso = curso;
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

    public void alteraAluno(Aluno a){
        a.curso = this.curso;
    }
}
