package com.lorenagomes;

public class TesteTabuada {

    public static void main(String[] args) {
        int numero = 8;
        System.out.println("Tabuada do número "+ numero);
        System.out.println("======================");
        for(int multiplicador = 0; multiplicador <= 10; multiplicador++){
                System.out.print (numero +" * " +multiplicador +" = ");
                System.out.println(multiplicador*numero);
        }
    }
}
