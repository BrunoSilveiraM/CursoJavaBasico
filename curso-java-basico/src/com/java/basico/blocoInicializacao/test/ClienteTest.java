package com.java.basico.blocoInicializacao.test;

import com.java.basico.blocoInicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        System.out.println("\nFora do construtor");
        for (int parcelas : c1.getParcelas()){
            System.out.print(parcelas + " ");
        }
        System.out.println("\n");
        for (int parcelas : c1.getParcelas2()){
            System.out.print(parcelas + " ");
        }
    }
}
