package io.github.joaogontijo.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("escrita.txt");

		pw.println("Sobrescrevendo o arquivo com printwriter");
		pw.println("Nova linha");

		pw.close();
	}
}
