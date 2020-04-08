package com.java.basico.relacionamentoClasses.classes;

public class Contato {
    private String nome;
    private Endereco endereco; // relação tem um
    private Telefone[] telefones; // relação tem muitos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefone() {
        return telefones;
    }

    public void setTelefone(Telefone[] telefone) {
        this.telefones = telefone;
    }
}
