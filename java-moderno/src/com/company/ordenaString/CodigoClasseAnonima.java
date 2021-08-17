package com.company.ordenaString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class CodigoClasseAnonima {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Possible");
        palavras.add("Code Like a Possible Girl");
        palavras.add("Se candidate, Mulher!");
        palavras.add("Elas Programam");

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        palavras.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() < s2.length())
                    return -1;
                if(s1.length() > s2.length())
                    return 1;
                return 0;
            }
        });
        System.out.println(palavras);
    }
}