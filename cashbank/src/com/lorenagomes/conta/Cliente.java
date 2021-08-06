package com.lorenagomes.conta;

import com.lorenagomes.modelo.Endereco;
import com.lorenagomes.modelo.AutenticacaoUtil;
import com.lorenagomes.modelo.Autenticavel;

public class Cliente implements Autenticavel {

    private String nome;
    private String cpf;
    private String profissao;
    private AutenticacaoUtil autenticador;
    Endereco endereco = new Endereco();

    public Cliente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticador.autentica(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
