package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class TestaMap {

    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 25);
        nomesParaIdade.put("Lorena",31);
        nomesParaIdade.put("Beatriz", 22);
        nomesParaIdade.put("Carlos", 56);

        nomesParaIdade.keySet().forEach(System.out::println);

        nomesParaIdade.values().forEach(System.out::println);

        Set<Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Map.Entry<String,Integer> associacao:associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}
