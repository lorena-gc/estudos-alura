package com.lorenagomes.teste;

import com.lorenagomes.conta.ContaCorrente;
import com.lorenagomes.conta.ContaPoupanca;

public class TesteContas {

    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente(1020,10210);
        ContaPoupanca cp = new ContaPoupanca(1020,10310);

        cc.deposita(200);
        cp.deposita(300);

        cc.transfere(50,cp);
        System.out.println("CC: "+cc.getSaldo());
        System.out.println("CP: "+cp.getSaldo());

        System.out.println(cc);

    }
}
