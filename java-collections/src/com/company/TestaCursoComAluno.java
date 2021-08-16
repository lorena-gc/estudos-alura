package com.company;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColletions = new Curso("Java e java-collections", "Paulo Silveira");

        javaColletions.adiciona(new Aula("Revendo conceitos básicos", 21));
        javaColletions.adiciona(new Aula("Criando uma Aula", 20));
        javaColletions.adiciona(new Aula("Modelando com coleções", 16));

        Aluno a1 = new Aluno("Rodrigo Turini", 3301);
        Aluno a2 = new Aluno("Guilherme Silveira", 3302);
        Aluno a3 = new Aluno("Maria Aniche", 3303);

        javaColletions.matricula(a1);
        javaColletions.matricula(a2);
        javaColletions.matricula(a3);

        System.out.println("Alunos matriculados");
        javaColletions.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("Verificando se o aluno "+ a1);
        System.out.println(javaColletions.estaMatriculado(a1));

        Aluno aluno1 = javaColletions.buscaMatriculado(3302);
        System.out.println(aluno1);
    }
}
