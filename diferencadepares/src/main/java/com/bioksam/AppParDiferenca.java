package com.bioksam;
import java.util.Scanner;


/**
 * Hello world!
 */
public final class AppParDiferenca {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String aux = key.nextLine();
        
        DiferencaPar diferencaPar = new DiferencaPar();

        diferencaPar.acheOsPares(aux, 2);

        key.close();
    }
}
