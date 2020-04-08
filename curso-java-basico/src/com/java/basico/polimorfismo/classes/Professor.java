package com.java.basico.polimorfismo.classes;

public class Professor extends Pessoa {
    public String departamento;
    public String nomeCurso;
    public double salario;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
    @Override
    public String obterEtiquetaEndereco() { // modifica o método originalmente criado em Pessoa.
        String s = "Endereço do Professor : "+super.getEndereco();
        return s;
    }
}
