package com.bioksam;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner key = new Scanner(System.in);
        String aux = key.nextLine();
        String[] tmp = aux.split(" ");
        Integer dados[] = new Integer[tmp.length];

        for (int i = 0; i < dados.length; i++) {
            dados[i] = Integer.parseInt(tmp[i]);
        }

        //Integer dados[] = {9, 2, 1, 4, 6};
        Mediana m = new Mediana();
        m.mediana(dados);

        key.close();
    }
}
