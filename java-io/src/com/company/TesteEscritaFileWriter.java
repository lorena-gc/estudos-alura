package com.company;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("Positivo2.txt"));

        bw.write("Seja gentil!");
        bw.newLine();
        bw.newLine();
        bw.write("A soma dos quadrados dos catetos é igual a hipotenusa");

        bw.close();
    }
}