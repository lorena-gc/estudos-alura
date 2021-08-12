package com.company;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída via arquivo
        OutputStream fos = new FileOutputStream("Positivo2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Seja gentil!");
        bw.newLine();
        bw.newLine();
        bw.write("A soma dos quadrados dos catetos é igual a hipotenusa");

        bw.close();
    }
}