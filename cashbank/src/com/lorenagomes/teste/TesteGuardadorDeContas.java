package com.lorenagomes.teste;

import com.lorenagomes.modelo.Conta;
import com.lorenagomes.conta.ContaCorrente;
import com.lorenagomes.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc1 = new ContaCorrente(22,12);
        guardador.adiciona(cc1);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
