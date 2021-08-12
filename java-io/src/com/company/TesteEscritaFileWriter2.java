package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaFileWriter2 {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("Positivo2.txt");

        ps.println("É só isso, não tem mais jeito, acabou!");
        ps.println();
        ps.println();
        ps.print("Boa sorte!");

        ps.close();
    }
}