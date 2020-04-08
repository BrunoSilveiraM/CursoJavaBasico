package com.java.basico.heranca.classes;

import java.util.Objects;

public class Professor extends Pessoa{
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Double.compare(professor.salario, salario) == 0 &&
                Objects.equals(departamento, professor.departamento) &&
                Objects.equals(nomeCurso, professor.nomeCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), departamento, nomeCurso, salario);
    }
}
