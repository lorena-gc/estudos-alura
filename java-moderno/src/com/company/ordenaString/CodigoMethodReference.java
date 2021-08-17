package com.company.ordenaString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CodigoMethodReference {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Possible");
        palavras.add("Code Like a Possible Girl");
        palavras.add("Se candidate, Mulher!");
        palavras.add("Elas Programam");

        palavras.forEach(System.out::println);

        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras);
    }
}