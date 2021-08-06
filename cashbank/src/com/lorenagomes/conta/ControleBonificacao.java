package com.lorenagomes.conta;

import com.lorenagomes.funcionarios.Funcionario;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return this.soma;
    }
}
