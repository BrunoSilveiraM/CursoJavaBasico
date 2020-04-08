package com.java.basico.tratamentoDeErros.test;

public class Excecao {
    public static void main(String[] args) {
        try{
            int [] vet = new int [4];
            System.out.println("Antes da exceptions");

            System.out.println(vet[4]);// acesso inválido, gera ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Acesso inválido de vetor");
        }
        System.out.println("Impresso após exception");
    }
}
