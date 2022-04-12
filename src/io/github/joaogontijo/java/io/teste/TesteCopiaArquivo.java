package io.github.joaogontijo.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteCopiaArquivo {
	public static void main(String[] args) throws IOException {
		
        FileWriter fw = new FileWriter("escrita.txt");
        
        fw.write("Sobrescrevendo o arquivo com fileWriter");
        fw.write(System.lineSeparator());
        fw.write("Nova linha");
        
        fw.close();
	}
}
