package com.company;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColletions = new Curso("Java e java-collections", "Paulo Silveira");
        System.out.println(javaColletions.getAulas());

        javaColletions.adiciona(new Aula("Revendo conceitos básicos", 21));
        javaColletions.adiciona(new Aula("Criando uma Aula", 20));
        javaColletions.adiciona(new Aula("Modelando com coleções", 16));

        System.out.println(javaColletions.getAulas());
        System.out.println(javaColletions.getTempoTotal());
    }
}
