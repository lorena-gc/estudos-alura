package com.lorenagomes.conta;

import com.lorenagomes.modelo.Conta;
import com.lorenagomes.modelo.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public void saca(double valor) throws Exception{
        double valorComTaxa = valor + 0.2;
        super.saca(valorComTaxa);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
