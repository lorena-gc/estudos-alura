package com.lorenagomes.funcionarios;

import com.lorenagomes.modelo.AutenticacaoUtil;
import com.lorenagomes.modelo.Autenticavel;

public class Designer extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public double getBonificacao(){
        return 200.00;
    }

    public Designer(){
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
