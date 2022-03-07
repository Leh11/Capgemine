package com.bioksam;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class AppCrypto {
   
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String legivel = key.nextLine();
        Encripta encripta = new Encripta();
        String cifrado = encripta.criptografar(legivel);

        System.out.println(cifrado);
        key.close();
    }
}
