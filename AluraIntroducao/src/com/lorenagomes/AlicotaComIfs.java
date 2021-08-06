package com.lorenagomes;

public class AlicotaComIfs {

    public static void main(String[] args) {
        double salario = 2300.0;

        if(salario > 1900.0 && salario <= 2800.0){
            System.out.println("O IR é de 7.5%");
            System.out.println("Você pode deduzir na declaração o valor de R$142");
        } else if(salario > 2800.01 && salario <= 3751.0) {
            System.out.println("O IR é de 15%");
            System.out.println("Você pode deduzir na declaração o valor de R$350");
        } else if (salario > 3751.01 && salario <= 4664.0){
            System.out.println("O IR é de 22.5%");
            System.out.println("Você pode deduzir na declaração o valor de R$636");
        }
    }
}
