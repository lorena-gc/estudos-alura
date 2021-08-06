package com.lorenagomes.modelo;

public class SaldoInsulficienteException extends Exception{

    public SaldoInsulficienteException(String mensagem){
        super(mensagem);
    }
}
