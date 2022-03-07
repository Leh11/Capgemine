package com.bioksam;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner key = new Scanner(System.in);
        String aux = key.nextLine();
        
        Mediana m = new Mediana();
    
        System.out.println(m.mediana(aux));

        key.close();
    }
}
