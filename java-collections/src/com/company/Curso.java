package com.company;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor){
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo.");
        }
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    @Override
    public boolean equals(Object obj) {
       Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    public Aluno buscaMatriculado(int matricula) {
        return this.matriculaParaAluno.get(matricula);
    }
}
