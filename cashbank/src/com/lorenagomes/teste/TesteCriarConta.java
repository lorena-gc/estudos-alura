package com.lorenagomes.teste;

import com.lorenagomes.conta.Cliente;
import com.lorenagomes.modelo.Conta;
import com.lorenagomes.conta.ContaCorrente;

public class TesteCriarConta{

    public static void main(String[] args) throws Exception{
        Conta primeiraConta = new ContaCorrente(1232, 0001);
        Conta segundaConta = new ContaCorrente(1232, 0002);
        primeiraConta.deposita(1000);

        System.out.println(primeiraConta.getSaldo());

        primeiraConta.saca(100);
        primeiraConta.transfere(400,segundaConta);

        System.out.println("O saldo da primeira conta é " + primeiraConta.getSaldo());
        System.out.println("O saldo da segunda conta é " + segundaConta.getSaldo());

        Cliente lorena = new Cliente();
        lorena.setNome("Lorena Gomes");
        lorena.setCpf("222.222.222-22");
        lorena.setProfissao("desenvolvedora");
        lorena.getEndereco().setLogadouro("Avenida Corsanto");
        lorena.getEndereco().setNumero(164);
        lorena.getEndereco().setComplemento("D101");
        lorena.getEndereco().setCep("29.162-206");
        lorena.getEndereco().setBairro("Residencial Vista do Mestre");

        System.out.println(lorena.getEndereco().getLogadouro() +", " + lorena.getEndereco().getNumero() +", "
                +lorena.getEndereco().getComplemento() +", " + lorena.getEndereco().getBairro() +", " + lorena.getEndereco().getCep());
    }
}
