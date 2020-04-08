package com.java.basico.tratamentoDeErros.classes;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionaContato(Contato c) throws AgendaCheiaException{
        boolean flag = true;
        for (int i = 0; i < contatos.length; i++){
            if(contatos[i] == null){
                contatos[i] = c;
                flag = false;
                break;
            }
        }
        if(flag){
            throw new AgendaCheiaException();
        }
    }

    public int consultaContato(String nome) throws ContatoNaoExisteException{
        boolean flag = false;
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] != null){
                if(contatos[i].getNome().equalsIgnoreCase(nome)){
                    flag = true;
                    return i;
                }
            }

        }
          throw new ContatoNaoExisteException(nome);
    }

    public String toString() {
        String s = "Agenda{";
        for(Contato c : contatos){
            s+= c.toString() + "\n";
        }
        return s;
    }

    public static int opcaoMenu(Scanner scan){
        boolean flag = false;
        int op = 0;

        while(!flag){
            System.out.println("Digite uma opção : ");
            System.out.println("1 - Consulta agenda");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Sair");
            try{
                String entrada = scan.nextLine();
                op = Integer.parseInt(entrada);
                if(op == 1 || op== 2 || op == 3){
                    flag = true;
                }else{
                    throw new Exception("Entrada inválida");
                }
            }
            catch(Exception e){
                System.out.println("Entrada inválida");
            }
        }
        return op;
    }
}
