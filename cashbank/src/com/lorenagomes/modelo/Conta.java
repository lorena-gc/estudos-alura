package com.lorenagomes.modelo;

import com.lorenagomes.conta.Cliente;

public abstract class Conta implements Comparable<Conta>{

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta( int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta " + this.numero + " na agência " + agencia);
        System.out.println("Total de contas é " + total);
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor) throws Exception{
        if (this.saldo < valor){
            throw new SaldoInsulficienteException("Saldo: " + this.saldo +", Valor a sacar:"+ valor);
        } else{
            this.saldo -= valor;
        }
    }
    public void transfere(double valor, Conta destino) throws Exception{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Agência incorreta, agência não pode ter valor <= 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Número incorreto, número não pode ter valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object ref){
        Conta outraConta = (Conta) ref;
        if(this.agencia != outraConta.agencia) {
            return false;
        }
        if(this.numero != outraConta.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular.getNome() +
                '}';
    }
    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }
}
