package com.java.basico.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo() {
        File file = new File("Teste.txt");
        // trata erro
        try{
            // como file..createNewFile retorna boolean, é preciso por em um sout
            System.out.println("Arquivo criado ? : "+file.createNewFile());
            System.out.println("Arquivo criado");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
