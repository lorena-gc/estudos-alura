package com.lorenagomes.teste;

import com.lorenagomes.modelo.CalculadorDeImposto;
import com.lorenagomes.conta.ContaCorrente;
import com.lorenagomes.conta.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.print(calc.getTotalImposto());

    }
}
