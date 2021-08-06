package com.lorenagomes;

public class TestePilha {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        MinhaExcecao ex = new MinhaExcecao("Testando erro");
        throw ex;
        //System.out.println("Fim do metodo2");
    }
}
