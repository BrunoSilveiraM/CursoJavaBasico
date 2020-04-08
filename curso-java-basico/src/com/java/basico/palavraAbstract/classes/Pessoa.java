package com.java.basico.palavraAbstract.classes;
/*
Com o uso de final a classe não pode ser extendida, então ninguém pode herdar dessa classe, caso alguma classe tente herdar
dessa vai gerar erro
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    // Faz o método ser a versão final e não ser mudado em outras classes que extendem.
    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String obterEtiquetaEndereco(){
        String s;
        s = "Endereço : "+this.endereco;
        return s;
    }

}
