package com.company.exemploCursos;

public class Cursos {

    private String nome;
    private int alunos;

    public Cursos(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public int getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }
}
