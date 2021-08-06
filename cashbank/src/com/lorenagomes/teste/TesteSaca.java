package com.lorenagomes.teste;

import com.lorenagomes.conta.Conta;
import com.lorenagomes.conta.ContaCorrente;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,1020);
        conta.deposita(300);
        try {
            conta.saca(400);
        }catch (Exception ex){
            System.out.println("Saque não realizado - " + ex.getMessage());
        }
        System.out.println("Saldo CC: " + conta.getSaldo());
    }
}
