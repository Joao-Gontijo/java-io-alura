package io.github.joaogontijo.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamWriter {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("escrita.txt");

		ps.println("Sobrescrevendo o arquivo com printstream");
		ps.println("Nova linha");

		ps.close();
	}
}
