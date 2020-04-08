package com.java.basico.tratamentoDeErros.test;

public class MultiplosCatch {
    public static void main(String[] args) {
        int[] numeros = {4,8,16,32,64,128};
        int[] denominadores = {2,0,4,8,0};

        for(int i = 0; i < numeros.length; i++){
            try{
                /* Acessa um índice inválido como denominador.
                 Então existe mais de um erro
                 Deve-se adicionar outro catch
                */
                System.out.println(numeros[i] / denominadores[i]);
            }
            catch(ArithmeticException exception){
                System.out.println("Erro ao dividir por zero");
            }
            catch(ArrayIndexOutOfBoundsException exception){
                System.out.println("Acesso a índice inválido de vetor");
            }
        }
    }
}
