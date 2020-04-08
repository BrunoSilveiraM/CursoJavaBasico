package com.java.basico.parametrovarargs.test;

import com.java.basico.parametrovarargs.classes.Varargs;

public class VarargsTest {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        Varargs.recebeValores(numeros); // Primeira forma de passar como parâmetro.
        /*
         2ª Forma : Passa os valores com vírgulas e a linguagem Java se encarrega de quando receber os valores
         transformar em um array
         */
        Varargs.recebeValores(3,4,5);

    }
}
