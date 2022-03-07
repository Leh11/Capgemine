package com.bioksam;

public class Mediana {

    public Mediana() {
    }

    public String mediana(String aux) {
        String[] tmp = aux.split(" ");
        Integer dados[] = new Integer[tmp.length];

        for (int i = 0; i < dados.length; i++) {
            dados[i] = Integer.parseInt(tmp[i]);
        }

        Integer size = dados.length;
        Integer index = (size - 1) / 2;
        sort(dados, 0, size - 1);
        
        //if (size % 2 == 0) {
            //return ((dados[index] + dados[index + 1]) / 2);
        //} else {
            return dados[index].toString();
        //}
    }

    private void sort(Integer[] dados, Integer inicio, Integer fim) {
        if (inicio < fim) {
            Integer medio = inicio + (fim - inicio) / 2;
            sort(dados, inicio, medio);
            sort(dados, medio + 1, fim);

            merge(dados, inicio, medio, fim);
        }

    }

    private void merge(Integer[] dados, Integer inicio, Integer medio, Integer fim) {
        Integer dir[] = new Integer[fim - medio];
        Integer esq[] = new Integer[medio - inicio + 1];
        

        Integer sizeEsq = esq.length;
        Integer sizeDir = dir.length;

        for (int i = 0; i < sizeEsq; i++) {
            esq[i] = dados[inicio + i];
        }
        for (int j = 0; j < sizeDir; j++){
            dir[j] = dados[medio + 1 + j];
        }
        
        Integer i = 0;
        Integer j = 0;
        Integer k = inicio;
        while ((i < sizeEsq)  && (j < sizeDir)) {
            if (esq[i] <= dir[j]) {
                dados[k] = esq[i];
                i++;
            }else {
                dados[k] = dir[j];
                j++;
            }
            k++;
        }

        while (i < sizeEsq) {
            dados[k] = esq[i];
            i++;
            k++;
        }
          while (j < sizeDir) {
            dados[k] = dir[j];
            j++;
            k++;
        }
    }

}
