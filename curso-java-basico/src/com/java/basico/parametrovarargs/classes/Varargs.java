package com.java.basico.parametrovarargs.classes;

public class Varargs {
    /*
     Essa classe foi feita para demonstrar como se deve passar valores como vetores como parâmetro de uma forma
     simplificada.
     */
    // forma usual de passar vetor
    public static void recebeVetor(int [] vetor){
        for(int num : vetor){
            System.out.println(num);
        }
    }
     /*
     Esse método foi introduzido a partir de Java 5

     É uma forma de passar múltiplos valores sem ter noção de qual o tamanho desses valores

     */
    /*
    Sintaxe :
    1. Tipo da variável
    2. ...
    3. nome da variável
     */
    public static void recebeValores (int... vetor) { // soma é um array.
        // O que Java faz é pegar os valores passados em vetor e transformar em um array.
        for (int num : vetor){
            System.out.println(num);
        }
    }
    /*
    No overload do método recebeValores o argumento "varargs = ... vetor" tem que ser o último, pois senão a linguagem
    Java não irá saber quando deve parar para separar os parâmetros, então o valor passado no varargs é por virgula
    e Java não vai saber diferenciar se os valores passados são para o primeiro parâmetro ou para o segundo parâmetro
    (vetor), se o varargs não for o último argumento é gerado um erro de compilação para evitar ambiguidade
     */
    public static void recebeValores (double valor,int... vetor) { // soma é um array.
        // O que Java faz é pegar os valores passados em vetor e transformar em um array.
        for (int num : vetor){
            System.out.println(num);
        }
    }

}
