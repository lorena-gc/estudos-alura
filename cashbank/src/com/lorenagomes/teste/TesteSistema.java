package com.lorenagomes.teste;

import com.lorenagomes.funcionarios.Gerente;
import com.lorenagomes.modelo.SistemaInterno;

public class TesteSistema {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2132);

        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
    }
}
