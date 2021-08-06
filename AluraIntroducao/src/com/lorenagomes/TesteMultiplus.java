package com.lorenagomes;

public class TesteMultiplus {

    public static void main(String[] args) {
        int numero = 25;
        int contadorMultiplus = 0;
        System.out.println("Multiplus do número "+ numero +" entre 1 a 1000");
        System.out.println("======================================");
        for(int multiplicador = 0; multiplicador <= 1000; multiplicador++){
            if(multiplicador % numero == 0){
                System.out.print(multiplicador + ",");
                contadorMultiplus++;
            }
        }
        System.out.println();
        System.out.println("Existem " + contadorMultiplus + " multiplos de " + numero +" entre os números  1 e 1000");
    }
}
