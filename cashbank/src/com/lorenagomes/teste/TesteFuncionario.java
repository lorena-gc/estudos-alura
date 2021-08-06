package com.lorenagomes.teste;

import com.lorenagomes.funcionarios.Designer;
import com.lorenagomes.funcionarios.Funcionario;
import com.lorenagomes.funcionarios.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario auxiliar = new Designer();
        auxiliar.setNome("Aline Norman");
        auxiliar.setCpf("000.222.333-01");
        auxiliar.setSalario(2000.00);

        System.out.println("Funcionario: "+ auxiliar.getNome());
        System.out.println("Sua bonificacao é de "+ auxiliar.getBonificacao());

        Gerente gerente = new Gerente();
        gerente.setNome("Ruan Carlos");
        gerente.setCpf("111.222.333-00");
        gerente.setSalario(4500.0);
        Boolean autenticacao = gerente.autentica(0);

        System.out.println("Funcionario: "+ gerente.getNome());
        System.out.println(autenticacao);
        System.out.println("Sua bonificacao é de "+ gerente.getBonificacao());
    }
}
