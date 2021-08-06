package com.lorenagomes.conta;

import com.lorenagomes.modelo.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
