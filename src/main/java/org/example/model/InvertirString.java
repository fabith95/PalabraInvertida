package org.example.model;

public class InvertirString {


    public static String[] hacerRevez() {
        String vectorPalabra []= {"h","e","l","l","o"};
        String vectorInvertir []= {""};

        for (int i = 0; i < vectorPalabra.length -1; i--) {
            vectorInvertir[i] += vectorPalabra[i];
        }
        return vectorInvertir;
    }
}
