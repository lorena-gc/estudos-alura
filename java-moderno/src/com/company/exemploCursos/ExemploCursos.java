package com.company.exemploCursos;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {

    public static void main(String[] args) {
        List<Cursos> cursos = new ArrayList<Cursos>();
        cursos.add(new Cursos("Python", 45));
        cursos.add(new Cursos("JavaScript", 150));
        cursos.add(new Cursos("Java 8", 113));
        cursos.add(new Cursos("C", 55));

        cursos.sort(Comparator.comparing(Cursos::getAlunos));
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println();

        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));

        System.out.println();

        cursos.stream().filter(c -> c.getAlunos() >= 100).map(Cursos::getAlunos).forEach(System.out::println);

        int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Cursos::getAlunos).sum();

        System.out.println(sum);
        System.out.println();

        cursos.stream().filter(c -> c.getAlunos() >= 50).forEach(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));

        List<Cursos> listaCurso = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap( c -> c.getNome(), c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos matriculados."));

        OptionalDouble mediaDeAlunos = cursos.stream().mapToInt(Cursos::getAlunos).average();
        System.out.println(mediaDeAlunos);
    }
}
