package io.github.joaogontijo.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteScannerEncoding {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();
			
            String valorFormatado = String.format(new Locale("pt", "BR"), "%s, Agência: %d, Número: %d, Titular: %s, Saldo: %.2f", tipoConta, agencia, numero, titular, saldo);
    		System.out.println(valorFormatado);
            linhaScanner.close();
		}
		
		scanner.close();
	}
}
