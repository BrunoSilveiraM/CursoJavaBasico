package com.java.basico.relacionamentoClasses.test;

import com.java.basico.relacionamentoClasses.classes.Contato;
import com.java.basico.relacionamentoClasses.classes.Endereco;
import com.java.basico.relacionamentoClasses.classes.Telefone;

public class ContatoTest {
    public static void main(String[] args) {
        Contato c1 = new Contato();
        /*
         Todos os valores de c1 são setados menos Endereço, pois é preciso criar um objeto do tipo
          para passar como parâmetro
         */
        c1.setNome("Letícia");

        Endereco e1 = new Endereco();
        e1.setCep("6657795-11");
        e1.setCidade("Fortaleza");
        e1.setComplemento("Não tem");
        e1.setEstado("Ceará");
        e1.setNomeRua("Padre Frota");
        e1.setNumero("305978");

        /*
        Contato tem um objeto do tipo Endereco
        passa objeto como parâmetro, trata-se da relação tem um
         */
        c1.setEndereco(e1);
        System.out.println(c1.getEndereco()); // imprime a referência do objeto
        System.out.println(c1.getEndereco().getNumero());// imprime a o getter de numero, porém não é um código seguro
        /*
        Torna o código mais seguro, pois se os valores do objeto forem nulos então pode gerar erros e fazer a verificação
        de acesso garante que objetos nulos não sejam acessados
        Existe o nullsafeoperator para substituir a expressão dentro do if abaixo, ou seja, é um operador para verificar
        o acesso a objetos nulos
        Apesar de ser notório que c1 nunca vai ser nulo porque foi criado mas em projetos nem sempre o objeto será
        explicitamente inicializado como foi
         */
        if(c1 != null && c1.getEndereco()!= null){
            System.out.println(c1.getEndereco().getNumero());
        }
        Contato c2 = new Contato();
        if(c2!= null && c2.getEndereco()!= null){
            System.out.println(c2.getEndereco().getNumero()); // não é impresso
        }
        // Gera erro de NullPointerException, pois está tentando acessar um parâmetro de c2 que não foi inicializado
        //System.out.println(c2.getEndereco().getNumero());

        // Agora se faz necessário ter um objeto do tipo telefone para passar como parâmetro em Contato
        Telefone t1 = new Telefone();
        t1.setDdd("85");
        t1.setNumero("302165887");
        t1.setTipo("Fixo");
        Telefone t2 = new Telefone();
        t2.setDdd("81");
        t2.setNumero("2365974");
        t2.setTipo("Móvel");

        Telefone [] telefones = new Telefone[2];
        telefones[0] = t1;
        telefones[1] = t2;

        c1.setTelefone(telefones); // passa o array telefone como parâmetro

        if(c1!= null && c1.getTelefone()!= null){
            for (Telefone t : c1.getTelefone()){ // passa o objeto do tipo Telefone c1.getTelefone para um do tipo Telefone t.
                System.out.println(t.getNumero()+" " + t.getTipo()+ " " + t.getDdd());
            }
        }
    }
}
