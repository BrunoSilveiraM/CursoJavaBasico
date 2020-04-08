package com.java.basico.tratamentoDeErros.test;

import com.java.basico.tratamentoDeErros.classes.Agenda;
import com.java.basico.tratamentoDeErros.classes.Contato;
import com.java.basico.tratamentoDeErros.classes.ContatoNaoExisteException;

import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int op = 1;
        while(op != 3){
            op = Agenda.opcaoMenu(scan);
            if(op == 1){ // Consultar contato
                consultarContato(scan, agenda);
            } else if(op == 2){ // //Adicionar contato
                adicionaContato(scan, agenda);
            }
        }
    }
    public static void adicionaContato(Scanner scan, Agenda agenda){
        System.out.println("Digite as informações do contato em cada campo abaixo");
        String nome = obterInformacao(scan, "Nome do contato");
        String telefone = obterInformacao(scan,"Telefone");
        String email = obterInformacao(scan, "Email : ");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEmail(email);
        contato.setTelefone(telefone);
        System.out.println("Contato a ser criado");
        System.out.println(contato);
        try{
            agenda.adicionaContato(contato);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Contatos da Agenda");
            System.out.println(agenda.toString());
        }

    }
    public static void consultarContato (Scanner scan, Agenda agenda){
        String nome = obterInformacao(scan, "Nome do contato : ");
        try{
            if(agenda.consultaContato(nome) >= 0){
                System.out.println("Contato existe");
            }
        }catch(ContatoNaoExisteException e){
            System.out.println(e.getMessage());
        }
    }
    public static String obterInformacao(Scanner scan,String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }
    public static int obterOpcao(Scanner scan){
        boolean flag = false;
        int opcao = 0;
        while(!flag){
            System.out.println("Escolha uma das três opções abaixo");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Sair");
            try{
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                if(opcao == 1 || opcao == 2 || opcao == 3){
                    flag = true;
                }else{
                    throw new Exception("Entrada inválida");
                }
            }catch (Exception e){
                System.out.println("Entrada inválida, digite novamente.");
            }
        }
        return opcao;
    }
}
