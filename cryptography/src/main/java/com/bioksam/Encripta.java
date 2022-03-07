package com.bioksam;

public class Encripta {
    
    private Integer size;
    private Integer coluna;
    private Integer linha;
    private char[][] tmp;
    private StringBuilder retorno = new StringBuilder();

    public Encripta(){}

    private void padronizar(){
        for (int j = 0; j < this.linha; j++) {
            for (int i = 0; i < this.coluna; i++) {
                
                retorno.append(this.tmp[i][j]);
                
            }
            retorno.append(" ");
        }
    }

    public String criptografar(String legivel){
        legivel = legivel.replace(" ", "");
    
        this.size = legivel.length();
        this.coluna = (int)Math.ceil(Math.sqrt(this.size));
        this.linha = (int)Math.floor(Math.sqrt(this.size));

        this.linha = linha < coluna ? coluna : linha;
        this.tmp = new char[linha][coluna];

        Integer index = 0;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if(index < size){
                    this.tmp[i][j] = legivel.charAt(index++);
                }
            }
        }
        padronizar();
        return retorno.toString().trim();
    }
}
