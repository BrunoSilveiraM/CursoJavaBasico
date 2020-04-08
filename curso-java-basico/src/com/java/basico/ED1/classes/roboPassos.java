package com.java.basico.ED1.classes;

public class roboPassos {

    public static int numeroPassos(int n){
        if (n <= 2){
            return 1;
        }
        return (numeroPassos(n - 1) + 1);
    }
}
