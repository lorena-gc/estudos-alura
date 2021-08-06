package com.lorenagomes.funcionarios;

import com.lorenagomes.modelo.AutenticacaoUtil;
import com.lorenagomes.modelo.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public double getBonificacao(){
        return super.getSalario();
    }

    public Gerente(){
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
}
