package com.lorenagomes;

public class TesteFatorial {

    public static void main(String[] args) {
        int numero = 8;
        int fatorial = 1;
        System.out.print("Fatorial de "+numero+ "! = ");
        for (int contador = 1; contador <= numero; contador++){
            fatorial = fatorial * contador;
            System.out.print(contador);
            if(contador<numero){
                System.out.print(" x ");
            } else {
                System.out.println(" = "+fatorial);
            }
        }
    }
}
