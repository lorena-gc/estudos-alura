package com.company;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada via arquivo
        InputStream fis = new FileInputStream("Positivo.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        br.close();

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
    }
}
