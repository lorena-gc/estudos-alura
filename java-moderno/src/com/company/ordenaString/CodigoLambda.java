package com.company.ordenaString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class CodigoLambda {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Possible");
        palavras.add("Code Like a Possible Girl");
        palavras.add("Se candidate, Mulher!");
        palavras.add("Elas Programam");

        palavras.forEach(s -> System.out.println(s));

        //Abaixo já é uma lambda porém ainda não está interessante, pois o lambda se encaixa melhor
        //quando a expressão dentro do bloco é mais curta (como na linha 30 e 31)
        /**palavras.sort((s1, s2) -> {
                if(s1.length() < s2.length())
                    return -1;
                if(s1.length() > s2.length())
                    return 1;
                return 0;
        });*/

        //palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.sort(Comparator.comparing(s -> s.length()));

        System.out.println(palavras);
    }
}