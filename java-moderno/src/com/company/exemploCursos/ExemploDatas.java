package com.company.exemploCursos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExemploDatas {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        LocalDate futureDate = LocalDate.of(2099,01,25);

        Period periodo = Period.between(agora, futureDate);
        System.out.println(periodo);

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(formatar.format(agora));
    }
}
