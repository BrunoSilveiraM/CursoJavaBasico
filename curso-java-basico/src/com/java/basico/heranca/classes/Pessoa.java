package com.java.basico.heranca.classes;

import java.util.Objects;

public class Pessoa {
    /*
    Essas características são comuns a pessoas.
    Classes como aluno, professor, cliente, funcionário,etc, irão ter esses atributos(características)
    Exemplo de mal uso de herança:
    1.Existe uma classe cachorro que possui atributos em comum com Pessoa
    2.Para isso cria-se uma classe Pessoa fazendo uma classe Cachorro herdar de pessoa
    Herança deve ser feita se tiver um relacionamento É UM OU É UMA, como cachorro não é uma pessoa isso é uma
    má prática de herança
     */
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    /*
    Private é visível apenas na própria classe(encapsulamento)
     */
    String modificadorDefault; // visível dentro do pacote, então Aluno terá acesso.
    protected String modificadorProtected;//vísivel dentro do pacote e as subclasses têm visibilidade dentro e fora do pacote

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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(endereco, pessoa.endereco) &&
                Objects.equals(telefone, pessoa.telefone) &&
                Objects.equals(cpf, pessoa.cpf) &&
                Objects.equals(modificadorDefault, pessoa.modificadorDefault) &&
                Objects.equals(modificadorProtected, pessoa.modificadorProtected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco, telefone, cpf, modificadorDefault, modificadorProtected);
    }
}
