package com.java.basico.checkedexception.test;

import com.java.basico.checkedexception.classes.Leitor1;
import com.java.basico.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo();
    }
    //Processo feito a partir de Java 7
    public static void lerArquivo(){
        //Java se encarrega de fechar o leitor2 e leitor1 na ordem inversa
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2();) {
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //Processo feito até o Java 6
    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
