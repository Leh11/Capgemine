package com.bioksam;

import java.util.HashMap;
import java.util.Map;

public class DiferencaPar {

    public void acheOsPares(String aux, Integer x) {
        StringBuilder retorno = new StringBuilder();
        Map<Integer, Integer> par = new HashMap<>();

        String[] tmp = aux.split(" ");
        Integer dados[] = new Integer[tmp.length];

        Integer size = dados.length;

        for (Integer i = 0; i < size; i++) {
            dados[i] = Integer.parseInt(tmp[i]);
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((Math.abs(dados[i]- dados[j])) == x) {
                    par.put(dados[i], dados[j]);
                    retorno.append(dados);
                    System.out.println(par);
                }
            }
        }
    }
}
