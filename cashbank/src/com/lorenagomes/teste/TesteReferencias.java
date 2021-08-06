package com.lorenagomes.teste;

import com.lorenagomes.conta.ControleBonificacao;
import com.lorenagomes.funcionarios.Desenvolvedor;
import com.lorenagomes.funcionarios.Designer;
import com.lorenagomes.funcionarios.Funcionario;
import com.lorenagomes.funcionarios.Gerente;

public class TesteReferencias {

    public static void main(String[] args) {

        Funcionario dev = new Desenvolvedor();
        Funcionario des = new Designer();
        Funcionario ger = new Gerente();

        dev.setNome("João Paulo");
        dev.setSalario(3000);
        System.out.println("A bonificacao do Desenvolvedor é "+dev.getBonificacao());

        des.setNome("Maria Helena");
        des.setSalario(2200);
        System.out.println("A bonificacao do Designer é "+des.getBonificacao());

        ger.setNome("Renato Ribeiro");
        ger.setSalario(6000);
        System.out.println("A bonificacao do Gerente é "+ger.getBonificacao());

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(dev);
        controle.registra(des);
        controle.registra(ger);

        System.out.println(controle.getSoma());

    }
}
