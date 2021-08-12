package com.company;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        InputStream fis = System.in;//new FileInputStream("Positivo.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("Positivo2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        br.close();
        bw.close();
    }
}